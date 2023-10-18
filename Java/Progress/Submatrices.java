package Progress;

public class Submatrices {
    public static void main(String[] args) {
        int[][] mat = { { 1, 0, 1 },
                { 1, 1, 0 },
                { 1, 1, 0 } };
        System.out.println(numSubmat(mat));
    }

    public static int numSubmat(int[][] mat) {
        int counter = 0;
        counter += countSingles(mat);
        counter += countMultiplesVertically(mat);
        return counter;
    }

    public static int countSingles(int[][] mat) {
        int counter = 0;
        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == 1) {
                    counter++;
                }
            }
        }
        System.out.println("Singles: " + counter);
        return counter;
    }

    public static int countMultiplesVertically(int[][] mat) {
        int counter = 0;
        int i = 0;
        int j = 0;
        while (i < mat.length) {
            if (mat[i][j] == 1) {
                // counter++;
                // loop through j
                while (j < mat[i].length) {
                    if (mat[i][j] == 0) {
                        break;
                    }
                    counter++;
                    j++;
                }
            }
            i++;
        }
        System.out.println("Verticals: " + counter);
        return counter;
    }
}
