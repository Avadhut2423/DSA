package Practice;
import java.util.Scanner;

public class ArmStrong {
	
	public static boolean getResult(int number) {
		
		int temp=number;
		int sum=0;
		int count=Integer.toString(temp).length();
		
		while(temp!=0) {
			
			int digit=temp%10;
			sum=sum+ (int)Math.pow(digit,count);
			temp=temp/10;
			
		}
		
		if(sum==number) {
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
		    System.out.println("Armstrong num");
		} else {
		    System.out.println("NOT Armstrong");
		}
	}

}
