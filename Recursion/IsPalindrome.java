package Recursion;

public class IsPalindrome {
    public static boolean isPalindrome(String str, int s, int e) {
        if (s >= e)
            return true;
        if (str.charAt(s) != str.charAt(e))
            return false;
        return isPalindrome(str, ++s, --e);
    }

    public static void main(String[] args) {
        String str = " Race, -=-=-=-.';'/car ";
        String s1 = str.toLowerCase().replace(" ", "").replaceAll("[^a-z0-9]", "");

        if (isPalindrome(s1, 0, s1.length() - 1))
            System.out.println("True");
        else
            System.out.println("False");

    }
}