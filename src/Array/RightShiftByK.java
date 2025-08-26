package Array;

public class RightShiftByK {
	
	public static void shift(int[] arr,int k) {
		int n=arr.length;
		k=k%n;
		
		reverse(arr,0,n-1);
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	
	public static void reverse(int[] arr,int i,int j) {
		
		while(i<j) {
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			i++;j--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,6,7};
		shift(arr,10);
	}

}
