package Array;

public class OccurenceOfElement {
	
	public static int occurence(int[] arr,int target) {
		
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 5, 2, 4, 1, 2, 2, 2 };
		int a = 2;
		System.out.println(occurence(arr, a));
	}

}
