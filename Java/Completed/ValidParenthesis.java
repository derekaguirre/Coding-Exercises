package Completed;
import java.util.Stack;

//Submission: https://leetcode.com/problems/valid-parentheses/submissions/951959449/

public class ValidParenthesis {
    public static void main(String[] args) {
        String input = "asda()afgasd";
        System.out.println(isValid(input));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char iter : s.toCharArray()) {
            if (iter == '(' || iter == '{' || iter == '[')
                stack.push(iter);
            else if (iter == ')' && !stack.empty() && stack.peek() == '(')
                stack.pop();
            else if (iter == '}' && !stack.empty() && stack.peek() == '{')
                stack.pop();
            else if (iter == ']' && !stack.empty() && stack.peek() == '[')
                stack.pop();
            else
                return false;
        }
        return stack.empty();
    }
}