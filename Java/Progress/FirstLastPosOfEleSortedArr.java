import java.util.LinkedList;

//Problem: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class FirstLastPosOfEleSortedArr {
   
    public int[] searchRange(int[] nums, int target) {
        LinkedList<Integer> positions = new LinkedList<Integer>();
        int left = 0;
        int right = nums.length-1;
        int mid = nums.length/2;


        //check for size 0/1 arrays
        if(nums[0] == target && nums[nums.length-1]==target){
            positions.add(nums[0]);
            // return positions;
        }

        for(int i = 0; i <= nums.length-1; i++){
        //     switch(target) {
        //         case(target == nums[mid]){
                    
        //             positions.add(i);


        //         }

        //         case(target < nums[mid]):
                

        //         break;
        //         case(target > mid[mid]):
        //         //code

        //         break;
        // }

        }
   

        return nums;

    }

}