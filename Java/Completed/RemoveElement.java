package Completed;

//Submission: https://leetcode.com/problems/remove-element/submissions/954292661/

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int l = nums.length;
        for(int a=0;a<l;a++){
            if(nums[a]==val){
                continue;
            }
            nums[i] = nums[a];
            i++;
        }

        return i;
    }
}
