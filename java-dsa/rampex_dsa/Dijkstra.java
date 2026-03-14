public class Dijkstra {
    static int findmin(int dis[],boolean[] vis,int v){
        int min_node=-1;
        for(int i=0;i<v;i++){
            if(!vis[i] && min_node==-1 || dis[i] < dis[min_node] ){
                min_node=i;
            }
        }
        return min_node;
    }
    static void dijkstra(int[][] graph,int v,int src){
        int dis[]=new int [v];
        boolean vis[]=new boolean[v];
        for(int i=0;i<v;i++){
            dis[i]=Integer.MAX_VALUE;
        }
        dis[src]=0;
        for(int i=0;i<v;i++){
            int min_node=findmin(dis,vis,v);
        }
    }
  public static void main(String[] args) {
    int v=5;
    int graph[][]={
        {0,10,0,5,0},
        {10,0,1,2,0},
        {0,1,0,0,4},
        {5,2,0,0,2},
        {0,0,4,2,0}
    };
    int src=0;
    dijkstra(graph,v,src);

  }  
}
/*

pick nearest unvisited neighbour
update its neifhbors
mark it as visited



     10
 0---------1
 |         |
5|         |2
 |         |
 3---------4
      2 

0--->4 =7
10+2=12
5+2=7

0--->1=9
10
5+2+2=9

*/