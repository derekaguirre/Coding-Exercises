package Completed;

//Submission: https://leetcode.com/submissions/detail/944695450/

class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        if(nums == null || nums.length <= 1){
            return nums;
        }
        
        int pointer1 = 0, pointer2 = nums.length-1;
        
        while(pointer1 < pointer2){
            //Find Odd Numbers
            while(pointer1 < pointer2 && nums[pointer1]%2 == 0){
                pointer1++;
            }
            
            //Find even numbers
            while(pointer1 < pointer2 && nums[pointer2]%2 == 1){
                pointer2--;
            }
            
            //Handles the swapping of elements
            if(pointer1 < pointer2){
                int tmpSwap = nums[pointer1];
                nums[pointer1] = nums[pointer2];
                nums[pointer2] = tmpSwap;
            }
        }
        return nums;
        
    }
}