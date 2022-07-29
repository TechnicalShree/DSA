package Arrays;

import java.util.*;

public class rotateTheMatrix {

    public static void rotateMatrix(int[][] matrix) {
        int[][] res = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);
        int n = res.length;
        int m = res[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = res[m - j - 1][i];
            }
        }
    }

    public static void print(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        print(mat);
        rotateMatrix(mat);
        System.out.println();
        print(mat);
    }
}
