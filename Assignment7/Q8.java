package Assignment7;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
class Graph1 {
    private int vertices;
    private ArrayList<ArrayList<Integer>> adjList;

    public Graph1(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    public void displayAdjList() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Adjacency list of vertex " + i + ": ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    
    public void BFS(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new ArrayDeque<>();

        visited[startVertex] = true;
        queue.offer(startVertex);

        System.out.print("BFS traversal starting from vertex " + startVertex + ": ");

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            for (int neighbor : adjList.get(currentVertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println();
    }
}
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Graph1 graph = new Graph1(6);
		        graph.addEdge(0, 1);
		        graph.addEdge(0, 2);
		        graph.addEdge(1, 3);
		        graph.addEdge(2, 4);
		        graph.addEdge(3, 5);
		        graph.displayAdjList();
		        graph.BFS(0);
	}
}
//OUTPUT
//Adjacency list of vertex 0: 1 2 
//Adjacency list of vertex 1: 0 3 
//Adjacency list of vertex 2: 0 4 
//Adjacency list of vertex 3: 1 5 
//Adjacency list of vertex 4: 2 
//Adjacency list of vertex 5: 3 
//BFS traversal starting from vertex 0: 0 1 2 3 4 5 
