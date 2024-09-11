package Completed.Strings;

import java.util.Stack;

//Submission: https://leetcode.com/problems/reverse-integer/submissions/1386049442

public class ReverseInt {
    public static void main(String[] args) {
        int a = -123;
        System.out.println(reverse(a));

    }

    public static int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder();

        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
            return 0;

        // Save int as a string and create a temp string builder for further processing
        String intStr = Integer.toString(x);
        stringBuilder.append("");

        // Return if the string is only 1 number
        if (intStr.length() == 1)
            return x;

        // check if the first char is a negative
        int iter = 0;
        if (intStr.charAt(0) == '-') {
            stringBuilder.append('-');
            iter++;
        }

        // Iterate through and push to a stack
        Stack<Character> stack = new Stack<Character>();
        while (iter < intStr.length()) {
            stack.push(intStr.charAt(iter));
            iter++;
        }

        // flag to track if we've encountered the first non-zero digit
        boolean nonZeroEncountered = false;

        // loop a pop into string builder, ignore leading zeros
        while (!stack.isEmpty()) {
            char c = stack.pop();
            if (c != '0') {
                nonZeroEncountered = true;
            }
            if (nonZeroEncountered) {
                stringBuilder.append(c);
            }
        }

        String resultStr = stringBuilder.toString();

        // check if the reversed integer is within the 32-bit signed integer range
        long resultLong = Long.parseLong(resultStr);
        if (resultLong > Integer.MAX_VALUE || resultLong < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) resultLong;
    }
}
