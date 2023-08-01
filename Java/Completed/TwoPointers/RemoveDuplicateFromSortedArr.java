package Completed.TwoPointers;

//Submission: https://leetcode.com/submissions/detail/775956926/

public class RemoveDuplicateFromSortedArr {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int count = 1;
        int uniquePos = 0;

        for (int i = 0; i < nums.length; i++) {
            /*
             * keep a pointer of the position of where the first occurrence of a given 
             * number should be after all the moving is done. it is labeled "uniquePos"
             * if the VALUE of the array is the same at location uniquePos and i, then
             * replace the VALUE at location uniquePos with the value found at location i
             * this will keep the iterator going until the array is traversed enough to find
             * another value that does not match.
             */
            
            if (nums[uniquePos] == nums[i]) {
                nums[uniquePos] = nums[i];

                /*
                when uniquePos and i do not match, it means there is another unique number
                the program will update the uniquePos so that further updates to the array do
                not overwrite the same index it will then replace the VALUE at location uniquePos with the value found at
                location i finally it will update the count of unique numbers 
                */
                
            } else {
                uniquePos++;
                nums[uniquePos] = nums[i];
                count++;
            }
        }
        return count;
    }
}
