package exam;
import java.util.*;
public class MaxPopulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of people ");
		int n = sc.nextInt();
		Integer[][] bday = new Integer[2][n];
		int maxYear = 0;
		int minYear = 3000;
		for(int i=0;i<n;i++) {
			System.out.println("Enter the birth year of person "+(i+1));
			bday[0][i] = sc.nextInt();
			if(bday[0][i]<minYear) {
				minYear = bday[0][i];
			}
			System.out.println("Enter the death year of person "+(i+1));
			bday[1][i] = sc.nextInt();
			if(bday[1][i]>maxYear) {
				maxYear = bday[1][i];
			}
		}
		System.out.println("Max year is "+maxYear);
		System.out.println("Min year is "+minYear);
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i = minYear;i<=maxYear;i++) {
		//	System.out.println("Min year is "+i);
			for(int j = 0;j<n;j++) {
				//System.out.println("Inside 1st for loop");
				if(bday[0][j]<=i && bday[1][j]>i) {
					//System.out.println("Birth Year "+bday[0][j]+" and "+bday[1][j]+" lies between "+i);
					if(hm.containsKey(i)) {
						Integer freq = hm.get(i);
						freq++;
						hm.put(i, freq);
					}
					else {
						hm.put(i, 1);
					}
				}
			}
		}
		Integer year = 0;
		Integer freq = 0;
		for(Map.Entry<Integer, Integer> m:hm.entrySet()) {
			if(m.getValue()>freq) {
				freq = m.getValue();
				year = m.getKey();
			}
		}
		System.out.println("The year with most population was "+year+" with the frequency "+freq);
	}
}

