package DSA;
import java.util.*;
class Graph1<T>{
	private Map<T , List<T>> map = new HashMap<>();
	public void addNewVertex(T s){
		map.put(s, new LinkedList<T>());
	}
	public void addNewEdege(T source , T destination , boolean bidirectional) {
		if(!map.containsKey(source)) {
			addNewVertex(source);
		}
		if(!map.containsKey(destination)) {
			addNewVertex(destination);
		}
		map.get(source).add(destination);
		if(bidirectional==true) {
			map.get(destination).add(source);
		}
	}
	public void countVertices() {
		System.out.println("Total number of vertices: "+map.keySet().size());
	}
	public void countEdge(boolean bidirectional) {
		int count = 0;
		for(T v : map.keySet()) {
			count = count+map.get(v).size();
		}
		if(bidirectional==true) {
			count = count/2;
		}
		System.out.println("Total number of edges: "+count);
	}
	public void containsVertex(T s) {
		if(map.containsKey(s)) {
			System.out.println("The graph contains "+s+" as a vertex");
		}
		else {
			System.out.println("The graph does not contain "+s+" as vertex");
		}
	}
	public void containEdge(T s , T d) {
		if(map.get(s).contains(d)) {
			System.out.println("There is an edge between "+s+" and "+d);
		}
		else {
			System.out.println("There is no edge between "+s+" and "+d);
		}
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for(T v : map.keySet()) {
			builder.append(v.toString()+": ");
			for(T w : map.get(v)) {
				builder.append(w.toString()+" ");
			}
		
		builder.append("\n");
		}
		return (builder.toString());
	}
}
public class Graph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph1 graph = new Graph1();
		graph.addNewEdege(0, 1, true);
		graph.addNewEdege(0, 4, true);
		graph.addNewEdege(1, 2, true);
		graph.addNewEdege(1, 3, true);
		graph.addNewEdege(1, 4, true);
		graph.addNewEdege(2, 3, true);
		graph.addNewEdege(2, 4, true); 
		graph.addNewEdege(3, 0, true);
		graph.addNewEdege(2, 0, true);
		System.out.println("Adjancency List for the graph: "+graph.toString());
		graph.countVertices();
		graph.countEdge(true);
		graph.containEdge(3, 4);
		graph.containEdge(2, 4);
		graph.containsVertex(3);
		graph.containsVertex(5);
		
	}
}
