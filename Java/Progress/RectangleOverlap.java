public class RectangleOverlap {
    public static void main(String[] args) {
        int[] rec2 = { 0, 0, 1, 1 };
        int[] rec1 = { 1, 0, 2, 1 };

        System.out.println(isRectangleOverlap(rec1, rec2));

    }

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // FIRST RECTANGLE
        int x1 = rec1[0];
        int y1 = rec1[1];
        int x2 = rec1[2];
        int y2 = rec1[3];
        // SECOND RECTANGLE
        int x11 = rec2[0];
        int y11 = rec2[1];
        int x22 = rec2[2];
        int y22 = rec2[3];

        
        // Statements
        //is a rectangle
        
        // rec1 is to the left of rec2
        boolean isRect1Left = ((x1 < x22 && x11 < x2) && (y1 < y22 && y11 < y2));

        // rec2 is to the left of rec1
        boolean isRect2Left = ((x11 < x2 && x1 < x22) && (y11 < y2 && y1 < y22));
        if (isRect1Left || isRect2Left)
            return true;
        return false;
    }
}
