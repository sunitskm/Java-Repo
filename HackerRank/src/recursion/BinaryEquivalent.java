package recursion;

public class BinaryEquivalent {
	public static void printBinary(int n){
		if(n==1) {
			System.out.print(1);
			return;
		}
		printBinary(n/2);
		
	}
}
