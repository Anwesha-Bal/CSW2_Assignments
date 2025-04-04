package Assignment_BST;

import DSA.BST_BFS;

class BSTNode{
	int info;
	BSTNode left;
	BSTNode right;
	BSTNode(int info){
		this.info = info;
		this.left = null;
		this.right = null;
	}
}
public class Q1 {
	static BSTNode root;
	public void insert(int info) {
		if(root==null) {
			System.out.println("Inserted "+info);
			root = new BSTNode(info);
		}
		if(info<root.info) {
			root.left = new BSTNode(info);
			System.out.println("Inserted key "+info+" to the left of "+root.info);
			root = root.left;
		}
		if(info>root.info) {
			root.right = new BSTNode(info);
			System.out.println("Inserted key "+info+" to the right of "+root.info);
			root = root.right;
		}
	}
	public void preOrderTraversal(BSTNode root) {
		if(root!=null) {
			System.out.println(" "+root.info);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	public void inOrderTraversal(BSTNode root) {
		if(root!=null) {
			inOrderTraversal(root.left);
			System.out.println(root.info+" ");
			inOrderTraversal(root.right);
		}
	}
	public void postOrderTraversal(BSTNode root) {
		if(root!=null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.println(root.info+" ");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 tree = new Q1();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		System.out.println();
		System.out.println("PREORDER TRAVERSAL: ");
		tree.preOrderTraversal(tree.root);
		System.out.println("INORDER TRAVERSAL: ");
		tree.inOrderTraversal(tree.root);
		System.out.println("POSTORDER TRAVERSAL: ");
		tree.postOrderTraversal(tree.root);
	}

}
