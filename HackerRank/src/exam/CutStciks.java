package exam;
import java.util.*;
public class CutStciks {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(5);
		li.add(4);
		li.add(4);
		li.add(2);
		li.add(2);
		li.add(8);
		System.out.println(cutStick(li));
	}
	
	public static List<Integer> cutStick(List<Integer> lengths){
		Collections.sort(lengths);
		List<Integer> remMatches = new ArrayList<Integer>();
		while(lengths.size()>0) {
			remMatches.add(lengths.size());
			Integer toDelete = lengths.get(0);
			//Function to delete the element from all elements of the list
			deleteElement(toDelete,lengths);
			//Function to get rid of the 0s
			removeZeros(lengths);
		}
		return remMatches;
	}
	public static void deleteElement(Integer toDelete,List<Integer> lengths) {
		for(int i=0;i<lengths.size();i++) {
			Integer element = lengths.get(i);
			element = element-toDelete;
			lengths.set(i, element);
		}
	}
	
	public static void removeZeros(List<Integer> lengths) {
		boolean flag = true;
		Integer z = 0;
		while(flag) {
			flag = lengths.remove(z);
		}
	}
}
