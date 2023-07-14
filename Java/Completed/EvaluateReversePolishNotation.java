package Completed;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Stack;

//Submission: https://leetcode.com/problems/evaluate-reverse-polish-notation/submissions/993974291/

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        // String[] tokens = {"2","1","+","3","*"};
        // String[] tokens2 = {"4","13","5","/","+"};
        // String[] tokens3 = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        String[] tokens4 = {"4","3","-"};


        System.out.println("FINAL EVAL " + evalRPN(tokens4));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        Pattern regex = Pattern.compile("-?\\d+");

        for (int i = 0; i < tokens.length; i++) {
            String input = tokens[i];
            Matcher matcher = regex.matcher(input);
            // If digits, push to stack
            if (matcher.matches()) {
                stack.push(Integer.valueOf(tokens[i]));
            } else {
                // Do calculations
                int operand = stack.pop();
                switch (tokens[i]) {
                    case ("+"):
                        operand += stack.pop();
                        break;
                    case ("-"):
                        operand = stack.pop() - operand;
                        break;
                    case ("/"):
                        operand = stack.pop() / operand;
                        break;
                    case ("*"):
                        operand *= stack.pop();
                        break;

                }
                stack.push(operand);
            }
        }
        return stack.pop();
    }
}
