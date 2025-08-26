package Array;

public class SmallestNum {
	
	public static int smallestNum(int[] arr) {
		
		int n=arr.length;
		int small=arr[0];
		for(int i=0;i<n;i++) {
			
			if(small>arr[i]) {
				small=arr[i];
			}
		}
		
		return small;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,1,1,1,2,2,3,3,9};
		System.out.println(smallestNum(arr));
	}

}
