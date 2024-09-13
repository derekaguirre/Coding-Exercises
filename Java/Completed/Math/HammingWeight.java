package Completed.Math;

//Submission: https://leetcode.com/problems/number-of-1-bits/submissions/1388692454

public class HammingWeight {
    public static void main(String[] args) {
        // System.out.println(hammingWeight(1525));
        System.out.println(hammingWeight(2147483647));
    }
    public static int hammingWeight(int n) {
        //first convert to binary
        int total = n;
        int hammingWeight = 0;

        while (total > 0) {
            if(total % 2 == 1){
                hammingWeight++;
            }
            total = total / 2;
        }
        return hammingWeight;
    }
}
