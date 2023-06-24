package Completed;
import java.util.Stack;

//Submission: https://leetcode.com/problems/valid-parentheses/submissions/951959449/
//Submission2: https://leetcode.com/problems/valid-parentheses/submissions/978299273/

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

    //Attempt 2
    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            // If opening bracket is found, push
            if (charArr[i] == '{' || charArr[i] == '(' || charArr[i] == '[')
                stack.push(charArr[i]);
            else if (charArr[i] == '}' && !stack.empty() && stack.peek() == '{')
                stack.pop();
            else if (charArr[i] == ')' && !stack.empty() && stack.peek() == '(')
                stack.pop();
            else if (charArr[i] == ']' && !stack.empty() && stack.peek() == '[')
                stack.pop();
            else
                return false;
        }
        return stack.empty();
    }
}