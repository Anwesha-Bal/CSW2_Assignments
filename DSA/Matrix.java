package DSA;
import java.util.*;
class Graph2{
	private int v;
	private List<List<Integer>> adjList;
	private int [][] adjMatrix;
	public Graph2(int v) {
		this.v = v;
		adjList = new ArrayList<>(v);
		adjMatrix = new int[v][v];
		for(int i =0 ; i<v;i++) {
			adjList.add(new LinkedList<>());
		}
	}
	public void addEdge(int src , int dest) {
		//ADD EDGE TO ADJANCENCY LIST
		adjList.get(src).add(dest);
		//ADD EDGE TO ADJANCENCY MATRIX
		adjMatrix[src][dest]=1;
	}
	public void displayAdjMatrix() {
		System.out.println("Adjacency Matrix: ");
		for(int i =0 ; i<v ; i++) {
			for(int j =0 ; j<v;j++) {
				System.out.print(adjMatrix[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	public void displayAdjList() {
		System.out.println("Adjancency List: ");
		for(int i =0 ; i<v ; i++) {
			System.out.print(i+" -> ");
			for(Integer neighbour : adjList.get(i)) {
				System.out.print(neighbour+" ");
			}
			System.out.println();
		}
	}
}
public class Matrix {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 5;
		Graph2 graph = new Graph2(v);
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.displayAdjMatrix();
		System.out.println();
		graph.displayAdjList();
	}
}
