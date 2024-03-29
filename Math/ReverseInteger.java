package Math;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1235;
        long ans = 0;

        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }

        System.out.println((ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) ? 0 : (int) ans);

    }
}

// Reverse Integer

// Given a signed 32-bit integer x, return x with its digits reversed. If
// reversing x causes the value to go outside the signed 32-bit integer range
// [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or
// unsigned).

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21

// Constraints:

// -231 <= x <= 231 - 1