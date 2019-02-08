package memoization;

public class Fibonacci {
	//Iterate through the array
	//Have a recursive function which calculates the fibonacci sequence
	//Have an array of size n+1 which stores the fibonacci sequence of previously encountered elements already
	public static void main(String[] args) {
		int n = 10;
		int[] arr = new int[n+1];
		arr[0]=0;
		arr[1]=1;
		//Function to calculate fibonacci sequence
		for(int i=0;i<=n;i++) {
			System.out.println(calculateFibo(i,arr));
		}
			
		
	}
	public static int calculateFibo(int n,int[] arr) {
		if(n<=0) {
			//System.out.println(0);
			return 0;
		}
		if(n==1) {
			//System.out.println(1);
			return 1;
		}
		if(arr[n]>0) {
			//System.out.println(arr[n]);
			return arr[n];
		}
		arr[n] = calculateFibo(n-1, arr)+calculateFibo(n-2,arr);
		return arr[n];
	}
	
}
