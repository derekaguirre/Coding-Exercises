package Progress;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            // System.out.println("Row Check");
            // System.out.println(validRow(board, i));
            // System.out.println("Column Check");
            // System.out.println(validColumn(board, i));
            System.out.println("Box Check");
            System.out.println(validBox(board, i));
        }
        System.out.println("");
        return false;
    }

    // Can combine row and col
    public static boolean validRow(char[][] board, int row) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != '.' && set.contains(board[row][i]))
                return false;
            else if (board[row][i] != '.')
                set.add(board[row][i]);

            System.out.println(board[row][i]);
        }
        return true;
    }

    public static boolean validColumn(char[][] board, int col) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            if (board[i][col] != '.' && set.contains(board[i][col]))
                return false;
            else if (board[i][col] != '.')
                set.add(board[i][col]);

            System.out.println(board[i][col]);
        }
        return true;
    }

    public static boolean validBox(char[][] board, int row) {
        Set<Character> setOne = new HashSet<>();
        Set<Character> setTwo = new HashSet<>();
        Set<Character> setThree = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            // Check bounds
            if ((i / 3) == 1) {
                // If not empty and already exists
                if (board[row][i] != '.' && setOne.contains(board[row][i])) {
                    System.out.println("Set 1 False");
                    return false;
                } else if (board[row][i] != '.') {
                    System.out.println("Set 1");
                    setThree.add(board[row][i]);
                    System.out.println(board[row][i]);
                }
            } else if (i / 3 == 2) {
                // If not empty and already exists
                if (board[row][i] != '.' && setTwo.contains(board[row][i])) {
                    System.out.println("Set 2 False");
                    return false;
                } else if (board[row][i] != '.') {
                    System.out.println("Set 2");
                    setThree.add(board[row][i]);
                    System.out.println(board[row][i]);
                }
            } 
            else { // If not empty and already exists
                if (board[row][i] != '.' && setThree.contains(board[row][i])) {
                    System.out.println("Set 3 False");
                    return false;
                } else if (board[row][i] != '.') {
                    System.out.println("Set 3");
                    System.out.println(board[row][i]);
                    setThree.add(board[row][i]);
                }
            }
        }
        return true;
    }
}
