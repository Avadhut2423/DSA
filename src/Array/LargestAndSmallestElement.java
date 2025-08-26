package Array;

public class LargestAndSmallestElement {
	
	public static void largeSmallNumber(int[] arr) {
		
		int n=arr.length;
		int min=arr[0];
		int max=arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println("Maximum Number is :"+max);
		System.out.println("Minimum Number is :"+min);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3,4,5};
		largeSmallNumber(a);
	}

}
