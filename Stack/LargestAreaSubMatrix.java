package Stack;

import java.util.Stack;

public class LargestAreaSubMatrix {
    public static int maxAreaOfHistrogram(int[] arr) {
        int n = arr.length;
        int[] ps = new int[n];
        int[] ns = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ps[i] = -1;
            } else {
                ps[i] = st.peek();
            }
            st.push(i);
        }

        st.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ns[i] = n;
            } else {
                ns[i] = st.peek();
            }
            st.add(i);
        }

        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            maxArea = Math.max((ns[i] - ps[i] - 1) * arr[i], maxArea);
        }
        return maxArea;
    }

    private static int largestAreaSubMatrix(int[][] mat) {
        int[] curRow = mat[1];
        int maxArea = maxAreaOfHistrogram(curRow);

        int n = mat.length;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < mat[j].length; j++) {
                if (mat[i][j] == 1) {
                    curRow[j]++;
                } else {
                    curRow[j] = 0;
                }
            }
            int tillMax = maxAreaOfHistrogram(curRow);

            maxArea = Math.max(maxArea, tillMax);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 1, 0, 1, 1 }, { 1, 1, 1, 1, 1 }, { 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1 },
                { 1, 1, 1, 1, 1 } };

        System.out.println(largestAreaSubMatrix(mat));
    }
}
