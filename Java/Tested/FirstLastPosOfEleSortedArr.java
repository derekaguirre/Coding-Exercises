package Tested;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
//Submission: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/948804727/

public class FirstLastPosOfEleSortedArr {

    // define low and high variables
    // calculate mid
    // if target is less than mid, set the high to mid-1 and recalculate mid
    // if target is higher than mid, set low to mid+1 and recalculate mid
    // put inside of loop that iterates through the length of the arr
    public static int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int[] positions = { -1, -1 };
        
        // int[] input = { 5, 7, 7, 8, 8, 10 };
        while (low <= high) {
            int mid = (high + low) / 2;
            // if target is found update the corresponding position with the
            if (target == nums[mid]) {
                positions[0] = mid;
                high = mid - 1;
            } 
            // if target is less than mid and otherwise if its greater than mid
            if (target < nums[mid]) {
                high = mid - 1;
            }
            else if (target > nums[mid]){
                low = mid + 1;
            }
        }
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            // if target is found update the corresponding position with the
            if (target == nums[mid]) {
                positions[1] = mid;
                low = mid + 1;
            } 
            // if target is less than mid and otherwise if its greater than mid
            if (target < nums[mid]) {
                high = mid - 1;
            }
            else if (target > nums[mid]){
                low = mid + 1;
            }
        }

        return positions;
    }

    // TESTS

    // @Test
    // public void myTest() {
    //     int[] input = { 1, 2, 3, 4, 5, 6, 7, 8 };
    //     int target = 7;
    //     int[] expected = { 3, 4 };
    //     assertArrayEquals(expected, searchRange(input, target));
    // }

    @Test
    public void testCase1() {
        int[] input = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] expected = { 3, 4 };
        assertArrayEquals(expected, searchRange(input, target));
    }

    @Test
    public void testCase2() {
        int[] input = { 5, 7, 7, 8, 8, 10 };
        int target = 6;
        int[] expected = { -1, -1 };
        assertArrayEquals(expected, searchRange(input, target));
    }

    @Test
    public void testCase3() {
        int[] input = {};
        int target = 0;
        int[] expected = { -1, -1 };
        assertArrayEquals(expected, searchRange(input, target));
    }

    @Test
    public void testCase4() {
        int[] input = {1};
        int target = 1;
        int[] expected = { 0, 0 };
        assertArrayEquals(expected, searchRange(input, target));
    }

    @Test
    public void testCase5() {
        int[] input = {1,3};
        int target = 1;
        int[] expected = { 0, 0 };
        assertArrayEquals(expected, searchRange(input, target));
    }
}
