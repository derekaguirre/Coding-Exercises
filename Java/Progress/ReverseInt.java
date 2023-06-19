package Progress;

import java.util.Stack;

//Problem: https://leetcode.com/problems/reverse-integer/

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
        
        //Return if the string is only 1 number
        if(intStr.length() == 1)
            return x;

        // check if the first char is a negative
        int iter = 0;
        if (intStr.charAt(0) == '-') {
            stringBuilder.append('-');
            iter++;
        }

        // Iterate through and push to a stack
        Stack<Character> stack = new Stack();
        while (iter < intStr.length()) {
            stack.push(intStr.charAt(iter));
            iter++;
        }
        
        // loop a pop into string builder, ignore leading zeros
        while (!stack.isEmpty()) {
            char tmpPop = stack.pop();
            if(tmpPop == '0' && stack.pop() != 0)
                
            stringBuilder.append(stack.pop());
        }

        String resultStr = stringBuilder.toString();
        


        return Integer.parseInt(resultStr);
    }
}
