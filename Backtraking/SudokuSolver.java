package Backtraking;

import Utility.PrintMatrix;

public class SudokuSolver {
    public static boolean isSafe(char[][] board, int a, int b) {
        for (int i = 0; i < a; i++) {
            if (board[i][b] == '.' && board[i][b] == board[a][b]) {
                return false;
            }
        }
        for (int i = 0; i < b; i++) {
            if (board[a][i] == '.' && board[a][i] == board[a][b]) {
                return false;
            }
        }
        int startRow = a - (a % 3);
        int startCol = b - (b % 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != a && j != b && board[i][j] == board[a][b]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid(char[][] board, int row, int col) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (int k = 1; k <= 9; k++) {
                        board[i][j] = (char) (k + '0');
                        if (isSafe(board, i, j)) {
                            return isValid(board, i, j);
                        } else {
                            board[i][j] = '.';
                        }
                    }
                }
            }
        }

        return false;
    }

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
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        System.out.println("Before solving : -");
        PrintMatrix.printCharMat(board);

        boolean isSolved = isValid(board, 0, 0);
        System.out.println(isSolved);

        System.out.println("After solving : -");
        PrintMatrix.printCharMat(board);
    }
}
