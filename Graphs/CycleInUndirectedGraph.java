package Graphs;

import java.util.*;

public class CycleInUndirectedGraph {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int a, int b) {
        adj.get(a).add(b);
        adj.get(b).add(a);
    }

    public static boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[v];

        for (int i = 0; i < adj.size(); i++) {
            if (!vis[i]) {
                if (dfs(i, adj, vis, -1)) {
                    return true;
                }
            }
        }

        return false;

    }

    public static boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int parent) {
        vis[v] = true;

        for (Integer ele : adj.get(v)) {
            if (!vis[ele]) {
                if (dfs(ele, adj, vis, v)) {
                    return true;
                } else if (ele != parent) {
                    return true;
                }
            }
        }

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

            System.out.println(isCyclic(V, adj));
        }
    }
}
