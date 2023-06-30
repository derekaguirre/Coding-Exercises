package Completed;

import java.util.Arrays;

//Submission: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/submissions/982699374/

public class SearchRotatedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1}, 1));
    }
    public static boolean search(int[] nums, int target) {
        Arrays.sort(nums); //reset the pivot O(n * log(n))

        //Binary Search: O(log(n))
        int low = 0, high = nums.length-1;

        while(low <= high){
           int mid = low + (high-low)/2;

           if(nums[mid] == target){
            return true;
           } else if(target > nums[mid]){
            low = mid+1;
           } else{
            high = mid-1;
           }
        }
        return false;
    }
}
