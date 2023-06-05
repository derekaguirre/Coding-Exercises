package Completed;

//Submission: https://leetcode.com/problems/check-if-it-is-a-straight-line/submissions/964327716/

public class CheckStraightLine {

    public boolean checkStraightLine(int[][] coordinates) {
        // Eval the change first two coordinates
        // x:[i][0] y:[i][1]
        int deltaX = coordinates[1][0] - coordinates[0][0];
        int deltaY = coordinates[1][1] - coordinates[0][1];

        // Eval the rest of the points with the linear function
        for (int i = 1; i < coordinates.length; i++) {
            int tmpXPoints = coordinates[i][0] - coordinates[i - 1][0];
            int tmpYPoints = coordinates[i][1] - coordinates[i - 1][1];
            //tmpDeltaY * deltaX != tmpDeltaX * deltaY 
            if (tmpYPoints * deltaX != tmpXPoints * deltaY)
                return false;
        }
        return true;
    }
}
