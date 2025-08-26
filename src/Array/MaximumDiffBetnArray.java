package Array;

public class MaximumDiffBetnArray {
	
	public static int diff(int[] arr) {
		
		int n=arr.length;
		int difference=Integer.MIN_VALUE;
		int c=0;
		
		
		for(int i=1;i<n;i++) {
			
			c=arr[i]-arr[i-1];
			difference=Math.max(c, difference);
		}
		
		return difference;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int arr[]= {5,6,7,2,5,9};
		System.out.println(diff(arr));
	}

}
