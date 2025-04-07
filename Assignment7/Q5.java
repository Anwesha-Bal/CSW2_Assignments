package Assignment7;
class MNode{
	int data;
	MNode left;
	MNode right;
	public MNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class Q5 {
	static MNode root;
	public MNode insertrec(MNode root , int data) {
		if(root==null) {
			
			return new MNode(data);
		}
		if(data<root.data) {
			root.left = insertrec(root.left,data);
		}
		else if(data>root.data) {
			root.right = insertrec(root.right,data);
		}
		else {
			System.out.println("Node already exist");
		}
		return root;
	}
	public void insert(int data) {
		root = insertrec(root , data);
	}
	public void inorderRec(MNode root) {
		if(root != null) {
			inorderRec(root.left);
			System.out.println(root.data+" ");
			inorderRec(root.right);
		}
	}
	public MNode deleteRec(MNode root , int key) {
		if(root==null) {
			return null;
		}
		if(key<root.data) {
			root.left = deleteRec(root.left,key);
		}
		else if(key>root.data) {
			root.right = deleteRec(root.right , key);
		}
		else {
			if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
			root.data = minValue(root.right);
			root.right=deleteRec(root.right,root.data);
		}
			
			return root;
	}
	public int minValue(MNode root) {
		int minv = root.data;
		while(root.left!=null) {
			minv = root.left.data;
			root = root.left;
			}
		return minv;
	}
	public boolean search(MNode root , int key) {
		if(root==null||root.data==key) {
			return root!=null;
		}
		if(root.data<key) {
			return search(root.right,key);
		}
		return search(root.left,key);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q5 tree = new Q5();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.insert(10);
		System.out.println("Original graph: ");
		tree.inorderRec(root);
		System.out.println("Deleted Leaf Node: ");
		tree.deleteRec(root, 20);
		tree.inorderRec(root);
		System.out.println("Deleted Node with one child: ");
		tree.deleteRec(root, 20);
		tree.inorderRec(root);
		System.out.println("Deleted Node with two children: ");
		tree.deleteRec(root, 50);
		tree.inorderRec(root);
	}

}

//OUTPUT
//Original graph: 
//10 
//20 
//30 
//40 
//50 
//60 
//70 
//80 
//Deleted Leaf Node: 
//10 
//30 
//40 
//50 
//60 
//70 
//80 
//Deleted Node with one child: 
//10 
//30 
//40 
//50 
//60 
//70 
//80 
//Deleted Node with two children: 
//10 
//30 
//40 
//60 
//70 
//80  
