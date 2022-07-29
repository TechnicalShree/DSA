package Graphs;

import java.util.*;

public class TopologicalSort {
    public static void topologicalSortUtil(int v, boolean[] visited, Stack<Integer> st,
            ArrayList<ArrayList<Integer>> adj) {
        visited[v] = true;

        for (int i = 0; i < adj.get(v).size(); i++) {
            int j = adj.get(v).get(i);
            if (!visited[j]) {
                topologicalSortUtil(j, visited, st, adj);
            }
        }

        st.push(v);
    }

    public static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int v) {
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[v];

        for (int i = 0; i < v; i++) {
            visited[i] = false;
        }

        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                topologicalSortUtil(i, visited, st, adj);
            }
        }

        while (!st.isEmpty()) {
            System.out.print(st.pop());
        }
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int a, int b) {
        adj.get(a).add(b);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int V = sc.nextInt();
            int e = sc.nextInt();

            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }

            while (e-- > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                addEdge(adj, a, b);
            }

            topologicalSort(adj, V);
        }
    }
}