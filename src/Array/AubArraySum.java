package Array;

public class AubArraySum {
	
	public static int subArraySum(int[] arr,int target) {
		
		int i=0;
		int count=0;
		int n=arr.length;
		
		for(int j=i+1;j<n && i<n-1;j++) {
			
			if(arr[i]+arr[j]==target) {
				count++;
			}
			if(j==n-1) {
				i++;
				j=i;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {4,6,3,5,3,2};
		int a=7;
		
		System.out.println(subArraySum(arr,a));
	}

}
