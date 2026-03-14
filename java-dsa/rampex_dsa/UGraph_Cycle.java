public class UGraph_Cycle {
	static boolean dfs(int node,int parent,boolean[] visited,int[][] graph,int v) {
		visited[node] = true;
		for(int i=0;i<v;i++){
			if(graph[node][i]==1) {
				if(!visited[i]) {
					if(dfs(i,node,visited,graph,v)) {
						return true;
					}
				}
				else if(i!=parent) {
					return true;
				}
			}
		}
		return false;
	}
	static boolean cycle(int graph[][],int v) {
		boolean visited[] = new boolean[v];
		for(int i=0;i<v;i++) {
			if(!visited[i]) {
				if(dfs(i,-1,visited,graph,v)) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int v = 4;
		int graph[][] = {
				{0,1,0,1},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,1,0}
		};
		System.out.println(cycle(graph,v));
	}
}

/*

 * 

 * EXAMPLE : 

 * 

 * 	0 is connected with 1,same time 1 is connected with 0 its not a cycle.
 * 	because , is a parent for 1 . Parent noded will not forms a cycle
 * 	(so the condition i!= parent is given)

 * 

 */