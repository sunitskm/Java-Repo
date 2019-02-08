package crackingthecoding_arrays_strings;

import java.util.Scanner;

public class inPlaceRotation {
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
			for(int j=i;j<n;j++) {
				//System.out.println(arr[i][j]);
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		for(int i=0;i<n/2;i++) {
			for(int j=0;j<n;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[n-1-i][j];
				arr[n-1-i][j] = temp;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
