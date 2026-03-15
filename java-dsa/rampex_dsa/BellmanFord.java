public class BellmanFord{
    static void bellman(int n,int e,int[][] graph,int src){
        int[] d=new int[n];
        for(int i=0;i<n;i++){
            d[i]=Integer.MAX_VALUE;
        }
        d[src]=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<e;j++){
                int u=graph[j][0];
                int v=graph[j][1];
                int w=graph[j][2];
                if(d[u]!=Integer.MAX_VALUE && d[u]+w<d[v]){
                    d[v]=d[u]+w;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("0 to "+i+": "+d[i]);
        }
    }

    public static void main(String args[]){
        int n=5;
        int e=8;
        int[][] graph={
            {0,1,-1},
            {0,2,4},
            {1,2,3},
            {1,3,2},
            {1,4,2},
            {3,2,5},
            {3,1,1},
            {4,3,-3}
        };
        int src=0;
        bellman(n,e,graph,src);
    }
}