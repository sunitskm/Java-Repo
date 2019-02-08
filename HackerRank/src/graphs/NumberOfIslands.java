/* This program is to calculate the number of islands in a matrix.
 * We use DFS to traverse through the matrix and explore and the potions to see which sets are 1 disconnected from the other set.
 */

package graphs;

public class NumberOfIslands {

	
	public static void main(String[] args) {
		//Input Set of Islands
		int[][] island = {{1,0,0,0,0,0},
						  {0,0,0,0,0,0},
						  {0,1,1,1,0,0},
						  {0,0,1,1,0,0},
						  {0,0,0,1,0,0},
						  {0,0,0,0,0,0},
						  {0,0,0,0,0,1}};
		System.out.println(calculateIslands(island));
	}
	//Function to return the number of islands present
	public static int calculateIslands(int[][] island) {
		//Keeping track of the set of visited nodes
		int[][] visited = new int[island.length][island[0].length];
		//Populating the visited array with 1s where, in the island array they have 0s so that we don't the 0 portions
		prepareVisited(island,visited);
		//Variable to return the number of islands calculated
		int numIslands = 0;
		for(int r = 0;r<island.length;r++) {
			for(int c = 0;c<island[0].length;c++) {
				
				//If we come across a 1 that has not been visted before
				if(visited[r][c]==0) {
					//Increase the count
					numIslands++;
					//Explore all other connected 1s
					performDFS(island, visited, r, c);
				}
			}
		}
		
		
		return numIslands;
	}
	
	public static boolean checkValid(int[][] island,int r, int c) {
		//Check if a row or column is valid or not
		if(r>=island.length || r<0 || c>= island[0].length|| c<0) {
			return false;
		}
		return true;
	}
	
	
	public static void performDFS(int[][] island,int[][] visited, int r, int c){
		//First check the validaity of the row and column. You dont want to get ArrayIndexOutOfBounds Exception
		if(!checkValid(island,r,c)) {
			return;
		}
		//If the column has already been visited before
		if(visited[r][c]==1) {
			return;
		}
		//Set the visited to 1 and explore its neighbors
		else {
			visited[r][c] = 1;
			//Making calls to all the neighbors
			performDFS(island, visited, r+1, c);
			performDFS(island, visited, r-1, c);
			performDFS(island, visited, r, c+1);
			performDFS(island, visited, r, c-1);
			performDFS(island, visited, r+1, c+1);
			performDFS(island, visited, r-1, c-1);
			performDFS(island, visited, r-1, c+1);
			performDFS(island, visited, r+1, c-1);
			
		}
	}
	
	
	
	//Update the visited array
	public static void prepareVisited(int[][] island,int[][] visited) {
		for(int r = 0;r < island.length; r++) {
			for(int c = 0; c < island[0].length; c++) {
				if(island[r][c]==0) {
					visited[r][c]=1;
				}
			}
		}
	}

}

