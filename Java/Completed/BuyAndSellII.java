package Completed;

//Submission: https://leetcode.com/submissions/detail/949887919/

public class BuyAndSellII{
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        int[] b = {1,2,3,4,5};
        int[] c = {7,6,4,3,1};

        System.out.println(maxProfit(a));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 1,prevInd = 0; i < prices.length; i++) {
            //if current is greater than previous, sell stock for profit and iterate both pointers
            if(prices[i] > prices[prevInd]){
                profit += prices[i]-prices[prevInd];
                prevInd++;
            } 
            //otherwise we skip and iterate the pointers
            else{
                prevInd++;
                continue;
            }
        }
        return profit;
    }
}