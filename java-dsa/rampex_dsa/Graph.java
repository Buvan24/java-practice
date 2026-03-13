class Node{
    int size;
    int arr[][];
    Node(int size){
        this.size=size;
        arr=new int[size][size];
    }
    void addedge(int u,int v){
        arr[u][v]=1;
        arr[v][u]=1;
    }


    void dfs(int st){
        boolean vis[]=new boolean[size];
        dfs_traverse(st,vis);
    }
    void dfs_traverse(int st,boolean[] vis){
        vis[st]=true;
        System.out.print(st+" ");
        for (int i=0;i<size;i++) {
            if(arr[st][i]==1 && !vis[i]){
                dfs_traverse(i, vis);
            }
        }
    }

    void bfs(int st){
        boolean vis[]=new boolean[size];
        int store[]=new int[size];
        int front =0;//0 1|2|3
        int rear=0;//0 1 2 3|4 |5
        vis[st]=true;
        store[rear++]=st;// 0 
        while (front<rear) {//0<1 |1<3 |2<4 |
            int node = store[front++];//0 |1 |2
            System.out.print(node+" ");//0 1 2
            for(int i=0;i<size;i++){
                if(arr[node][i]==1 && !vis[i]){
                    vis[i]=true;
                    store[rear++]=i;
                }
            }
        }
    }
    
}
public class Graph {
    public static void main(String[] args) {
        Node obj=new Node(5);
        obj.addedge(0, 1);
        obj.addedge(0, 2);
        obj.addedge(1, 3);
        obj.addedge(2, 4);
        //obj.dfs(0);
        obj.bfs(0);
    }
    
}
