package Graphs;

import java.util.*;

public class BFS {

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int a, int b) {
        adj.get(a).add(b);
        adj.get(b).add(a);
    }

    public static boolean bfs(ArrayList<ArrayList<Integer>> adj, int v, int src, int dest, int[] pred, int[] dist) {
        boolean[] visited = new boolean[v + 1];
        for (int i = 0; i <= v; i++) {
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }
        Queue<Integer> queue = new LinkedList<>();

        visited[src] = true;
        queue.add(src);
        dist[src] = 0;

        while (!queue.isEmpty()) {
            int cur = queue.remove();
            for (int i = 0; i < adj.get(cur).size(); i++) {
                int neighbor = adj.get(cur).get(i);
                if (visited[neighbor] == false) {
                    visited[neighbor] = true;
                    pred[neighbor] = cur;
                    dist[neighbor] = dist[cur] + 1;
                    queue.add(neighbor);
                    if (neighbor == dest) {
                        return true;
                    }
                }
            }
        }

        return false;

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 6;
        for (int i = 0; i <= v; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 5);
        addEdge(adj, 3, 4);
        addEdge(adj, 5, 4);
        // addEdge(adj, 5, 6);
        addEdge(adj, 4, 6);

        int[] pred = new int[v + 1];
        int[] dist = new int[v + 1];

        System.out.println(bfs(adj, v, 1, 6, pred, dist) + " Has minimum distance :- " + dist[6]);

        for (int i = 1; i <= v; i++) {
            System.out.println(dist[i] + " : " + pred[i]);
        }
    }
}
