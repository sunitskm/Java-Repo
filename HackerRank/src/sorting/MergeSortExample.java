package sorting;

public class MergeSortExample {
	public static void main(String[] args) throws InterruptedException {
		int[] arr = {4,0,6,1,5,2,3};
		merge(arr,0,arr.length-1);
		display(arr);
	}
	
	public static void display(int[] arr) {
		for(int count = 0; count<arr.length;count++) {
			System.out.print(arr[count]+" ");
		}
	}
	
	
	public static void merge(int[] arr,int low,int high) throws InterruptedException {
		if(low<high) {
			int mid = low+(high-low)/2;
			merge(arr,low,mid);
			merge(arr,mid+1,high);
			System.out.println("Calling merge sort on ");
			Thread.sleep(10000);
			System.out.println("mergeSort("+low+" "+mid+" "+high+" )");
			displayPart(arr,low,high);
			System.out.println("Before sorting ");
			display(arr);
			System.out.println("\nAfter sorting ");
			mergeSort(arr,low,mid,high);
			display(arr);
			System.out.println();
		}
	}
	
	public static void displayPart(int[]arr,int low,int high) {
		for(int i=low;i<=high;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void mergeSort(int[] arr,int low,int mid,int high) {
		int[] tempArr = new int[arr.length];
		
		for(int counter = 0; counter<arr.length; counter++) {
			tempArr[counter] = arr[counter];
		}
		int i = low;//to keep track of the lower end of the array;
		int j = mid+1;//to keep track of the middle pointer to the array
		int k = low;//to keep track of the position where next element will be copied;
		
		while(i<=mid && j<=high) {
			if(tempArr[i]<tempArr[j]) {
				arr[k] = tempArr[i];
				i++;
			}
			else {
				arr[k] = tempArr[j];
				j++;
			}
			k++;
		}
		//Copying the remaining elements to the original array
		while(i<=mid) {
			arr[k] = tempArr[i];
			k++;
			i++;
		}
		
		//Copying the remaining elements to the original array
		/*
		 * while(j<=high) { arr[k] = tempArr[j]; k++; j++; }
		 */
		
	}
	
	
}
