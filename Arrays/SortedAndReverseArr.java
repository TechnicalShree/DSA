package Arrays;

public class SortedAndReverseArr {

    public static int findingPivot(int[] arr) {
        int pivot = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                pivot = i;
            }
        }
        return pivot;
    }

    public static int binarySearch(int[] arr, int s, int e, int x) {

        if (e >= s) {
            int m = s + (e - s) / 2;
            if (x == arr[m])
                return m;

            if (x > arr[m])
                return binarySearch(arr, m + 1, e, x);
            else
                return binarySearch(arr, s, m, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        int k = 6;
        int n = arr.length;
        int pivot = findingPivot(arr);

        // Base Cases
        if (n == pivot) {
            System.out.println(pivot);
            return;
        }
        if (n == 0) {
            System.out.println(-1);
            return;
        }

        // Finding the index by binary search
        int res = -1;
        if (k >= arr[0]) {
            if (k == arr[0]) {
                System.out.println(0);
                return;
            }
            res = binarySearch(arr, 0, pivot, k);
        } else {
            res = binarySearch(arr, pivot + 1, n - 1, k);
        }

        System.out.println(res);
    }
}

// https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/