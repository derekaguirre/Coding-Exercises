package Completed.BinarySearch;
//Submission: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/submissions/982699374/

public class SearchRotatedArray {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            // If found sorted
            if (nums[low] < nums[high]) {
                return mid;
            }
            // If not in sorted subarray
            if (nums[mid] >= nums[low])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
