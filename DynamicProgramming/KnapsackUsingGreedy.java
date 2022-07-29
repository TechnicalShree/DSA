package DynamicProgramming;

import java.util.*;

public class KnapsackUsingGreedy {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt();
                int w = sc.nextInt();
                int[] wt = new int[n];
                int[] v = new int[n];
                for (int i = 0; i < n; i++) {
                    v[i] = sc.nextInt();
                }
                for (int i = 0; i < n; i++) {
                    wt[i] = sc.nextInt();
                }

                int res = knapsack(v, wt, n, w);
                System.out.println(res);
            }
        }
    }

    private static int knapsack(int[] v, int[] wt, int n, int w) {
        double[] dp = new double[n];
        for (int i = 0; i < n; i++) {
            dp[i] = (double) (v[i] / wt[i]);
        }
        for (double i : dp)
            System.out.print(i + " ");

        System.out.println();
        return 0;
    }
}
