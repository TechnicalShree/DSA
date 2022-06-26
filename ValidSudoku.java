import java.util.HashSet;

/**
 * ValidSudoku
 */
public class ValidSudoku {
    static boolean isInRow(char[][] board, int row) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            if (set.contains(board[row][i])) {
                return false;
            }
            if (board[row][i] != '.') {
                set.add(board[row][i]);
            }
        }
        return true;
    }

    static boolean isInColumn(char[][] board, int column) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            if (set.contains(board[i][column])) {
                return false;
            }
            if (board[i][column] != '.') {
                set.add(board[i][column]);
            }
        }
        return true;
    }

    static boolean isInBox(char[][] board, int row, int column) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char ch = board[i + row][j + column];
                if (set.contains(ch)) {
                    return false;
                }
                if (ch != '.') {
                    set.add(ch);
                }
            }
        }
        return true;
    }

    static boolean isValid(char[][] board, int row, int column) {
        return isInRow(board, row) && isInColumn(board, column) && isInBox(board, row - row % 3, column - column % 3);
    }

    static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!isValid(board, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

        System.out.println(isValidSudoku(board));
    }
}