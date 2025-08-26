package Array;

public class maxSubArray {
	
	public static int maxSubArray(int[] a) {
		
		
		int n=a.length;
		int max=0;
		int sum=0;
		
		for(int i=0;i<n;i++) {
			
			sum=sum+a[i];
			max=Math.max(max, sum);
			if(sum<0) {
				sum=0;
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
	}

}
