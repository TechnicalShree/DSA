package Arrays;

import java.util.*; // contains Collections framework

public class Kadane {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = s.nextInt();
            }
            long curr = 0;
            long max = Integer.MIN_VALUE;
            long maxv = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                curr = Math.max(curr + A[i], A[i]);
                max = Math.max(curr, max);
                if (curr == max) {
                    if (maxv < A[i])
                        maxv = A[i];
                }
            }
            System.out.print(max - maxv);
        }
    }
}
