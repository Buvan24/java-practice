
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
	}
}
class Binary_Method{
	Node root;
	void insert(int data) {
		root = insertdata(root,data);
	}
	Node insertdata(Node root,int data) {
		if(root == null) {
			return new Node(data);
		}
		if(root.left == null) {
			root.left = insertdata(root.left,data);
		}
		else {
			root.right = insertdata(root.right,data);
		}
		return root;
	}
	void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	void preorder(Node root) {
		if(root!=null) {
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	void postorder(Node root) {
		if(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
	}
}
public class BinaryTree {
	public static void main(String[] args) {
		Binary_Method obj = new Binary_Method();
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		obj.insert(40);
		obj.insert(50);
		System.out.print("Inorder  : ");
		obj.inorder(obj.root);
		System.out.println();
		System.out.print("Preorder  : ");
		obj.preorder(obj.root);
		System.out.println();
		System.out.print("Postorder  : ");
		obj.postorder(obj.root);
		System.out.println();
	}
}