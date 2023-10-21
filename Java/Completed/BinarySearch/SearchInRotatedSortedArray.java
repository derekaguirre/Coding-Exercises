package Completed.BinarySearch;

//Submissions: https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1008122399/

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        // System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
        // System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3));
        // System.out.println(search(new int[] { 1 }, 0));
        System.out.println(search(new int[] { 3, 1 }, 3));
    }

    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;

            // Found
            if (target == nums[mid])
                return mid;
            // Lies in the left sorted portion
            if (nums[low] <= nums[mid]) {
                // If target is bigger than mid or smaller than left side of the subarray
                if (target > nums[mid] || target < nums[low])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            // Lies in the right sorted portion
            else{
                if(target < nums[mid] || target > nums[high])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }
}
