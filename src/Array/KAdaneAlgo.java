package Array;

public class KAdaneAlgo {

	public static int kadanes(int[] arr) {
		
		int n=arr.length;
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			
			sum=sum+arr[i];
			max=Math.max(max, sum);
			
			if(sum<0) {
				sum=0;
			}
			
			
			/*for (int i = 1; i < nums.length; i++) {
	            currentSum = Math.max(nums[i], currentSum + nums[i]);
	            maxSum = Math.max(maxSum, currentSum);
	        }*/
			
		}
		
		return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { -2, 1, -3, 4, -1,  2, 1, -5, 4 };

		System.out.println(kadanes(arr));
	}

}
