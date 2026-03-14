class Graph_Method{
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	int size;
	Node[] arr;
	Graph_Method(int size){
		this.size = size;
		arr = new Node[size];
	}
	void addedge(int u,int v) {
		Node newNode=new Node(v);
		newNode.next=arr[u];
		arr[u]=newNode;

		newNode =new Node(u);
		newNode.next=arr[v];
		arr[v]=newNode;
	}

	void dfs(int st){
		boolean[] vis=new boolean[size];
		dfs_traverse(st,vis);
	}
	void dfs_traverse(int st,boolean[] vis){
		vis[st]=true;
		System.out.println(st+ " ");
		Node temp=arr[st];
		while (temp!=null) {
			if(!vis[temp.data]){
				dfs_traverse(temp.data, vis);
			}
			temp=temp.next;
		}
	 
	}

	void bfs(int st){
		boolean vis[]=new boolean[size];
		int store[]=new int[size];
		int front=0,rear=0;
		vis[st]=true;
		store[rear++]=st;
		while (front<rear) {
			int node=store[front++];
			System.out.print(node+" ");
			Node temp=arr[node];
			while (temp!=null) {
				if(!vis[temp.data]){
					vis[temp.data]=true;
					store[rear++]=temp.data;
				}
				temp=temp.next;
				
			}
		}

	}

}
public class GraphLinkedList {
	public static void main(String[] args) {
		Graph_Method obj = new Graph_Method(5);
		obj.addedge(0, 1);
        obj.addedge(0, 2);
    //    obj.addedge(1, 3);
    //    obj.addedge(1, 4);
		obj.bfs(0);
	}
}