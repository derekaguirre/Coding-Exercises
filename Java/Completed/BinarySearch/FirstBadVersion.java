package Completed.BinarySearch;

import java.util.Random;

//Submission: https://leetcode.com/submissions/detail/937605582/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid) && !isBadVersion(mid - 1))
                return mid;
            else if (!isBadVersion(mid))
                // System.out.println("Line18\nMid: "+mid + "\nLow: "+ low+"\n");
                low = mid + 1;
            else
                // System.out.println("Line 23\nMid: "+mid + "\nHigh: "+ high + "\nLow: "+
                // low+"\n");
                high = mid - 1;
        }
        return 0;
    }

    // I will be implementing the "isBadVersion" method soley to supress errors in
    // my IDE.
    // This method is not used in the real submission.
    // IGNORE BELOW METHOD
    public static boolean isBadVersion(int version) {
        // Generate a random boolean value
        Random random = new Random();
        return random.nextBoolean();
    }

}
