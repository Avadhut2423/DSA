package Practice;

public class Palindrome {
	
	public static boolean getResult(int num) {
		int temp=num;
		int sum=0;
		
		
		while(temp!=0) {
			int digit=temp%10;
			sum=sum*10+digit;
			temp=temp/10;
		}
		
		if(sum==num) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12344321;
		if(getResult(num)) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
	}

}
