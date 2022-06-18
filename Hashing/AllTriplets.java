import java.util.HashSet;

/**
 * AllTriplets
 */
public class AllTriplets {
    static void findAllTriplets(int[] arr, int sum) {
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int x = sum - (arr[i] + arr[j]);
                if (set.contains(x)) {
                    System.out.print("{ " + arr[i] + ", " + x + ", " + arr[j] + " } ");
                } else {
                    set.add(arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { -3, 1, 4, -5, -4, 2, 3 };
        int sum = 0;

        findAllTriplets(arr, sum);
    }
}