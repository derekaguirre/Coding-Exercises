package Completed.Stack;

import java.util.Stack;

//Submission: https://leetcode.com/problems/asteroid-collision/submissions/1096911136/

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = { 5, 10, -5 };
        asteroidCollision(asteroids);
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < asteroids.length; i++) {
            // If positive, add to stack
            int curr = asteroids[i];
            if (curr > 0) {
                stack.push(curr);
            }
            // Curr is negative, process data
            else {
                // Destroy: stack must contain a positive, and be smaller size than negative
                // asteroid
                // Destroy both asteroids of the same size
                // If there are more negatives than positives add to stack until done
                while (stack.size() > 0 && stack.peek() > 0 && stack.peek() < Math.abs(asteroids[i]))
                    stack.pop();

                if (stack.size() == 0 || stack.peek() < 0) {
                    stack.push(asteroids[i]);
                } else if (stack.peek() == Math.abs(asteroids[i])) {
                    stack.pop();
                }
            }
        }
        int[] ans = new int[stack.size()];
        int i = stack.size() - 1;

        while (!stack.isEmpty()) {
            ans[i] = stack.peek();
            i--;
            stack.pop();
        }
        return ans;
    }
}
