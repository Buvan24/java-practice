class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}
class BinaryTree_M{
    Node root;
    void insert(int data){
        root=insertdata(root,data);
    }
    Node insertdata(Node root,int data){
        if(root==null){
             return new Node(data);
        }
        if(root.left==null){
            root.left=insertdata(root.left, data);
        }
        else{
            root.right=insertdata(root.right, data);
        }
        return root;
    }
}
public class BinaryTree {
    public static void main(String[] args) {
        BinaryTree_M obj=new BinaryTree_M();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        
    }
}
