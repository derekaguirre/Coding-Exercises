package Completed.BinarySearch;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        // int[] nums1 = { 1, 3 }, nums2 = { 2 };
        int[] nums1 = { 1, 2 }, nums2 = { 3, 4 };

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    //O(n log (n)) Can be optimized
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] res = new int[nums1.length + nums2.length];
        int resIter = 0;
        // Write arrays into res
        int pointer1 = 0;
        int pointer2 = 0;
        // Merge both arrays into the result array
        while (resIter < res.length) {
            // Iterate through both arrays
            if (pointer1 < nums1.length) {
                res[resIter] = nums1[pointer1];
                pointer1++;
                resIter++;
            }
            if (pointer2 < nums2.length) {
                res[resIter] = nums2[pointer2];
                pointer2++;
                resIter++;
            }
        }
        // If even, sort the result array to work with it further
        Arrays.sort(res);
        // If the array is odd, return the middle point
        if (res.length % 2 == 1)
            return (double) res[res.length / 2];

        // Reset pointers and calculate median
        pointer1 = 0;
        pointer2 = res.length - 1;
        double median = 0;
        while (pointer1 < pointer2) {
            median = (res[pointer1++] + res[pointer2--]) / 2.0;
        }
        return median;
    }

}
