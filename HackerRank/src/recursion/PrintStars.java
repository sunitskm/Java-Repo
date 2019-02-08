package recursion;

public class PrintStars {
	
	public static void printStars(int n) {
		if(n>1) {
			printStars(n-1);
		}
		for(int i = 0;i<n;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void main(String[] args) {
//		printStars(5);
//		printToAndFro(10);
		int [] arr = {12,10,30,50,100};
		System.out.println(findMax(arr,5));
	}
	
	public static void printToAndFro(int n) {
		if(n>1000) {
			return;
		}
		System.out.println(n);
		printToAndFro(n*2);
		System.out.println(n);
	}
	
	public static int findMax(int[] a,int n) {
		int x;
		if(n==1)
			return a[0];
		else
			x = findMax(a,n-1);
		if(x>a[n-1])
			return x;
		else
			return a[n-1];
		
	}
	
	
	
	
}
