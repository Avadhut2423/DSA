package SortingAlgorithm;

public class SelectionSort {

	public static int[] selectionSorting(int[] arr) {
		
		int n=arr.length;
		
		//Find the index with minimum value for replace with first element and continue.......
		for(int i=0;i<n;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int a[]= {4,1,5,2,3};
		
		int b[]=selectionSorting(a);
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}

}
