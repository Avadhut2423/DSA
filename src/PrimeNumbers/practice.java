package PrimeNumbers;

import java.util.*;
public class practice {
	
	public static boolean isPrime(int num) {
		
		int count=0;
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<=num-1;i++) {
			
			if(num%i==0) {
				count++;
			}
		}
		if(count==0) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.println(isPrime(num));
	}

}
