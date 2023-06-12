package Progress;

import java.util.*;

//Problem: https://leetcode.com/problems/sudoku-solver/

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {

            //5,3,7
            //5,6,8,4,7
            //5,3,6,9,8

            //3,4,5,6,7,8,9
                { '5', '3', '.',     '.', '7', '.',      '.', '.', '.' },
                { '6', '.', '.',     '1', '9', '5',      '.', '.', '.' },
                { '.', '9', '8',     '.', '.', '.',      '.', '6', '.' },

                { '8', '.', '.',     '.', '6', '.',     '.', '.', '3' },
                { '4', '.', '.',     '8', '.', '3',     '.', '.', '1' },
                { '7', '.', '.',     '.', '2', '.',     '.', '.', '6' },

                { '.', '6', '.',     '.', '.', '.',      '2', '8', '.' },
                { '.', '.', '.',     '4', '1', '9',      '.', '.', '5' },
                { '.', '.', '.',     '.', '8', '.',      '.', '7', '9' }
        }; 

        

        solveSudoku(board);
    }

    public static void solveSudoku(char[][] board) {
        Set<Character> knownRow = new HashSet<Character>();
        Set<Character> knownCol = new HashSet<Character>();
        Set<Character> knownBox = new HashSet<Character>();

        for (int i = 0; i < board.length; i++) {
            // set.add(board[i]);
        }


        for ( int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.println(board[i][j]);
            }
        }
    }



    // public static void solveSudoku(char[][] board) {
    //     Set<Character> set = new HashSet<Character>();
    //     // check both row and columns
    //     for (int row = 0; row < board.length; row++) {
    //         // manipulate rows
    //         // System.out.println(board[row]);

    //         // iterate through columns
    //         for (int col = 0; col < board[row].length; col++) {
    //             // System.out.println(board[row][col]);
    //             // manipulate columns

    //             if (board[row][col] != '.') {
    //                 // set.add(board[row][col]);
    //                 System.out.println(board[row][col]);
    //             }
    //         }
    //     }

    // }

}