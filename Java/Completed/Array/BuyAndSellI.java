package Completed.Array;

//Submission: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/976806996/

public class BuyAndSellI {
    public static void main(String[] args) {
        // System.out.println("FINAL EVAL: " + maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
        // System.out.println("FINAL EVAL: " + maxProfit(new int[] { 5, 4, 3, 2, 1 }));
        // System.out.println("FINAL EVAL: " + maxProfit(new int[] { 2, 4, 1 }));
        // System.out.println("FINAL EVAL: " + maxProfit(new int[] { 2, 1, 2, 0, 1 }));
        // System.out.println("FINAL EVAL: " + maxProfit(new int[] { 3,2,6,5,0,3 }));
    }


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
                //Set smallest number and reset max
                min = prices[prev];
                minInd = prev;
                max = 0;
            }

            // Current num is bigger than prev
            // This potential biggest number lies after the smaller number
            // The current num is biggest known value so far
            if (prices[i] > prices[prev] && i > minInd && prices[i] > max) {
                max = prices[i];
            }
            profit = Math.max(profit, max-min);
        }
        
        
        return profit;
    }
}
