package backtracking;

public class NQueen {
	public static void main(String[] args) {
		int [][] arr = {{0,0,0,0},
						{0,0,0,0},
						{0,0,0,0},
						{0,0,0,0}};
		
		arr = nQueen(arr, 4);
		displayArr(arr);
	}
	
	public static int[][] nQueen(int[][] arr,int N){
		
		nQueenHelper(arr,0,N);
		return arr;
	}
	public static void displayArr(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j = 0; j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static boolean nQueenHelper(int[][] arr,int row, int N){
		if(row>=N) {
			
			return true;
		}
		for(int i=0;i<N;i++) {
			if(checkSafe(arr,row,i)) {
				System.out.println("Placing the queen in "+ row + " row and column "+i);
				arr[row][i] = 1;
				System.out.println("Making call to row "+(row+1));
				if(nQueenHelper(arr, row+1, N)) {
					return true;
				}
				/*
				 * System.out.println("Oop didnt work ");
				 * System.out.println("Could not the queen in "+ row + " row and column "+i);
				 System.out.println("\n\n\n");*/
				arr[row][i]=0;
			}
			
		}
		return false;
	}
	
	public static boolean checkSafe(int[][] arr,int row, int col) {
		for(int i=0;i<arr.length;i++) {
			if(arr[row][i]==1 || arr[i][col]==1) {
				return false;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {

				if((i-j)==(row-col)) {
					if(arr[i][j]==1) {
						return false;
					}
				}
				if((i+j)==(row+col)) {
					if(arr[i][j]==1) {
						return false;
					}
				}
			}	
		}
		return true;
	}
	
	
}
