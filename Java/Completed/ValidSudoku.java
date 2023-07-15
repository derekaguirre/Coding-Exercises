package Completed;

import java.util.HashSet;
import java.util.Set;

//Submission: https://leetcode.com/problems/valid-sudoku/submissions/989999793/

public class ValidSudoku {
    public static void main(String[] args) {
        // char[][] board = {
        // { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
        // { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
        // { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
        // { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
        // { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
        // { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
        // { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
        // { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
        // { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

        char[][] board2 = {
                { '.', '.', '4', '.', '.', '.', '6', '3', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '5', '.', '.', '.', '.', '.', '.', '9', '.' },
                { '.', '.', '.', '5', '6', '.', '.', '.', '.' },
                { '4', '.', '3', '.', '.', '.', '.', '.', '1' },
                { '.', '.', '.', '7', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '5', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.' }
        };

        System.out.println("FINAL EVAL: " + isValidSudoku(board2));
    }

    public static boolean isValidSudoku(char[][] board) {
        return validCol(board) && validRow(board) && validBox(board);
    }

    public static boolean validRow(char[][] board) {
        Set<Character> setRow = new HashSet<>();
        for (int slowIter = 0; slowIter < board.length; slowIter++) {
            for (int i = 0; i < board.length; i++) {
                if (board[slowIter][i] != '.') {
                    if (setRow.contains(board[slowIter][i]))
                        return false;
                    setRow.add(board[slowIter][i]);
                    System.out.println("setRow: " + board[slowIter][i]);
                }

            }
            System.out.println("Resetting Sets");
            setRow = new HashSet<>();
        }
        return true;
    }

    public static boolean validCol(char[][] board) {
        Set<Character> setCol = new HashSet<>();
        for (int slowIter = 0; slowIter < board.length; slowIter++) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][slowIter] != '.') {
                    if (setCol.contains(board[i][slowIter]))
                        return false;
                    setCol.add(board[i][slowIter]);
                    System.out.println("setCol: " + board[i][slowIter]);
                }
            }
            System.out.println("Resetting Sets");
            setCol = new HashSet<>();
        }
        return true;
    }

    public static boolean validBox(char[][] board) {
        Set<Character> setOne = new HashSet<>();
        Set<Character> setTwo = new HashSet<>();
        Set<Character> setThree = new HashSet<>();
        for (int slowIter = 0; slowIter < board.length; slowIter++) {
            // Resets after every 3 rows
            if (slowIter != 0 && slowIter % 3 == 0) {
                setOne = new HashSet<>();
                setTwo = new HashSet<>();
                setThree = new HashSet<>();
            }
            for (int i = 0; i < board.length; i++) {
                if (board[slowIter][i] == '.')
                    continue;
                switch (i / 3) {
                    case 0:
                        if (setOne.contains(board[slowIter][i]))
                            return false;
                        // System.out.println("Set 1: " + board[slowIter][i]);
                        setOne.add(board[slowIter][i]);
                        break;
                    case 1:
                        if (setTwo.contains(board[slowIter][i]))
                            return false;
                        setTwo.add(board[slowIter][i]);
                        // System.out.println("Set 2: " + board[slowIter][i]);
                        break;
                    case 2:
                        if (setThree.contains(board[slowIter][i]))
                            return false;
                        setThree.add(board[slowIter][i]);
                        // System.out.println("Set 3: " + board[slowIter][i]);
                        break;

                }
            }
        }
        return true;
    }
}
