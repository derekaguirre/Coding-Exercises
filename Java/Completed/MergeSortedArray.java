package Completed;
// Submission: https://leetcode.com/problems/merge-sorted-array/submissions/972411632/

class MergeSortedArray {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int[] arr2 = { 2, 5, 6 };
        int m = 3;
        int n = 3;

        // int[] arr1 = {1};
        // int[] arr2 = {};
        // int m = 1;
        // int n = 0;

        // int[] arr1 = {0};
        // int[] arr2 = {1};
        // int m = 1;
        // int n = 0;

        merge(arr1, m, arr2, n);

    }

    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        int l1Len = m - 1; // length of the nonzero first list
        int l2Len = n - 1; // length of the second list
        int mergeLen = m + n - 1; // length of the list

        while (l2Len >= 0) {
            // If arr2 contains bigger element then merge it and move positions
            if (l1Len >= 0 && arr1[l1Len] > arr2[l2Len])
                arr1[mergeLen--] = arr1[l1Len--];
            // If arr1 has a bigger or same element as arr2 then move it up in the list
            else {
                arr1[mergeLen--] = arr2[l2Len--];
            }

        }
    }
}