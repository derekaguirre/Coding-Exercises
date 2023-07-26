package Completed;

//Submission: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/1003085813/

public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int[] res = twoSum(numbers, 9);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int front = 0;
        int back = numbers.length - 1;
        while (front <= back) {
            int sum = numbers[front] + numbers[back];
            if (sum == target)
                return new int[] { front + 1, back + 1 };
            else if (sum < target)
                front++;
            else
                back--;
        }
        return new int[] { -1, -1 };
    }
}
