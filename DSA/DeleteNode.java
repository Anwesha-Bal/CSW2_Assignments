package DSA;
public class DeleteNode {
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
	public void inorderRec(Node root) {
		if(root != null) {
			inorderRec(root.left);
			System.out.println(root.key+" ");
			inorderRec(root.right);
		}
	}
	Node deleteRec(Node root , int key) {
		if(root==null) {
			return root;
		}
		if(key<root.key) {
			root.left = deleteRec(root.left,key);
		}
		else if(key>root.key) {
			root.right = deleteRec(root.right , key);
		}
		else {
			if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
			root.key = minValue(root.right);
			root.right=deleteRec(root.right,root.key);
		}
			
			return root;
		
	}
		public int minValue(Node root) {
			int minv = root.key;
			while(root.left!=null) {
				minv = root.left.key;
				root = root.left;
				}
			return minv;
		}
		public boolean search(Node root , int key) {
			if(root==null||root.key==key) {
				return root!=null;
			}
			if(root.key<key) {
				return search(root.right,key);
			}
			return search(root.left,key);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteNode tree = new DeleteNode();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.inorderRec(root);
		System.out.println();
		int keyToDelete = 50;
		tree.deleteRec(tree.root,keyToDelete);
		System.out.println("Inorder traversal after deleting "+keyToDelete);
		tree.inorderRec(root);
		int key = 70;
		boolean searchKey = tree.search(root,key);
		if(searchKey==true) {
		System.out.println(key+" is present found ");
		}
		else {
			System.out.println(key+" is present not found ");
		}
	}
}

//OTPUT
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
//20 
//30 
//40 
//50 
//60 
//70 
//80 
//
//Inorder traversal after deleting 50
//20 
//30 
//40 
//60 
//70 
//80 
//70 is present found