package DynamicProgramming;

import java.util.*;

class Knapsack {
    static int knapsack(int[] val, int[] wt, int n, int w) {
        int[][] dp = new int[2][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || j == 0)
                    dp[i % 2][j] = 0;
                else if (wt[i - 1] <= j)
                    dp[i % 2][j] = Math.max(val[i - 1] + dp[(i - 1) % 2][j - wt[i - 1]], dp[(i - 1) % 2][j]);
                else
                    dp[i % 2][j] = dp[(i - 1) % 2][j];
            }
        }
        return dp[n % 2][w];
    }

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
}