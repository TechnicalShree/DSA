package Sorting;

public class PivotedBinarySearch {
    public static int bSreachIterative(int[] arr, int key) {
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (key == arr[mid]) {
                return mid;
            }
            if (arr[l] < arr[mid]) {
                if (key >= arr[l] && key < arr[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (key > arr[mid] && key <= arr[h]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        }

        return -1;
    }

    private static int bSreachRecursion(int[] arr, int l, int h, int key) {
        if (l > h) {
            return -1;
        }

        int mid = l + (h - l) / 2;
        if (key == arr[mid]) {
            return mid;
        }

        if (key == arr[l]) {
            return l;
        }
        if (key > arr[l] && key < arr[mid]) {
            return bSreachRecursion(arr, l, mid - 1, key);
        } else {
            return bSreachRecursion(arr, mid + 1, h, key);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 20, 30, 40, 50, 60, 5, 10 };
        int n = arr.length;

        System.out.println(bSreachIterative(arr, 10));
        System.out.println(bSreachRecursion(arr, 0, n - 1, 10));
    }

}

// Search an element in a sorted and rotated array

// An element in a sorted array can be found in O(log n) time via binary search.
// But suppose we rotate an ascending order sorted array at some pivot unknown
// to you beforehand. So for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise
// a way to find an element in the rotated array in O(log n) time.