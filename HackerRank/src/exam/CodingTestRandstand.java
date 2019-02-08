package exam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class CodingTestRandstand {
	public static void main(String[] args) {
		int arr[] = new int[5];
		System.out.println(arr);
		String value = "red";
		switch(value) {
		case "red":
			System.out.println("FAIL");
		case "GREEN":
			System.out.println("OK");
		}
		int []arr1 = new int[5];
		final Set<String> set = new HashSet<>(Arrays.asList("first","second"));
		set.add("Hello");
		Set<String> set1 = set;
		System.out.println(set1);
	}
}
