
//Problem: https://leetcode.com/problems/two-sum/

public class TwoSum {
    public static void main(String[] args) {
        int[] a = { 2, 7, 11, 15 }; // 9
        int[] b = { 3, 2, 4 }; // 6
        int[] c = {-1,-2,-3,-4,-5}; // -8

        twoSum(c, -1);
    }


    public static int[] twoSum(int[] nums, int target) {
        int i = 0, pointer2 = nums.length-1;

        int result[] = new int[2];

        while (i < nums.length) {
            if (nums[i] + nums[pointer2] == target) {
                result[0] = i;
                result[1] = pointer2;
                break;
            }

            else if (nums[i] + nums[pointer2] > target)
                pointer2--;

            else if (nums[i] + nums[pointer2] < target)
                i++;
        }

        return result;

    }
}
