package Completed;

import java.util.ArrayList;
import java.util.List;

//Submission: https://leetcode.com/problems/generate-parentheses/submissions/994434469/

public class GenerateParentheses {
    public static void main(String[] args) {
        generateParenthesis(3);
    }

    //Backtracking recursive solution
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        helper(list, "", n, n);
        return list;
    }
    public static void helper(List<String> res, String s, int open, int close) {
        // Base case when all parenthesis are exhausted
        if (open == 0 && close == 0) {
            res.add(s);
            return;
        }
        // If we still have opening parenthesis to add
        if (open > 0)
            helper(res, s + "(", open - 1, close);
        // Only add a closing parenthesis if its count is less than opening count
        if (open < close)
            helper(res, s + ")", open, close - 1);
    }
}
