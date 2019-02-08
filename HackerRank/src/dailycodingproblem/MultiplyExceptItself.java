package dailycodingproblem;

public class MultiplyExceptItself {
	public static int[] multiply(int[] a) {
		int total = 1;
		for(int i = 0;i<a.length;i++) {
			total*=a[i];
		}
		for(int i = 0;i<a.length;i++) {
			a[i] = total/a[i];
		}
		return a;
		
	}
	
	public static int[] multiplyWithoutDivison(int[] a) {
		int[] finalArray = new int[a.length];
		for(int i=0;i<a.length;i++) {
			int total = 1;
			for(int j=0;j<a.length;j++) {
				if(j!=i) {
					total=total*a[j];
				}
			}
			finalArray[i] = total;
		}
		return finalArray;
		
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = multiplyWithoutDivison(a);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
}
