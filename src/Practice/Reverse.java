package Practice;

public class Reverse {
	
	public static void reverse(int temp) {
		
		int sum=0;
		while(temp!=0) {
			int digit=temp%10;
			sum=sum*10+digit;
			temp=temp/10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1234567;
		reverse(num);
	}

}
