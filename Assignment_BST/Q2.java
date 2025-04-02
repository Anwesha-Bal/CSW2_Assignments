package Assignment_BST;
class Node{
	int key;
	Node left;
	Node right;
	public Node(int value) {
		this.key = value;
		this.left = null;
		this.right = null;
	}
}
public class Q2 {
	static Node root;
	public Node createTree(int[]arr,int start , int end) {
		if(start>end) {
			return null;
		}
		int mid = (start+end)/2;
		Node node = new Node(arr[mid]);
		node.left = createTree(arr , start,mid-1);
		node.right = createTree(arr , mid+1 , end);
		return node;
	}
	public void inOrderTraversal(Node root) {
		if(root!=null) {
			inOrderTraversal(root.left);
			System.out.println(root.key+" ");
			inOrderTraversal(root.right);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2 tree = new Q2();
		int[]arr = {10,20,30,40,50,60,70,80,90,100};
		int n = arr.length;
		tree.root= tree.createTree(arr, 0, n-1);
		System.out.println("INORDER TRAVERSAL of constructed BST: ");
		tree.inOrderTraversal(root);
		
	}

}
