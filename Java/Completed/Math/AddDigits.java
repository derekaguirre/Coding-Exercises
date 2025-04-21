package Completed.Math;

//Submission 1: https://leetcode.com/problems/add-digits/submissions/1612160089
//Submission 2: https://leetcode.com/problems/add-digits/submissions/1613253731
public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigitsNaive(38));
    }
    public static int addDigitsNaive(int num) {
        //start the program from the number that was provided to us
        int result = num;
        //keep evaluating until the result is a single digit
        String conv = "";
        while(result > 9){
            //convert the dynamic result to a string for repeat processing
            conv = Integer.toString(result);
            //Add the digits together
            int tmp = 0;
            for(int iter = 0; iter < conv.length(); iter++){
                tmp += conv.charAt(iter)-'0';
            }
            result = tmp;
            tmp = 0;
        }
        return result;
    }
    
    // Optimal solution using digital root concept
    public static int addDigits(int num) {
        if(num == 0)
            return 0;
        else if(num % 9 == 0)
            return 9;
        else
            return num % 9;
    }
}
