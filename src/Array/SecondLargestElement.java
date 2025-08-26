package Array;

public class SecondLargestElement {
	
	

	public static int getSecondSmallest(int[] arr) {
		
		int n=arr.length;
		int small=arr[0];
		int ssmall=100;
		for(int i=1;i<n;i++) {
			
			if(arr[i]<small){
				ssmall=small;
				small=arr[i];
			}
			else if(arr[i]<ssmall && arr[i]!=ssmall) {
				ssmall=arr[i];
			}
			
		}
		
		return ssmall;
		
	}
	
	
	
	public static int getSecondLargest(int[] arr) {
		int n=arr.length;
		int large=arr[0];
		int slarge=0;
		
		for(int i=1;i<n;i++) {
			
			if(arr[i]>large) {
				slarge=large;
				large=arr[i];
			}
			else if(arr[i]>slarge && arr[i] !=slarge) {
				slarge=arr[i];
			}
		}
		
		return slarge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {1,2,3,4,5};
		System.out.println(getSecondLargest(arr));
		System.out.println(getSecondSmallest(arr));
	}

}
