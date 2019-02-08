package sorting;

public class selectionSort {
	public static void main(String[] args) {
		
		//System.out.println(Integer.parseInt("009"));
		int[] arr = {2,8,5,4,9,7};
		selectionSort(arr);
	}
	public static void selectionSort(int[] arr) {
		
		for(int i =0;i<arr.length;i++) {
			int min = arr[i];
			int k = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
					k=j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
