package graphs;
import java.util.*;
public class DFS {
	private int V;
	private LinkedList<Integer> G[];
	public DFS(Integer V) {
		this.V=V;
		G = new LinkedList[V];
		for(int i=0;i<V;i++) {
			G[i] = new LinkedList<Integer>();
		}
	}
	public void addEdge(int u, int v) {
		G[u].add(v);
	}
	public void DFS_Traverse(Integer s) throws InterruptedException {
		Integer[] visited = new Integer[V];
		for(int i=0;i<visited.length;i++) {
			visited[i]=0;
		}
		DFS_helper(s,visited);
		
	}
	public void DFS_helper(Integer s,Integer[] visited) throws InterruptedException {
		Thread.sleep(2000);
		if(visited[s]==1) {
			System.out.println("Node was already visited "+s);
			return;
		}
		visited[s]=1;
		System.out.println(s);
		for(int i=0;i<G[s].size();i++) {
			DFS_helper(G[s].get(i),visited);
		}
	}
	public void display() {
		for(int i=0;i<G.length;i++) {
			System.out.println(G[i]);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		DFS d = new DFS(6);
		d.addEdge(0, 1);
		d.addEdge(1, 3);
		d.addEdge(0, 4);
		d.addEdge(2, 1);
		d.addEdge(3, 4);
		d.addEdge(1, 5);
		d.addEdge(4, 5);
		d.addEdge(5, 3);
		d.display();
		d.DFS_Traverse(0);
	}
}
