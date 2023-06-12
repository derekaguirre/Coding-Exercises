package Progress;

class MergeSortedArray {

    //Submission: https://leetcode.com/submissions/detail/892522990/
    public static void main(String[] args) {
        // int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int[] arr1 = { 1, 0 };

        int m = 1;

        // int[] arr2 = { 2, 5, 6 };
        int[] arr2 = { 2 };
        int n = 1;

        merge(arr1, m, arr2, n);

    }

    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        int mPointer = m - 1;
        int arr1Len = arr1.length - 1;
        int nPointer = n - 1;

        // return if arr1 is the only non empty array
        // or if both arrays are empty
        if (n == 0) {
            return;
        }
        if (m == 0 && n != 0) {
            arr1[0] = arr2[0];
        }

        // loop by the smaller array
        while (mPointer >= 0) {

            // if second array's element is bigger
            if (nPointer >-1 && arr2[nPointer] > arr1[mPointer]) {
                // move biggest element in 2nd array to end of the 1st array
                arr1[arr1Len] = arr2[nPointer];
                arr1Len--;
                nPointer--;
            }
            // if first array's element is bigger
            if (nPointer > -1 && arr1[mPointer] >= arr2[nPointer]) {
                // move biggest element of 1st array to the end of the same array
                arr1[arr1Len] = arr1[mPointer];
                arr1Len--;
                mPointer--;
            }

        }
    }
}