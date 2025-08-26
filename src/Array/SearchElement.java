package Array;

public class SearchElement {
	
	public static int searchElement(int[] arr,int target) {
		
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[]= {1,2,3,4,5};
	
		int k=3;
		
		System.out.println(searchElement(a,k));
	}

}
