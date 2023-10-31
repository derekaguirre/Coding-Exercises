package Completed.BinarySearch;

//Submission: https://leetcode.com/problems/search-insert-position/submissions/979736080/

public class SearchInsertPosition {
    // given a sorted array of distinct ints, and a target
    // return the index if the target is found. if not return the index where it
    // would be if it were inserted in order
    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return mid;
            // if target is smaller than the mid cut the second half of the list
            else if (nums[mid] > target)
                high = mid - 1;
            // Otherwise cut the first half of the input array
            else
                low = mid + 1;
        }
        return low;
    }

}
