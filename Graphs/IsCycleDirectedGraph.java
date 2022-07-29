package Graphs;

import java.util.*;

public class IsCycleDirectedGraph {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int a, int b) {
        adj.get(a).add(b);
    }

    public static boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[v];
        boolean[] recS = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                if (dfs(i, adj, vis, recS)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] recS) {
        vis[v] = true;
        recS[v] = true;

        for (int el : adj.get(v)) {
            if (!vis[el]) {
                if (dfs(el, adj, vis, recS)) {
                    return true;
                }
            } else if (recS[el]) {
                return true;
            }
        }

        recS[v] = false;
        return false;
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
        }

    }
}