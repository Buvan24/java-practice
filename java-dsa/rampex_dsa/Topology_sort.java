public class Topology_sort {
    static int stack[];
    static int top = -1;

    static void dfs(int node, boolean[] visited, int graph[][], int v) {
        visited[node] = true;
        for (int i = 0; i < v; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                dfs(i, visited, graph, v);
            }
        }
        stack[++top] = node;
    }

    static void toposort(int[][] graph, int v) {
        boolean visited[] = new boolean[v];
        stack = new int[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                dfs(i, visited, graph, v);
            }
        }
        while (top != -1) {
            System.out.print(stack[top--] + " ");
        }
    }

    public static void main(String[] args) {
        int v = 6;
        int graph[][] = {
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 0, 0 }
        };
        toposort(graph, v);
    }

}
/*
 * Graph
 * {0,0,0,0,0,0},
 * {0,0,0,0,0,0},
 * {0,0,0,1,0,0},
 * {0,0,0,0,0,0},
 * {0,1,0,0,0,0},
 * {1,0,1,0,0,0},
 * 
 * 5 -------> 2 --------> 3
 * |
 * |
 * v
 * 0
 * 
 * 4 ------> 1
 * 
 * op:5 4 3 2 1 0 or 5 4 1 3 2 0
 * 
 * Its is possible in Acyclic Graph
 * Need to maintain Dependency Ordering
 * 
 */