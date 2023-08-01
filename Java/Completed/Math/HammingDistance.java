package Completed.Math;

//Submission: https://leetcode.com/submissions/detail/937616231/

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        String binaryX = Integer.toBinaryString(x);
        String binaryXFormat = String.format("%32s", binaryX).replaceAll(" ", "0");

        String binaryY = Integer.toBinaryString(y);
        String binaryYFormat = String.format("%32s", binaryY).replaceAll(" ", "0");

        int distance = 0;
        
        for(int i = 0; i <= binaryXFormat.length()-1; i++){
            if(binaryXFormat.charAt(i) != (binaryYFormat.charAt(i))){
                distance++;
            }
        }
        return distance;
    }
}
