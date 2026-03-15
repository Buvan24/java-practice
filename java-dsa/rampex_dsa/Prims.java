public class Prims {
    static int minkey(int[] key, boolean[] vis, int V) {
        int min = Integer.MAX_VALUE;
        int min_Index = -1;
        for (int i = 0; i < V; i++) {
            if (!vis[i] && key[i] < min) {
                min = key[i];
                min_Index = i;
            }
        }
        return min_Index;
    }

    static void prims_MST(int graph[][], int V) {
        int parent[] = new int[V];
        int key[] = new int[V];
        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
        }
        key[0] = 0;
        parent[0] = -1;
        for (int i = 0; i < V - 1; i++) {
            int u = minkey(key, vis, V);
            vis[u] = true;
            for (int j = 0; j < V; j++) {
                if (graph[u][j] != 0 && !vis[j] && graph[u][j] < key[j]) {
                    parent[j] = j;
                    key[j] = graph[u][j];
                }
            }
        }
        for (int i = 1; i < V; i++) {
            System.out.println(key[i]);
        }
    }

    public static void main(String[] args) {
        int graph[][] = {
                { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 }
        };
        prims_MST(graph, 5);
    }
}
