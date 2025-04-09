package Assignment7;
import java.util.*;
class Graph<T>{
	private LinkedList<T>[] adjList;
	private int vertices;
	Graph(int vertices){
		this.vertices = vertices;
		adjList = new LinkedList[vertices];
		for(int i = 0 ; i<vertices ; i++) {
			adjList[i]=new LinkedList<>();
		}
	}
	void addEdge(int src , T des) {
		if(src >=0 && src<vertices) {
			adjList[src].add(des);
		}
		else {
			throw new IndexOutOfBoundsException("Vertex "+src+" does not exist. ");
		}
	}
	void printAdjList() {
		for(int i =0 ; i<vertices ; i++) {
			System.out.print("Vertex "+i+" -> ");
			for(T vertex : adjList[i]) {
				System.out.print(vertex+" ");
			}
			System.out.println();
		}
	}
	void DFS (int vertex , boolean[]visited) {
		visited[vertex] = true;
		System.out.print(vertex+" ");
		for(T v : adjList[vertex]) {
			int n = (int) v;
			if(!visited[n]) {
				DFS(n,visited);
			}
		}
	}
}
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		int vertices = ip.nextInt();
		Graph<Integer> g = new Graph<>(vertices);
		System.out.println("Enter the number of edges");
		int edges = ip.nextInt();
		System.out.println("Enter the edges: ");
		for(int i = 0 ; i<edges;i++) {
			System.out.println("Sources: ");
			int source = ip.nextInt();
			System.out.println("Destination: ");
			int destination = ip.nextInt();
			g.addEdge(source , destination);
		}
		boolean[]visited = new boolean[vertices];
		System.out.println("\nAdjacency List: ");
		g.printAdjList();
		System.out.println("\n Following depth first traversal: ");
		for(int i = 0 ; i<vertices;i++) {
			if(!visited[i]) {
				g.DFS(i, visited);
			}
		}
		ip.close();
	}

}
//OUTPUT
//Enter the number of vertices
//4
//Enter the number of edges
//4
//Enter the edges: 
//Sources: 
//0
//Destination: 
//1
//Sources: 
//0
//Destination: 
//2
//Sources: 
//1
//Destination: 
//3
//Sources: 
//2
//Destination: 
//3
//
//Adjacency List: 
//Vertex 0 -> 1 2 
//Vertex 1 -> 3 
//Vertex 2 -> 3 
//Vertex 3 -> 
//
// Following depth first traversal: 
//0 1 3 2 