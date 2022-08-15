package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class PrintMaxInWindowK {
    public static void maxInWindowK(int[] arr, int k) {
        int n = arr.length;
        Deque<Integer> dqu = new ArrayDeque<>();
        for (int i = 0; i < k; ++i) {
            while (!dqu.isEmpty() && arr[i] >= arr[dqu.peekLast()]) {
                dqu.removeLast();
            }
            dqu.addLast(i);
        }
        for (int i = k; i < n; ++i) {
            System.out.print(arr[dqu.peek()] + " ");
            while (!dqu.isEmpty() && dqu.peek() <= i - k) {
                dqu.removeFirst();
            }

            while (!dqu.isEmpty() && arr[i] >= arr[dqu.peekLast()]) {
                dqu.removeLast();
            }
            dqu.addLast(i);
        }

        System.out.println(arr[dqu.peek()]);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7, 9, 10 };

        int k = 3;

        maxInWindowK(arr, k);
    }
}
