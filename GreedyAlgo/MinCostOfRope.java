package GreedyAlgo;

import java.util.*;

public class MinCostOfRope {
    public static void main(String[] args) {
        Queue<Integer> que = new PriorityQueue<>((a, b) -> a - b);
        int[] arr = { 4, 3, 2, 6 };
        int n = 4;

        for (int i = 0; i < n; i++) {
            que.add(arr[i]);
        }
        int res = 0;
        while (que.size() > 1) {
            System.out.println(que);
            int temp = que.poll() + que.poll();
            res += temp;
            que.add(temp);
        }
        System.out.println(res);
    }
}

// Question :-

// There are given n ropes of different lengths, we need to connect these ropes
// into one rope. The cost to connect two ropes is equal to the sum of their
// lengths. We need to connect the ropes with minimum cost.

// For example, if we are given 4 ropes of lengths 4, 3, 2, and 6. We can
// connect the ropes in the following ways.

// First, connect ropes of lengths 2 and 3. Now we have three ropes of lengths
// 4, 6, and 5.
// Now connect ropes of lengths 4 and 5. Now we have two ropes of lengths 6 and
// 9.
// Finally connect the two ropes and all ropes have connected.
// Total cost for connecting all ropes is 5 + 9 + 15 = 29. This is the optimized
// cost for connecting ropes. Other ways of connecting ropes would always have
// same or more cost. For example, if we connect 4 and 6 first (we get three
// strings of 3, 2, and 10), then connect 10 and 3 (we get two strings of 13 and
// 2). Finally, we connect 13 and 2. Total cost in this way is 10 + 13 + 15 =
// 38.