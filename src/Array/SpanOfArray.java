package Array;

public class SpanOfArray {
	
	public static void main(int[] arr) {
		
		int n=arr.length;
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<n;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println(max-min);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {10,20,30};
		main(arr);
	}

}
