package Progress;

//Submission: https://leetcode.com/problems/last-moment-before-all-ants-fall-out-of-a-plank/submissions/1091486338/

public class TimeForAllAntsToFallOffPlank {
    public static void main(String[] args) {
        int n = 4;
        int[] left = { };
        int[] right = { 0, 1 };
        System.out.println(getLastMoment(n, left, right));
    }

    public static int getLastMoment(int n, int[] left, int[] right) {
        int maxDist = Integer.MIN_VALUE;
        // Farthest from left
        int leftSideIter = 0;
        int rightSideIter = 0;
        while (leftSideIter < left.length || rightSideIter < right.length) {
            //Direction: left -> right
            if (rightSideIter < right.length) {
                maxDist = Math.max(n - right[rightSideIter], maxDist);
                rightSideIter++;
            }
            //Direction: left <- right
            if (leftSideIter < left.length) {
                maxDist = Math.max(left[leftSideIter], maxDist);
                leftSideIter++;
            }
        }
        return maxDist;
    }
}
