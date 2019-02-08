package crackingthecoding_arrays_strings;

public class ArrayListImpl {
	//Create an array. when the array is full. 
	//create a new array with twice the size. Copy the elements from old old array to new array
	public static void main(String[] args) {
		String[] str = {"Sunit","Bob","Ryan","Steve","David"};
		for(int i = 0;i<str.length;i++) {
			System.out.println(generateHashcode(str[i]));
		}
	}
	public static int generateHashcode(String str) {
		int hc = 0;
		for(int i=0;i<str.length();i++) {
			hc = hc+str.charAt(i);
		}
		hc = hc%5;		
		return hc;
	}
	
}
