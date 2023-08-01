package Completed.TwoPointers;

//Submission: https://leetcode.com/problems/container-with-most-water/submissions/1004929122/

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
    }

    public static int maxArea(int[] height) {
        int max = 0, area = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            if (height[left] <= height[right]) {
                area = height[left] * (right - left);
                left++;
            } else {
                area = height[right] * (right - left);
                right--;
            }
            max = Math.max(max, area);
        }
        return max;
    }
}
