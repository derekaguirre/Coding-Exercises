package Completed;

import java.util.Stack;

//Submission: https://leetcode.com/problems/min-stack/submissions/992956398/

public class MinStack {
    private int min = Integer.MAX_VALUE;
    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<Integer>();
    }

    // Push old min to keep track of the min at any given point in the stack
    // Update the min val then push the updated min
    // Input: 1, -3, 5, -2, -5
    // Output: (MAX_VALUE, 1, 1, -3, 5, -2, -3, -5)
    public void push(int val) {
        if (val <= min) {
            stack.push(min);
            min = val;
        }
        stack.push(val);
    }

    // If pop results in changing of the curr min
    // Pop twice and change the current min to the last min val
    public void pop() {
        if (stack.pop() == min)
            min = stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
