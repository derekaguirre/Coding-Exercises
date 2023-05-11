package Completed;

//Submission: https://leetcode.com/submissions/detail/921226541/

public class PlusOne {
    public static void main(String[] args) {
        // int[] a = {1,2,3};
        // int[] b = {9,8,7,6,5,4,3,2,1,0};
        int[] c = {9,9,0,9,9,9,9,9,9,9};

        
        //run through array backwards set carry flag if carry stops at 0 then resize
        plusOne(c);
    }

    public static int[] plusOne(int[] digits) {
        int cf = 1;
        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] == 9 && cf == 1){
                digits[i] = 0;
            }
            else if(cf == 1){
                digits[i] += 1;
                cf = 0;
            }
        }
        if(cf == 1){
            int[] resultAdd = new int[digits.length+1];
            resultAdd[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                resultAdd[i+1] = digits[i];
            }
            return resultAdd;
        }
        
        return digits;
    }

}
