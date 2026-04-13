import java.util.Queue;
import java.util.LinkedList;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
    }
    
}
class BT{
    Node root;
     void insert(int data){
        if(root==null){
            root=new Node(data);
        }
        else{
           Queue<Node> q=new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty()){
                Node temp=q.poll();
                if(temp.left==null){
                    temp.left=new Node(data);
                    return;
                }
                else{
                    q.offer(temp.left);
                }
                if(temp.right==null){
                    temp.right=new Node(data);
                    return;
                }
                else{
                    q.offer(temp.right);
                }

            }
        }
    }
    void print(Node root){
        if(root==null)return;
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }
    void printLevel(Node root){
        Queue <Node> q=new LinkedList<>();
        q.offer(root);
        int l=0;
        while(!q.isEmpty()){
            int s=q.size();
            System.out.print(l+"=>");
            for(int i=0;i<s;i++){
                Node temp=q.poll();
                System.out.print(temp.data+ " ");
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
            }
            System.out.println();
            l++;
        }
    }

    public static void main(String[] args) {
        BT obj=new BT();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.insert(60);
        obj.insert(70);

        obj.printLevel(obj.root);
    }
}