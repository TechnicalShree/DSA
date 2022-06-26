package DynamicProgramming;

/**
 * CountSetBits
 */
public class CountSetBits {
    static int[] countSetBits(int n) {
        int[] ans = new int[n + 1];

        // for (int i = 0; i * 2 <= n; i++) {
        // int val = ans[i];
        // ans[i * 2] = val;
        // if ((i * 2 + 1) <= n) {
        // ans[i * 2 + 1] = val + 1;
        // }
        // }

        // brute force solution

        // for(int i = 1; i <= n; i++){
        // int cnt = 0;
        // int num = i;
        // while(num > 0){
        // cnt += num & 1;
        // num >>= 1;
        // }
        // ans[i] = cnt;
        // }

        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i / 2] + i % 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] ans = countSetBits(n);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}