package Progress;

//Problem: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/

public class BuyAndSellWithFee {
    public static void main(String[] args) {
        int[] prices = { 1, 3, 2, 8, 4, 9 };
        int fee = 2;
        // int[] prices = {1,3,7,5,10,3};
        // int fee = 3;
        System.out.println("FINAL EVAL: " + maxProfit(prices, fee));
    }

    // Can make multiple transactions (buy with a sale)
    // Cannot stack buys or sells, needs to be one after another
    public static int maxProfit(int[] prices, int fee) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int minInd = 0;
        int maxInd = prices.length - 1;
        int profit = 0;
        int currentProfit = 0;
        for (int i = 1, prev = i - 1; i < prices.length; i++, prev++) {

            // prev smaller than current and min shows up before max AND prev is the
            // smallest
            // When above is true:
            // Keep track of min and it's location in the list
            // Reset max and it's location in the list
            if (minInd < maxInd) {

            }
            if (prices[prev] < prices[i]) {
                if (prices[prev] < min) {
                    min = prices[prev];
                    minInd = prev;
                    System.out.println("min: " + min);
                    max = 0;
                }

                // 1, 3, 2, 8, 4, 9
                if (prices[i] > prices[prev]) {
                    if (prices[prev] > max) {
                        max = prices[i];
                        maxInd = i;
                        System.out.println("max: " + max);
                        System.out.println("CurrentProfit: (max-min)-fee = (" + max + "-" + min + ")-" + fee + " = "
                                + ((max - min) - 2));
                        currentProfit = (max - min) - fee;
                        min = Integer.MAX_VALUE;
                        profit += currentProfit;
                        System.out.println("total profit: " + profit);
                    }

                }

            }

        }
        return profit;
    }

    // public static int profit(int[] prices, int fee) {
    // int max = 0, currentEval = 0, min = 0;
    // for (int i = 1, prev = 0; i < prices.length; i++) {

    // }
    // return fee;
    // }
}
