package Completed.DynamicProgramming;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int slow = 1, fast = 1;

        for (int i = 0; i < n-1; i++) {
            int temp = fast;
            // Add prev values and get new result
            fast = slow + fast;
            // Move the slow pointer to the prev value of fast
            slow = temp;
        }
        return fast;
    }
}
