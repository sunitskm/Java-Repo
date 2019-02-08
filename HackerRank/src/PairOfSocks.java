import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairOfSocks {
	public static void main(String[] args) {
		Integer[] arr = {1,2,1,2,1,2,2,3,5,3};
		getPair(arr);
		
	}
	public static void getPair(Integer[] arr) {
		List<Integer> l = new ArrayList<Integer>();
		l = Arrays.asList(arr);
//		Collections.sort(l);
		int count = 0;
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(Integer i:l) {
			if(hm.containsKey(i)) {
				hm.put(i,hm.get(i)+1);
			}
			else {
				hm.put(i, 1);
			}
		}
		for (Map.Entry<Integer,Integer> entry : hm.entrySet())
		{
//            System.out.println("Key = " + entry.getKey() + 
//                             ", Value = " + entry.getValue()); 
            int c = hm.get(entry.getKey());
            c = c/2;
            
			if(c>=1) {
				System.out.println("Sock "+entry.getKey()+" has "+c+" pairs");
			}
		}

		
		}
		//System.out.println("The number of pairs are "+count);
		
	
	
}
