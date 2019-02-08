package crackingthecoding_arrays_strings;
import java.util.*;

public class CalculateEditDistance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		int m = str1.length()+1;
		int n = str2.length()+1;
		System.out.println(m);
		System.out.println(n);
		int[][] arr = new int[m][n];
		for(int i=1;i<m;i++) {
			arr[i][0]=i;
		}
		for(int i=1;i<n;i++) {
			arr[0][i]=i;
		}
		arr[0][0]=0;
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				if(str1.charAt(i-1)==str2.charAt(j-1)) {
					arr[i][j] = arr[i-1][j-1];
				}
				else {
					arr[i][j] = calculateMinimum(arr[i-1][j-1],arr[i][j-1],arr[i-1][j])+1;
				}
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("\n");
		}
		
		System.out.println("The edit distance "+arr[m-1][n-1]);
		
		if(arr[m-1][n-1]==1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	public static int calculateMinimum(int a,int b,int c) {
		int min = a;
		if(b<min) {
			min=b;
		}
		if(c<min) {
			min = c;
		}
		return min;
	}
}
