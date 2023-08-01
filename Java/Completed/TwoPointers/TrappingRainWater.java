package Completed.TwoPointers;


//Submission: https://leetcode.com/problems/trapping-rain-water/submissions/1004960388/

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("FINAL EVAL: " + trap(height));
    }
    public static int trap(int[] height) {
        int totalWater = 0;
        int left = 0, right = height.length-1;
        int leftMax = height[left], rightMax = height[right];

        while(left<right){
            if(leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax, height[left]);
                totalWater += leftMax - height[left];
            }
            else{
                right--;
                rightMax = Math.max(rightMax, height[right]);
                totalWater += rightMax - height[right];
            }
        }
        return totalWater;
    }
}
