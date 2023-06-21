package Progress;

public class MinCostToMakeArrayEqual {

    //Problem: https://leetcode.com/problems/minimum-cost-to-make-array-equal/description/
    //Needs optimization
    public static void main(String[] args) {
        //
        int[] nums = { 735103, 366367, 132236, 133334, 808160, 113001, 49051, 735598, 686615, 665317, 999793, 426087,
                587000, 649989, 509946, 743518 };
        int[] cost = { 724182, 447415, 723725, 902336, 600863, 287644, 13836, 665183, 448859, 917248, 397790, 898215,
                790754, 320604, 468575, 825614 };

        System.out.println("FINAL EVAL: " + minCost(nums, cost));
    }

    public static long minCost(int[] nums, int[] cost) {
        int eleToChangeTo = nums.length - 1;
        long minCost = Long.MAX_VALUE;
        while (eleToChangeTo >= 0) {
            long currentCost = 0;
            for (int i = 0; i < nums.length; i++) {
                // Calculate difference and subsequently the cost to equalize;
                long difference = Math.abs(nums[i] - nums[eleToChangeTo]);
                long costToChange = difference * cost[i];
                // Sums up how much it would cost to change to the selected number
                currentCost += costToChange;
            }
            minCost = Math.min(currentCost, minCost);
            eleToChangeTo--;
        }
        return minCost;
    }
}