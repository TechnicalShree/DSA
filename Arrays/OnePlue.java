package Arrays;

public class OnePlue {
    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 9, 9, 9 };

        int[] res = plusOne(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
