package graphs;
import java.util.*;
public class DFS_Map {
	private int V;
	private Map<Integer,LinkedList<Integer>> G;
	public DFS_Map(int V) {
		this.V = V;
		G = new HashMap<Integer,LinkedList<Integer>>();
		for(int i=1;i<=V;i++) {
			G.put(i, new LinkedList<Integer>());
		}
	}
	public void addEdge(Integer u,Integer v) {
		List<Integer> l = G.get(u);
		if (l.indexOf(v)==-1){
			G.get(u).add(v);
		}
	}
	
	public void DFS(Integer s) {
		Integer[] visited = new Integer[V+1];
		for(int i=1;i<V;i++) {
			visited[i]=0;
		}
		DFS_Helper(s,visited);
	}
	public void DFS_Helper(Integer s, Integer[] visited) {
		if(visited[s]==1) {
			return;
		}
		visited[s] = 1;
		System.out.println(s+" ");
		for(Integer i:G.get(s)) {
			DFS_Helper(i, visited);
		}
	}
	public void display() {
		for(Map.Entry<Integer, LinkedList<Integer>> e:G.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
	public static void main(String[] args) {
		DFS_Map d = new DFS_Map(6);
		d.addEdge(1, 2);
		d.addEdge(1, 3);
		d.addEdge(1, 4);
		d.addEdge(2, 3);
		d.addEdge(3, 4);
		d.addEdge(4, 5);
		d.addEdge(5, 6);
		d.addEdge(6, 3);
		d.addEdge(6, 3);
		d.display();
		d.DFS(1);
	}
}	
