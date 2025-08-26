package Array;

public class ReverseArray {
	
	public static void reverse(int[] arr) {
		
		int n=arr.length;
		
		for(int i=n-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,5};
        reverse(a);	
	}

}
