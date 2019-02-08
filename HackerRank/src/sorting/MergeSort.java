package sorting;

public class MergeSort {
	public static void mergeSort(int[] arr,int l, int r) throws InterruptedException {
		
		//Thread.sleep(2000);
		if(l>=r) {
			//System.out.println(arr[l]);
			return;
		}
		//System.out.println("l is "+l);
		//System.out.println("r is "+r);
		int m = (l+r)/2;
		//System.out.println("M is "+m);
		/*for(int i=l;i<r;i++) {
			System.out.print(arr[i]+" ");
		}
		*/
		System.out.println();
		
		mergeSort(arr,l,m);
		mergeSort(arr,m+1,r);
		merge(arr,l,m,r);
		
	}
	public static void merge(int[] arr,int l,int m,int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		//System.out.println("printing L array");
		for(int i=0;i<n1;i++) {
			L[i]=arr[l+i];
			//System.out.print(L[i]+" ");
		}
		//System.out.println("printing R array");
		for(int j=0;j<n2;j++) {
			R[j]=arr[m+1+j];
		}
		
		int i=0,j=0;
		int k = l;
		
		while(i<n1&&j<n2) {
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}
			else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=R[j];
			j++;
			k++;
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		int[] arr = {12,11,13,5,6,7};
		mergeSort(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
