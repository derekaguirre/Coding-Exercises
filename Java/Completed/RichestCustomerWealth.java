
public class RichestCustomerWealth {

    //Submission: https://leetcode.com/problems/richest-customer-wealth/submissions/956121188/
    public static void main(String[] args) {
        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };

        System.out.println(maximumWealth(accounts));
    }

    //Add all the wealth of a given customer
    //Compare current wealth with max wealth and replace if highest
    //Move to next customer
    public static int maximumWealth(int[][] accounts) {
        int highestWealth = 0;
        int currentWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth = currentWealth + accounts[i][j];
            }
            if (currentWealth > highestWealth) {
                highestWealth = currentWealth;
            }
            currentWealth = 0;
        }
        return highestWealth;
    }
    
}
