package crackingthecoding_arrays_strings;

import java.util.Scanner;

public class RotateMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N for an NXN matrix ");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int[][] rotatedArr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("Enter value for row "+(i+1)+" and column "+(j+1));
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.println(arr[i][j]);
				rotatedArr[n-j-1][i]=arr[i][j];
			}
		}
		
		System.out.println("Print the rotated array");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(rotatedArr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
