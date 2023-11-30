package Completed.BinarySearch;

//Submission: https://leetcode.com/problems/binary-search/submissions/951124849/
//Submission 2: https://leetcode.com/problems/binary-search/submissions/1169651972
public class BinarySearch {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (target == nums[mid])
                return mid;
            else if (target > nums[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public int search2(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Target is equal
            if (nums[mid] == target)
                return mid;
            // Target is smaller
            else if (target < nums[mid])
                high = mid - 1;
            // Target is greater
            else
                low = mid + 1;
        }
        return -1;
    }
}
