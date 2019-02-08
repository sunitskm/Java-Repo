package recursion;

public class FindLog {
	public static int findLog(int n){
		if(n==1) {
			return 0;
		}
		return 1+findLog(n/2);
	}
	public static void main(String[] args) {
		System.out.println(findLog(128));
	}
}
