package graphs;

import java.util.*;

public class DFSWeighted {
	private Integer v;
	private Map<Integer, LinkedList<Integer[]>> G = new HashMap<Integer, LinkedList<Integer[]>>();
	public DFSWeighted(Integer v) {
		this.v = v;
		for(int i=1;i<=this.v;i++) {
			G.put(i,new LinkedList());
		}
	}
	public void addEdges(Integer u,Integer v, Integer e) {
		if(u>this.v || v>this.v) {
			return;
		}
		List<Integer[]> l = new LinkedList();
		l = G.get(u);
		for(Integer[] i:l) {
			if(i[0]==v) {
				return;
			}
		}
		Integer[] arr = new Integer[2];
		arr[0] = v;
		arr[1] = e;
		LinkedList<Integer[]> newL = new LinkedList<Integer[]>();
		if(G.get(u)!=null) {
			newL = G.get(u);
			newL.add(arr);
			G.put(u,newL);
		}
		else {
			newL.add(arr);
			G.put(u,newL);
		}
	}
	public void display() {
		for(Map.Entry<Integer,LinkedList<Integer[]>> m:G.entrySet()) {
			System.out.println(m.getKey());
			List<Integer[]> l = m.getValue();
			for(int i=0;i<l.size();i++) {
				System.out.print("Connected to "+l.get(i)[0]+" with an edge weight of "+l.get(i)[1]+"\n");
			}
			System.out.println("\n\n");
		}
	}
	
	public void DFS(Integer s) {
		Boolean[] visited = new Boolean[v+1];
		for(int i=1;i<=v;i++) {
			visited[i]=false;
		}
		for(int i =1;i<=v;i++) {
			DFS_Helper(i,i,visited);
		}
	}
	public void DFS_Helper(Integer s, Integer p,Boolean[] visited) {
		if(visited[s]) {
			return;
		}
		System.out.println(p+" to "+s);
		visited[s] = true;
		LinkedList<Integer[]> l = G.get(s);
		for(int i=0;i<l.size();i++) {
			Integer newNode = l.get(i)[0];
			DFS_Helper(newNode,s,visited);
		}
	}
	
	public static void main(String[] args) {
		DFSWeighted d = new DFSWeighted(6);
		d.addEdges(1, 2, 4);
		d.addEdges(2, 3, 1);
		d.addEdges(6, 5, 7);
		d.addEdges(3, 4, 5);
		d.addEdges(1, 4, 9);
		d.addEdges(5, 6, 10);
		//d.display();
		d.DFS(1);
	}
}
