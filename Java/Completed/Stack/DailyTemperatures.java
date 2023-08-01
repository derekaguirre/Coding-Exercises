package Completed.Stack;

import java.util.Stack;

//Submission: https://leetcode.com/problems/daily-temperatures/submissions/995162422/

public class DailyTemperatures {
    public static void main(String[] args) {
        // int[] input = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int[] input = { 89, 62, 70, 58, 47, 47, 46, 76, 100, 70 };
        
        dailyTemperatures(input);
    }

    //Monotonic Stack
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] res = new int[temperatures.length];

        for (int i = res.length - 1; i >= 0; i--) {
            //Current temp is bigger than top of stack, pop until equal/greater val is found or stack empties
            //If the current temp is smaller, do nothing, it will get pushed to the stack at the end of the loop
            while (!stack.empty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            // If stack is not empty then a valid warmer temp exists, record dist
            if (!stack.empty()) {
                res[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return res;
    }
}
