package Completed.Array;

import java.util.Arrays;

//Submission: https://leetcode.com/submissions/detail/953132975/

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int pointer1 = 0, pointer2 = 0, iter = 0;
        
        while(pointer1 < nums1.length && pointer2 < nums2.length){
            if(nums1[pointer1] < nums2[pointer2])
                pointer1++;
            else if(nums1[pointer1] > nums2[pointer2])
                pointer2++;
            else{
                nums1[iter] = nums1[pointer1];
                pointer2++;
                pointer1++;
                iter++;
            }
        }
        return Arrays.copyOfRange(nums1,0,iter);
    }
}
