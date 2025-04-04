package Assignment_BST;


class BNode{
	Country data;
	BNode left;
	BNode right;
	BNode(Country data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	@Override
	public String toString() {
		return "BNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
}
class Country{
	String name;
	int population;
	public Country(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + "]";
	}
	
}
public class Q4 {
	static BNode root ;
	BNode insertrec(BNode root , Country c) {
		if(root==null) {
			return new BNode (c);
		}
		if(c.population < root.data.population) {
			root.left = insertrec(root.left,c);
		}
		else if(c.population>root.data.population) {
			
			root.right = insertrec(root.right,c);
		}
		else {
			System.out.println("Inserted country "+c+" already exists");
		}
		return root;
	}
	void insert (Country c) {
		root = insertrec(root,c);
	}
	public void inorderRec(BNode root) {
		if(root != null) {
			inorderRec(root.left);
			System.out.println(root.data+" ");
			inorderRec(root.right);
		}
	}
	public BNode countryWithMaximumPopulation() {
		if(root==null) {
			return null;
		}
		BNode current = root;
		while(current.right!=null) {
			current=current.right;
		}
		return current;
	}
	public BNode countryWithMinimumPopulation() {
		if(root==null) {
			return null;
		}
		BNode current = root;
		while(current.left!=null) {
			current=current.left;
		}
		return current;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q4 country_tree = new Q4();
		country_tree.insert(new Country("India",2000));
		country_tree.insert(new Country("China",3000));
		country_tree.insert(new Country("America",1500));
		country_tree.insert(new Country("Australia",500));
		country_tree.insert(new Country("Japan",900));
		country_tree.insert(new Country("Russia",1100));
		System.out.println("Countries name in sorted order according to population: ");
		country_tree.inorderRec(root);
		System.out.println("Country with maximum population: "+country_tree.countryWithMaximumPopulation().data);
		System.out.println("Country with minimum population: "+country_tree.countryWithMinimumPopulation().data);
		}
}

//Output
//Countries name in sorted order according to population: 
//Country [name=Australia, population=500] 
//Country [name=Japan, population=900] 
//Country [name=Russia, population=1100] 
//Country [name=America, population=1500] 
//Country [name=India, population=2000] 
//Country [name=China, population=3000] 
//Country with maximum population: Country [name=China, population=3000]
//Country with minimum population: Country [name=Australia, population=500]