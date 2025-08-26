package StringBole;

public class SignOfProductOfArray {
	
	
	public static int signFunction(int product) {
		
		if(product>0) {
			return 1;
		}
		else if(product==0) {
			return 0;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {-1,-2,-3,-4,3,2,1};
		int product=1;
		
		for(int i=0;i<arr.length;i++) {
			
			product=product*arr[i];
			
		}
		
		System.out.println(signFunction(product));
		
		
	}

}
