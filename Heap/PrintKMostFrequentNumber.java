package Heap;

import java.util.*;

public class PrintKMostFrequentNumber {

    static void print_N_mostFrequentNumber(int[] arr, int n, int k) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
                (a, b) -> a.getValue().equals(b.getValue())
                        ? Integer.compare(b.getKey(),
                                a.getKey())
                        : Integer.compare(b.getValue(),
                                a.getValue()));

        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
            queue.offer(entry);

        int res = 0;
        for (int i = 0; i < k; i++) {

            res += queue.poll().getValue();
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int n = 8;
        int[] arr = { 3, 1, 4, 4, 5, 2, 6, 1 };

        int k = 2;

        print_N_mostFrequentNumber(arr, n, k);
    }
}

// K Most occurring elements

// Problem Statement
// Given an array arr[] of N integers in which elements may be repeating several
// times. Also, a positive number K is given and the task is to find sum of
// total frequencies of K most occurring elements

// Note: The value of K is guaranteed to be less than or equal to the number of
// distinct elements in arr.
// Input
// First line of input contains number of testcases T. For each testcase, first
// line of input contains the size of array N, and next line contains N positive
// integers. The last line contains K.

// Constraints:
// 1 <= T <= 100
// 1 <= K <= N
// 1 <= N <= 10^4
// 1 <= arr[i] <= 10^6
// Output
// For each testcase, print the sum of total frequencies of K most occurring
// elements in the given array.
// Example
// Sample Input:
// 2
// 8
// 3 1 4 4 5 2 6 1
// 2
// 8
// 3 3 3 4 1 1 6 1
// 2

// Sample Output:
// 4
// 6

// Explanation:
// Testcase 1: Since, 4 and 1 are 2 most occurring elements in the array with
// their frequencies as 2, 2. So total frequency is 2 + 2 = 4.

// Testcase 2: Since, 3 and 1 are most occurring elements in the array with
// frequencies 3, 3 respectively. So, total frequency is 6.