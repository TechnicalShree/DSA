package Arrays;

public class FindingSmallestPositiveNum {
    public static int samllestPositiveNum(int[] arr) {
        int idx = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            idx = arr[i];
            if (idx > 0 && idx < n) {
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] != i) {
                return i;
            }
        }

        return 3;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, -1, -2 };
        System.out.println(samllestPositiveNum(arr));
    }
}
