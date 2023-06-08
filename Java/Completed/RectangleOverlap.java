package Completed;

// Submission: https://leetcode.com/problems/rectangle-overlap/submissions/966437889/

public class RectangleOverlap {

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2){
        // // FIRST RECTANGLE
        // int x1 = rec1[0], y1 = rec1[1];
        // int x2 = rec1[2], y2 = rec1[3];
        // // SECOND RECTANGLE
        // int x11 = rec2[0], y11 = rec2[1];
        // int x22 = rec2[2], y22 = rec2[3];

        // // Boolean Statements
        // // rec1 is to the left of rec2
        // boolean isRect1Left = ((x1 < x22 && x11 < x2) && (y1 < y22 && y11 < y2));

        // // rec2 is to the left of rec1 (question does not require this part so I will comment out)
        // boolean isRect2Left = ((x11 < x2 && x1 < x22) && (y11 < y2 && y1 < y22));

        return ((rec1[0] < rec2[2] && rec2[0] < rec1[2]) &&
        (rec1[1] < rec2[3] && rec2[1] < rec1[3]));
    }
}
