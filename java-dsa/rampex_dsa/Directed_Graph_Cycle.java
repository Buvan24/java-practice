public class Directed_Graph_Cycle {
	static boolean dfs(int node,boolean[] visited,boolean[] stack,int[][] graph,int v) {
		visited[node] = true;
		stack[node] = true;
		for(int i=0;i<v;i++) {
			if(graph[node][i]==1){
				if(!visited[i]) {
					if(dfs(i,visited,stack,graph,v)) {
						return true;						
					}
				}
					else if(stack[i]) {
						return true;
					}
                }
			}
		return false;
		}
	static boolean cycle(int graph[][],int v) {
		boolean visited[] = new boolean[v];
		boolean stack[] = new boolean[v];
		for(int i=0;i<v;i++) {
			if(!visited[i]) {
				if(dfs(i,visited,stack,graph,v)) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int v = 4;
		int graph[][] = {
				{0,1,0,0},
				{0,0,1,0},
				{0,0,0,1},
				{0,0,0,0} 
		};
		System.out.println(cycle(graph,v));
    }
}