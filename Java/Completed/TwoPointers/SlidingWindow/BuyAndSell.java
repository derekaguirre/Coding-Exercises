package Completed.TwoPointers.SlidingWindow;

//Submission: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/976806996

public class BuyAndSell {
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int minInd = 0;
        int max = 0;
        int profit = 0;

        for (int i = 1, prev = i - 1; i < prices.length; i++, prev++) {
            // If the prev is smaller than current
            // The curr num is the smallest known
            // The smallest num lies before the potential biggest
            if (prices[prev] < prices[i] && prices[prev] < min && minInd < i) {
                // Set smallest number and reset max
                min = prices[prev];
                minInd = prev;
                max = 0;
                System.out.println("min: " + min);
            }

            // Current num is bigger than prev
            // This potential biggest number lies after the smaller number
            // The current num is biggest known value so far
            if (prices[i] > prices[prev] && i > minInd && prices[i] > max) {
                max = prices[i];
                System.out.println("max: " + max);
            }

            profit = Math.max(profit, max - min);
        }

        return profit;
    }
}
