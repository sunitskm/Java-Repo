package crackingthecoding_arrays_strings;
import java.util.*;
public class MatrixMultiplication {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the number of rows for matrix 1");
	 int r1 = sc.nextInt();
	 System.out.println("Enter the number of columns for matrix 1");
	 int c1 = sc.nextInt();

	 System.out.println("Enter the number of rows for matrix 2");
	 int r2 = sc.nextInt();
	 System.out.println("Enter the number of columns for matrix 2");
	 int c2 = sc.nextInt();
	 
	 if(c1 !=r2) {
		 System.err.print("Sorry!! matrices cannot be multiplied. Please try again");
		 System.exit(0);
	 }
	 
	 int[][] mat1 = new int[r1][c1];
	 int[][] mat2 = new int[r2][c2];
	 int [][] matmul = new int[r1][c2];
	 
	 
	 for(int i=0;i<r1;i++) {
		 for(int j = 0;j<c1;j++) {
			 System.out.println("Enter value for row "+(i+1)+" column "+(j+1));
			 mat1[i][j] = sc.nextInt();
		 }
	 }
	 

	 for(int i=0;i<r2;i++) {
		 for(int j = 0;j<c2;j++) {
			 System.out.println("Enter value for row "+(i+1)+" column "+(j+1));
			 mat2[i][j] = sc.nextInt();
		 }
	 }
	 for(int i=0;i<r1;i++) {
		 for(int j = 0;j<c2;j++) {
			 
			 matmul[i][j] = 0;
		 }
	 }
	  
	 
	 
	 for(int i=0;i<r1;i++) {
		 for(int j=0;j<c2;j++) {
			 for(int k=0;k<c1;k++) {
				 matmul[i][j] += mat1[i][k]*mat2[k][j];
			 }
		 }
	 }
	 for(int i=0;i<r1;i++) {
		 for(int j = 0;j<c2;j++) {
			 
			System.out.print(matmul[i][j]+" ");
		 }
		 System.out.println();
	 }
	 
	 
	 
 }
}
