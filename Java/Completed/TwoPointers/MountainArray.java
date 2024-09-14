package Completed.TwoPointers;

//Submission: https://leetcode.com/problems/valid-mountain-array/submissions/1389292038

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 3, 5, 2, 1, 0};
        System.out.println(validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3)
            return false;

        int left = 0, right = arr.length-1;
        
        //Move the front pointer until there is an index higher than the current
        while(left < arr.length-1){
            if(arr[left] < arr[left+1])
                left++;
            else
                break;
        }
        //If left reaches the end with no peak then its false
        if(left == arr.length-1)
            return false;

        //Move right pointer backward until highest point is found
        while(right > 0){
            if(arr[right] < arr[right-1])
                right--;
            else
                break;
        }
        //If the right reached the beginning then it is false
        if(right == 0)
            return false;

        //If at the same position, it is true
        return left == right;
    }
}
