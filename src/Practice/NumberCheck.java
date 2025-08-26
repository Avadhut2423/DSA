package Practice;
import java.util.Scanner;

public class NumberCheck {
	
	public static boolean getResult(int number) {
		
		int temp=number;
		int sum=0;
		while(temp!=0) {
			
			int digit=temp%10;
			sum=sum+digit;
			temp=temp/10;
			
		}
		
		if(number%sum==0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (getResult(num)) {
		    System.out.println("Harshad num");
		} else {
		    System.out.println("not Harshad");
		}
	}

}
