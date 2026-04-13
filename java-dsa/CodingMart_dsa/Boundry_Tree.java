import java.util.*;
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}
class BoundaryTraversal {
    static void  printBoundary(Node root){
        if(root==null) return ;
        System.out.print(root.data+" ");
        printLeft(root.left);
        printLeaf(root.left);
        printLeaf(root.right);
        printRight(root.right);
    }

    static void printLeft(Node root){
        if(root == null) return ;
        if(root.left !=null){
            System.out.print(root.data+" ");
            printLeft(root.left);
        }
        else if(root.right!=null){
            System.out.print(root.data+" ");
            printLeft(root.right);
        }
    }

    static void printLeaf(Node root){
        if(root==null) return;
        printLeaf(root.left);
        if(root.left==null && root.right==null){
            System.out.print(root.data+" ");
        }
        printLeaf(root.right);
    }

     static void printRight(Node root){
        if(root == null) return ;
        if(root.right !=null){
            printRight(root.right);
            System.out.print(root.data+" ");
        }
        else if(root.left!=null){
            printRight(root.left);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(8);
        root.right.right = new Node(6);
        printBoundary(root);
    }
}