package Completed.Stack;

import java.util.Stack;

//Submission: https://leetcode.com/problems/implement-queue-using-stacks/submissions/1175884643

public class ImplementStackUsingQueues {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> fakeQueue = new Stack<Integer>();

    public static void main(String[] args) {

    }

    public ImplementStackUsingQueues() {

    }

    public void push(int x) {
        // queue is not empty push all contents back to stack
        while (!fakeQueue.isEmpty()) {
            stack.push(fakeQueue.pop());
        }
        // push normally
        stack.push(x);
        // empty stack back into fake queue
        while (!stack.isEmpty()) {
            fakeQueue.push(stack.pop());
        }
    }

    public int pop() {
        return fakeQueue.pop();
    }

    public int peek() {
        return fakeQueue.peek();
    }

    public boolean empty() {
        return fakeQueue.isEmpty() ? true : false;
    }
}
