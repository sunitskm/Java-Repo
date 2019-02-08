package recursion;

public class printHelloWorld {
	public static void printHelloWorld(int count) {
		if(count==0) {
			return;
		}
		printHelloWorld(count-1);
		System.out.println("Hello World");
		
	}
	public static void main(String[] args) {
		printHelloWorld(10);
	}
}
