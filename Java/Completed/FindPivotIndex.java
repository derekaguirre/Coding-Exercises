package Completed;

//Submission: https://leetcode.com/problems/find-pivot-index/submissions/947645615/

class FindPivotIndex {
    
    public int pivotIndex(int[] nums) {

        int sumForward = 0;
        int totalSum = 0;
        
        for (int ele : nums){
            totalSum += ele;
        }

        for (int i = 0; i < nums.length; sumForward += nums[i++])
            if (sumForward * 2 == totalSum - nums[i])
                return i;  

        return -1;
    }
}