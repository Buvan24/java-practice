class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
    }
}
class BST_Methods{
    Node root;
    void insert(int data){
        root=insertdata(root,data);
    }
    Node insertdata(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=insertdata(root.left,data);
        }
        else if(data>root.data){
            root.right=insertdata(root.right,data);
        }
        return root;
    }

    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    boolean search(Node root,int target){
        if(root==null)
        return false;
        else if(root.data==target)
        return true;
        else if(target<root.data)
        return search(root.left,target);
        else
        return search(root.right,target);
    }
    Node delete(Node root,int data){
        if(root==null) return null;

        if(data<root.data) root.left=delete(root.left,data);
        else if(data>root.data) root.right=delete(root.right,data);

        else{
            if(root.left==null && root.right==null)   return null;
            else if(root.left==null)    return root.right;
            else if(root.right==null) return root.left;
            
            Node successor=findMin(root.right);
            root.data=successor.data;
            root.right=delete(root.right,successor.data);
        }
        return root;
    }
    Node findMin(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
}
public class BST{
    public static void main(String args[]){
        BST_Methods obj=new BST_Methods();
        obj.insert(20);
        obj.insert(10);
        obj.insert(30);
        obj.insert(5);
        obj.insert(50);
        obj.insert(15);
        obj.inorder(obj.root); 
        System.out.println();
        if(obj.search(obj.root,30))
        System.out.println("Found");
        else
        System.out.println("Not Found");     
    }
}
