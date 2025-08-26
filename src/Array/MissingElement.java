package Array;

public class MissingElement {
	
	public static int miss(int start,int n,int[] arr) {
		
		int len=arr.length;
		int arrSum=0;
		
		for(int i=0;i<len;i++) {
			arrSum=arrSum+arr[i];
		}
		
		int sum=(n*(n+1))/2;
		
		return sum-arrSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,0,1};
		int start=0;
		int end=3;
		System.out.println(miss(start, end, arr));
	}

}
