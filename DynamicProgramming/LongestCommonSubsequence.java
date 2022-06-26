package DynamicProgramming;

public class LongestCommonSubsequence {

    static int LCSTopBottom(int m, int n, String str1, String str2, int[][] dp) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (dp[m][n] != -1) {
            return dp[m][n];
        }
        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            dp[m][n] = 1 + LCSTopBottom(m - 1, n - 1, str1, str2, dp);
            return dp[m][n];
        } else {
            return dp[m][n] = Math.max(LCSTopBottom(m - 1, n, str1, str2, dp), LCSTopBottom(m, n - 1, str1, str2, dp));
        }

    }

    static int LCSBottomUp(int m, int n, String str1, String str2, int[][] dp) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String str1 = "ABCSDFE";
        String str2 = "SCDGFE";
        int m = str1.length();
        int n = str2.length();

        int[][] dp = new int[m + 1][n + 1];

        // for (int i = 1; i <= m; i++) {
        // for (int j = 1; j <= n; j++) {
        // dp[i][j] = -1;
        // }
        // }

        // int res = LCSTopBottom(m, n, str1, str2, dp);
        int res = LCSBottomUp(m, n, str1, str2, dp);

        System.out.println(res);
    }
}