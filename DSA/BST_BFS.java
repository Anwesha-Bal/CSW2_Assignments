package DSA;
import java.util.LinkedList;
import java.util.Queue;
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
public class BST_BFS {
	static Node root;
	Node insertRec(Node root , int key) {
		if(root==null) {
			System.out.println("Inserted "+key);
			return new Node(key);
		}
		if(key<root.key) {
			System.out.println("Inserted key "+key+" to the left of "+root.key);
			root.left  = insertRec(root.left,key);
		}
		else if(key>root.key){
			System.out.println("Inserted key "+key+" to the right of "+root.key);
			root.right = insertRec(root.right,key);
		}
		else {
			System.out.println("key "+key+" already exist in the tree");
		}
		return root;
	}
	void insert(int key) {
		root = insertRec(root,key);
	}
	//BFS TRAVERSAL
	void levelOrder() {
	if(root==null) {
		return;
	}
	Queue<Node> queue = new LinkedList<>();
	queue.add(root);
	while(!queue.isEmpty()) {
		Node tempNode = queue.poll();
		System.out.println(tempNode.key+" ");
		if(tempNode.left!=null) {
			queue.add(tempNode.left);
		}
		if(tempNode.right!=null) {
			queue.add(tempNode.right);
		}
	}
	}
	
//DFS
	public void inorderRec(Node root) {
		if(root != null) {
			inorderRec(root.left);
			System.out.println(root.key+" ");
			inorderRec(root.right);
		}
	}
	public void traversePreOrder(Node root) {
		if(root!=null) {
			System.out.println(" "+root.key);
			traversePreOrder(root.left);
			traversePreOrder(root.right);
		}
	}
	public void traversePostOrder(Node root) {
		if(root!=null) {
			traversePostOrder(root.left);
			traversePostOrder(root.right);
			System.out.println(" "+root.key);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST_BFS tree = new BST_BFS();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		System.out.println("BFS TRAVERSAL: ");
		tree.levelOrder();
		System.out.println();
		System.out.println("PREORDER TRAVERSAL: ");
		tree.traversePreOrder(root);
		System.out.println("INORDER TRAVERSAL: ");
		tree.inorderRec(root);
		System.out.println("POSTORDER TRAVERSAL: ");
		tree.traversePostOrder(root);
	}
}

//OUTPUT
//Inserted 50
//Inserted key 30 to the left of 50
//Inserted 30
//Inserted key 20 to the left of 50
//Inserted key 20 to the left of 30
//Inserted 20
//Inserted key 40 to the left of 50
//Inserted key 40 to the right of 30
//Inserted 40
//Inserted key 70 to the right of 50
//Inserted 70
//Inserted key 60 to the right of 50
//Inserted key 60 to the left of 70
//Inserted 60
//Inserted key 80 to the right of 50
//Inserted key 80 to the right of 70
//Inserted 80
//BFS TRAVERSAL: 
//50 
//30 
//70 
//20 
//40 
//60 
//80 
//
//PREORDER TRAVERSAL: 
// 50
// 30
// 20
// 40
// 70
// 60
// 80
//INORDER TRAVERSAL: 
//20 
//30 
//40 
//50 
//60 
//70 
//80 
//POSTORDER TRAVERSAL: 
// 20
// 40
// 30
// 60
// 80
// 70
// 50