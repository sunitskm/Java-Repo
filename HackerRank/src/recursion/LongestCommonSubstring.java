package recursion;

public class LongestCommonSubstring {
	
	public static void main(String[] args) {
		String str1 = "abacde";
		String str2 = "dacdab";
		findLCSub(str1,str2);
				
	}
	public static void findLCSub(String str1,String str2) {
		int[][] arr = new int[str1.length()+1][str2.length()+1];
		for(int i = 0;i<arr.length;i++) {
			arr[i][0]=0;
		}
		for(int i = 0;i<arr[0].length;i++) {
			arr[0][i]=0;
		}
		
		int r = 0;
		int c = 0;
		int maxValue = 0;
		for(int i = 1;i<arr.length;i++) {
			for(int j = 1;j<arr[0].length;j++) {
				if(str1.charAt(i-1)==str2.charAt(j-1)) {
					arr[i][j] = arr[i-1][j-1]+1;
					
					if(arr[i][j]>maxValue) {
						maxValue = arr[i][j];
						r = i;
						c = j;
						
					}
				}
				else {
					arr[i][j]=0;
					
				}
			}
		}
		
		System.out.println("Max length of substring is " + " and length is "+maxValue);
		System.out.println(r);
		System.out.println(str1.substring(r-maxValue,r));
	}
	
	
}
