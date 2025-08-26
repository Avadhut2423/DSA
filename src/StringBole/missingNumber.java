package StringBole;

public class missingNumber {
	
	public static int missingNumber(int[] a) {
		
		int n=a.length;
		int totalSum=(n*(n+1))/2;
		int sum=0;
		
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
			
		}
		
		return totalSum-sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,0,1};
		System.out.println(missingNumber(a));
	}

}
