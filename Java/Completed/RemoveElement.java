package Completed;

//Submission: https://leetcode.com/problems/remove-element/submissions/954292661/

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        //           {0,1,3,0,4}
        int val = 2;

        System.out.println(removeElement(nums, val));

    }

    public static int removeElement(int[] nums, int val) {
        int diffCounter=0;

        //Iter through nums
        for(int i=0;i<nums.length;i++){
            //If match ignore and move forward
            if(nums[i]==val){
                continue;
            }
            //Otherwise replace values in the array that matched val
            //with values that do not match val
            nums[diffCounter] = nums[i];
            diffCounter++;
        }

        return diffCounter;
    }
}
