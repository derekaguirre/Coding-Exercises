package Completed.BinarySearch;

//Submission: https://leetcode.com/problems/guess-number-higher-or-lower/submissions/1089983752/

public class GuessGameI {
    public int guessNumber(int n) {
        int low = 1, high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int hint = guess(mid);
            System.out.println("Mid: " + mid + "/nhint: " + hint);
            // Match
            if (hint == 0)
                return mid;
            // Need to guess higher
            else if (hint == 1)
                low = mid + 1;
            // Need to guess lower
            else
                high = mid - 1;
        }
        return 0;
    }

    public int guess(int n) {
        int pick = 4;
        return n == pick ? 0 : n > pick ? -1 : 1;
    }
}
