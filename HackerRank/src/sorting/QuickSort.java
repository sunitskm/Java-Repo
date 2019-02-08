package sorting;

public class QuickSort {
	
	public static void main(String[] args) {
		
		int[] arr = {4,2,6,3,7,9,5,1};
		QuickSort(arr, 0, arr.length-1);
		System.out.println();
		display(arr);
		
	}
	
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	
	public static void QuickSort(int[] arr,int start,int end) {
		if(start<end) {
			int pivotIndex = partition(arr,start,end);
			QuickSort(arr, start, pivotIndex-1);
			QuickSort(arr, pivotIndex+1, end);
		}
	}
	
	public static int partition(int[] arr,int start, int end) {
		int pivot = arr[end];
		int pivotIndex = start;
		for(int i = start; i<end;i++) {
			if(arr[i]<pivot) {
				swap(arr,i,pivotIndex);
				pivotIndex++;
			}
		}
		swap(arr,end,pivotIndex);
		System.out.println("Pivot was "+pivot);
		display(arr);
		
		return pivotIndex;
	}
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]=temp;
	}
	
}
