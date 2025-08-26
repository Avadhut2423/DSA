package Practice;

import java.util.Scanner;

//6 → divisors are 1, 2, 3
//Sum = 1 + 2 + 3 = 6  perfect number.

public class PerfectNumber {
	
	public static boolean isPerfect(int n) {
		
		int sum=0;
		for(int i=1;i<25;i++) {
			
			if(n%i==0) {
				sum=sum+i;
			}
		}
		
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		PerfectNumber p=new PerfectNumber();
		if(p.isPerfect(num)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
