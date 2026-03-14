public class Dijkstra {
    static void dijkstra(int[][] graph,int v,int src){

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