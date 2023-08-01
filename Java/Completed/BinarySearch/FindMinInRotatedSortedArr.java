package Completed.BinarySearch;

//Submission: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/1006568927/

public class FindMinInRotatedSortedArr {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 1, 2 };
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        int low = 0, high = nums.length - 1, mid = 0, res = nums[0];
        while (low <= high) {
            // If current pointers are in a sorted subarray update the min
            if (nums[low] < nums[high]) {
                res = Math.min(res, nums[low]);
                break;
            }
            mid = low + (high - low) / 2;
            res = Math.min(res, nums[mid]);
            // Lies in the left sorted portion
            if (nums[mid] >= nums[low])
                low = mid + 1;
            // Lies in the right sorted portion
            else
                high = mid - 1;
        }
        return res;
    }
}
