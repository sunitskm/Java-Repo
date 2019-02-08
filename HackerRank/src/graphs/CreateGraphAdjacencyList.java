package graphs;
import java.util.*;
public class CreateGraphAdjacencyList {
	int v;
	Map<Integer,List<Integer>> hm;
	public CreateGraphAdjacencyList(int v) {
		this.v = v;
		hm=new HashMap<Integer, List<Integer>>();
		for(int i=1;i<=v;i++) {
			hm.put(i,new ArrayList<Integer>());
		}
	}
	public void addEdge(int v,int u) {
		if(v>hm.size()||u>hm.size()) {
			return;
		}
		if(hm.get(v).indexOf(u)>-1) {
			return;
		}
		hm.get(v).add(u);
		hm.get(u).add(v);
	}
	public void displayGraph() {
		for(Map.Entry<Integer, List<Integer>> e:hm.entrySet()) {
			System.out.println(e.getKey() + " "+e.getValue());
		}
	}
	public static void main(String[] args) {
		CreateGraphAdjacencyList G = new CreateGraphAdjacencyList(5);
		G.addEdge(1, 2);
		G.addEdge(3, 5);
		G.addEdge(1, 5);
		G.addEdge(4, 2);
		G.displayGraph();
	}
}
