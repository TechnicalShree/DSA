package Math;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 121;
        System.out.println("The given number " + n + " is " + isNumPalindrome(n));
    }

    private static String isNumPalindrome(int n) {
        if (n < 0)
            return "not Palindrome";

        int rev = 0;
        int temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == n ? "Palindrome" : "not Palindrome";
    }
}
