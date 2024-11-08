package Progress;

//Submission: https://leetcode.com/problems/shuffle-the-array/submissions/1446256339

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        // int[] numsTwo = {1,2,3,4,4,3,2,1};
        
        int[] res = shuffle(nums, 3);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        
        for(int i = 0; i < n; i++){
            res[2*i] = nums[i];
            res[2*i + 1] = nums[n+i]; 
        }

        return res;
    }
}
