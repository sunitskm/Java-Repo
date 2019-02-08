package graphs;
import java.util.*;
public class FindElementDFS {
	private Integer V;
	private LinkedList<Integer>[] G;
	public FindElementDFS(Integer V) {
		this.V = V;
		G = new LinkedList[V];
		for(int i=0;i<V;i++) {
			G[i] = new LinkedList<Integer>();
		}
	}
	public void addEdge(Integer v,Integer u) {
		if(v>=V||u>=V) {
			return;
		}
		if(G[v].indexOf(u)>=0) {
			return;
		}
		G[v].add(u);
	}
	public void display() {
		for( int i=0;i<G.length;i++) {
			System.out.println(i+" "+G[i]);
		}
	}
	public void DFSSearch(Integer s, Integer d) throws InterruptedException {
		Integer[] visited = new Integer[V];
		for(int i=0;i<V;i++) {
			visited[i] = 0;
		}
		DFS_Helper(s,d,visited);
	}
	
	public void DFS_Helper(Integer s, Integer d, Integer[] visited) throws InterruptedException {
		Thread.sleep(2000);
		if(s==d) {
			System.out.println(s);
			System.out.println("Found it");
			return;
		}
		if(visited[s]==1) {
			return;
		}
		visited[s]=1;
		System.out.println(s+" ");
		for(int i=0;i<G[s].size();i++) {
			DFS_Helper(G[s].get(i), d, visited);
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		FindElementDFS f = new FindElementDFS(6);
		f.addEdge(0, 1);
		f.addEdge(0, 2);
		f.addEdge(1, 2);
		f.addEdge(1, 3);
		f.addEdge(2, 3);
		f.addEdge(3, 4);
		f.addEdge(4, 5);
		f.DFSSearch(0,5);
	}
}
