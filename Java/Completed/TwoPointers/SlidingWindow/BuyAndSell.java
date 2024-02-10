package Completed.TwoPointers.SlidingWindow;

//Submission: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/976806996

public class BuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("FINAL EVAL: " + maxProfit2(prices));
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

    //Will find pairs of the lowest and the highest pairs while maintaining the order of buying before selling
    //After pairs are found it will keep track of the max profit for all pairs and return the result
    public static int maxProfit2(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0, minInd = 0, max = 0;

        for (int curr = 1, prev = curr - 1; curr < prices.length; curr++, prev++) {
            // Conditions for finding the smallest number:
            //  prev is smaller than the current
            //  prev is the smallest we've ever seen
            //  prev always lies before the potential biggest value
            if (prices[prev] < prices[curr] && prices[prev] < min && minInd < curr) {
                //Save the current min and its location and reset the max since this is a new buy location
                min = prices[prev];
                minInd = prev;
                max = 0;
                System.out.println("min: " + min);
            }
            // Conditions for finding the biggest number:
            //  curr is bigger than prev
            //  curr is the biggest number that is known
            //  potential biggest number always lies after the smaller number
            if(prices[curr] > prices[prev] && prices[curr] > max && curr > minInd){
                max = prices[curr];
                System.out.println("max: " + max);
            }

            //Compute the highest max profit of the possible biggest and smallest pairs
            profit = Math.max(profit, max - min);

        }
        return profit;
    }
}
