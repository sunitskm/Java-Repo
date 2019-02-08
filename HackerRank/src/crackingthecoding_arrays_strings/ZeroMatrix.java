package crackingthecoding_arrays_strings;
import java.util.Random;
import java.util.Scanner;
public class ZeroMatrix {
	public static void main(String[] args) {
		Random rand = new Random();
		//int num = r.nextInt(10);
		//System.out.println(num);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r =  sc.nextInt();
		System.out.println("Enter the number of columns");
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=rand.nextInt(20);
				System.out.print(arr[i][j]+"    ");
			}
			System.out.println();
		}
		int[][] zeroArray = new int[r][c];
		for(int i = 0;i<r;i++) {
			for(int j=0;j<c;j++) {
				zeroArray[i][j]=-1;
			}
		}
		
		for(int i = 0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(arr[i][j]!=0) {
					zeroArray[i][j]*=arr[i][j]*-1;
				}
				else {
					//System.out.println("I am inside zero array "+arr[i][j]);
					setZero(zeroArray,i,j);
				}
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				//arr[i][j]=rand.nextInt(20);
				System.out.print(zeroArray[i][j]+"    ");
			}
			System.out.println();
		}
		
		
	}
	public static void setZero(int[][]arr,int i,int j) {
		
		for(int p=0;p<arr.length;p++) {
			for(int q=0;q<arr[0].length;q++) {
				if(p==i) {
					arr[p][q]=0;
				}
				if(q==j) {
					arr[p][q]=0;
				}
			}
		}
	}
	
}
