package Progress;

//Submission: https://leetcode.com/problems/find-the-highest-altitude/submissions/974490118/

public class LargestAltitude {

    public static int largestAltitude(int[] gain) {
        int sum = 0;
        int max = 0;
        
        //Add all altitudes and keep track of the max
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            max = Math.max(sum, max);
        }

        return max;
    }
}
