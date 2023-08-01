package Completed.Array;

//Submission: https://leetcode.com/problems/product-of-array-except-self/submissions/988747888/

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        int[] resArr = productExceptSelfNTime(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(resArr[i]);
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int prod = 1, curr = 0, back = 0, forward = 0;
        int[] resArr = new int[nums.length];
        //loop through until end
        while (curr < nums.length) {
            //bounds check for immediate spot behind current
            while(back-1 >= 0){
                //update the start pointer and add that to the product
                back--;
                prod *= nums[back];
            }
            //Check same thing on forward
            while(forward+1 < nums.length){
                //update the forward pointer and add that to the product
                forward++;
                prod *= nums[forward];
            }
            resArr[curr] = prod;
            curr++;
            prod = 1;
            back = forward = curr;
        }
        return resArr;
    }

    public static int[] productExceptSelfNTime(int[] nums) {
        int[] result = new int[nums.length];

        //Populate by multiplying the tmp with the current number
        for (int i = 0, tmp = 1; i < result.length; i++) {
            result[i] = tmp;
            tmp *= nums[i];
        }
        //Loop backwards in the array
        for (int i = nums.length-1, tmp = 1; i >= 0; i--) {
            //Multiply backwards by doing result times the temp value
            result[i] *= tmp;
            //Update the tmp value by multiplying it by the current nums value
            tmp *= nums[i];
        }
        return result;
    }

 
}
