package dailycodingproblem;

public class CalculateGCD {
	public static int caluculateGCD(int a,int b) {
		if(a%b==0) {
			return b;
		}
		if(b>a) {
			return caluculateGCD(b, a);
		}
		return caluculateGCD(b, a-b);
	}
	public static int generalizedGCD(int num,int[] arr) {
		int gcd = arr[0];
		
		for(int i=1;i<num;i++) {
			gcd = caluculateGCD(gcd, arr[i]);
		}
		return gcd;
	}
	public static void main(String[] args) {
		System.out.println(caluculateGCD(36, 48));
		int[] arr = {36,12,24,72,48};
		System.out.println(generalizedGCD(5, arr));
	}
}
