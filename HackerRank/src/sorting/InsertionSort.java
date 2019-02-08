package sorting;

public class InsertionSort {
	public static void main(String[] args) {
		Integer[] a= {5,8,1,3,9,6};
		insertionSort(a);
		
	}
	public static void insertionSort(Integer[] arr) {
		for(int i=0;i<arr.length;i++) {
			int j=i;
			while(j>0 && arr[j]<arr[j-1]) {
				int temp = arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
				/*if(j==0) {
					break;
				}*/
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
