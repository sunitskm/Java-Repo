package recursion;

public class RecusriveStair {
	
	static int total = 0;
	public static int stair(int n) {
		
		if(n==0)
			return 1;
		if(n<0)
			return 0;
		else {
			return stair(n-1)+stair(n-3)+stair(n-5);
		}
		
	}
	public static void main(String[] args) {
		System.out.println(stair(50));
	}
}
