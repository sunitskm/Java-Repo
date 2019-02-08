package graphs;
import java.util.*;
public class BFS_Graph {
	Integer V;
	Map <Integer,List<Integer>> G = new HashMap<Integer,List<Integer>>();
	public BFS_Graph(Integer V) {
		this.V=V;
		for(int i=1;i<=V;i++) {
			
			G.put(i,new LinkedList());
			
		}
	}
	public void addEdge(Integer u,Integer v) {
		if(u>V || v> V) {
			return;
		}
		if(G.containsKey(u)) {
			if(G.get(u).indexOf(v)>=0) {
				return;
			}
		}
		List<Integer> l = G.get(u);
		l.add(v);
		G.put(u, l);
	}
	public void display() {
		for (Map.Entry<Integer, List<Integer>> m : G.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
	public void BFS() {
		Boolean[] visited = new Boolean[V+1];
		for(int i=1;i<=V;i++) {
			visited[i] = false;
		}
		for(int i=1;i<=V;i++) {
			
			Queue<Integer> q = new LinkedList<>();
			q.add(i);
			while(!q.isEmpty()) {
				System.out.println("The queue is "+q);
				Integer element = q.poll();
				System.out.println("The element popped is "+element);
				if(!visited[element]) {
					
					
				
				System.out.println("The above element has not been visited");
				visited[element]=true;
				System.out.println(element);
				List<Integer> l = G.get(element);
				for(int j=0;j<l.size();j++) {
					q.add(l.get(j));
				}
				}
			}
		}
	}
	public static void main(String[] args) {
		BFS_Graph g = new BFS_Graph(7);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 1);
		g.addEdge(3, 5);
		g.addEdge(6, 7);
		g.display();
		g.BFS();
	}
}
