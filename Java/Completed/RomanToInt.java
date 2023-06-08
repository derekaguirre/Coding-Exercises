package Completed;

//Submission: https://leetcode.com/problems/roman-to-integer/submissions/966463423/

class RomanToInt {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));

    }
    public static int romanToInt(String s) {
        int solution = 0, intConversion = 0;
        //Run backwards through string to make addition easier
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    intConversion = 1;
                    break;
                case 'V':
                    intConversion = 5;
                    break;
                case 'X':
                    intConversion = 10;
                    break;
                case 'L':
                    intConversion = 50;
                    break;
                case 'C':
                    intConversion = 100;
                    break;
                case 'D':
                    intConversion = 500;
                    break;
                case 'M':
                    intConversion = 1000;
                    break;
            }
            if (4 * intConversion < solution)
                solution = solution - intConversion;
            else
                solution = solution + intConversion;
        }
        return solution;
    }

}