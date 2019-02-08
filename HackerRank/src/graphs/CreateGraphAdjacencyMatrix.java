package graphs;

public class CreateGraphAdjacencyMatrix {
	int V;
	int [][] G;
	public CreateGraphAdjacencyMatrix(int V) {
		this.V = V;
		G = new int[V][V];
		for(int i = 0;i<V;i++) {
			for(int j = 0;j<V;j++) {
				G[i][j] = 0;
			}
		}
	}
	
	public void addEdge(int v,int u) {
		if(v>G.length || u>G.length) {
			return;
		}
		if(G[u][v]!=0) {
			return;
		}
		G[u][v]=1;
		G[v][u]=1;
	}
	public void displayGraph() {
		for(int i = 0;i<G.length;i++) {
			for(int j=0;j<G[0].length;j++) {
				System.out.print(G[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		CreateGraphAdjacencyMatrix G = new CreateGraphAdjacencyMatrix(5);
		G.addEdge(0, 1);
		G.addEdge(2, 1);
		G.addEdge(4, 2);
		G.addEdge(3, 0);
		G.addEdge(0, 2);
		G.displayGraph();
	}
}
