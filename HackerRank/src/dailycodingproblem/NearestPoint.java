package dailycodingproblem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class NearestPoint {
	public static List<List<Integer>> nearestVegetarianRestaurant(int totalRestaurants,List<List<Integer>> allocations,int numRestaurants){
		//List to hold the closest elements
		List<List<Integer>> closest = new ArrayList<>();
		//TreeMap to make sorting easier
		Map<Integer,Integer> m = new TreeMap<>(new Comparator<Integer>() {
			
		@Override
		public int compare(Integer o1,Integer o2) {
			return o1.compareTo(o2);
		}
		});
		//Inserting values depending in map sorted from distance lowest to highest
		int c = 0;
		for(List<Integer> i:allocations) {
			int distance = findDistance(i);
			
			m.put(distance, c);
			c++;
		}
		
		int count = 0;
		//Extracting top numRestaurants in a list
		for(Map.Entry<Integer, Integer> entry:m.entrySet()) {
			if(count>=numRestaurants){
				break;
			}
			count++;
		//	System.out.println(closest);
			closest.add(allocations.get(entry.getValue()));
		}
		//returning list
		return closest;
		
	}
	//additional function to return distance. Did apply square root as it does not matter
	public static Integer findDistance(List<Integer> l) {
		return l.get(0)*l.get(0)+l.get(1)*l.get(1);
	}
	public static void main(String[] args) {
		List<List<Integer>> closest = new ArrayList<>();
		List l1 = new ArrayList<>();
		List l2 = new ArrayList<>();
		List l3 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l2.add(3);
		l2.add(4);
		l3.add(1);
		l3.add(-1);
		closest.add(l1);
		closest.add(l2);
		closest.add(l3);
		System.out.println(nearestVegetarianRestaurant(3, closest, 2));
	}
}
