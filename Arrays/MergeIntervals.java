package Arrays;

import java.util.*;

/**
 * Trail1
 */
class Interval {
    int start, end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MergeIntervals {
    static void mergeIntervals(Interval[] arr) {

        Arrays.sort(arr, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });
        Stack<Interval> st = new Stack<>();
        st.push(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            Interval top = st.peek();

            if (top.end < arr[i].start) {
                st.push(arr[i]);
            }

            else if (top.end < arr[i].end) {
                top.end = arr[i].end;
                st.pop();
                st.add(top);
            }
        }

        System.out.println("The Merged Intervals are :- ");

        while (!st.isEmpty()) {
            Interval i = st.pop();
            System.out.print("[" + i.start + ", " + i.end + "] ");
        }
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int n = intervals.length;
        Interval[] arr = new Interval[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Interval(intervals[i][0], intervals[i][1]);
        }

        mergeIntervals(arr);
    }
}

// Implement an algorithm, Given an array of intervals where intervals[i] =
// [starti, endi], merge all overlapping intervals, and return an array of the
// non-overlapping intervals that cover all the intervals in the input.
// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].