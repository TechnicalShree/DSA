package Sorting;

public class MissingNum {
    private static int missingNum(int[] arr) {
        int n = arr.length + 1;
        int res = n * (n + 1) / 2;

        for (int i = 0; i < n - 1; i++) {
            res -= arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 3, 7, 8 };

        System.out.println(missingNum(arr));
    }
}

// Find the Missing Number

// You are given a list of n-1 integers and these integers are in the range of 1
// to n. There are no duplicates in the list. One of the integers is missing
// from the list. Write an efficient code to find the missing integer.
// Example:

// Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
// Output: 5
// Explanation: The missing number between 1 to 8 is 5

// Input: arr[] = {1, 2, 3, 5}
// Output: 4
// Explanation: The missing number between 1 to 5 is 4