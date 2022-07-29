package Math;

import java.util.Arrays;

class PrintAllPrimeNo {
    public static void sieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n + 1];

        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (prime[i] == true) {
                for (int j = i * i; j <= n; j += i)
                    prime[j] = false;
            }
        }

        for (int i = 0; i <= n; i++)
            System.out.println(i + " :-> " + prime[i]);
    }

    public static void main(String[] args) {
        int n = 150;

        sieveOfEratosthenes(n);
    }
}
