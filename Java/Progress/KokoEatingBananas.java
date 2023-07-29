package Progress;

//Submission: https://leetcode.com/problems/koko-eating-bananas/submissions/1006554406/

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        // The end of the search will be the highest value in the list or even an
        // arbitrarily high number
        int high = 0;
        for (int i = 0; i < piles.length; i++) {
            high = Math.max(piles[i], high);
        }
        int low = 1, k = 0, hours = 0;
        while (low <= high) {
            k = low + (high - low) / 2;
            hours = 0;
            // "Eat" every pile "piles[i]" by k amount and record the total time taken
            for (int i = 0; i < piles.length; i++)
                hours += Math.ceil((double) piles[i] / k);

            // If the current hours exceeds limit "h" then move the low pointer
            if (hours > h)
                low = k + 1;
            else
                high = k - 1;
        }
        return low;
    }
}
