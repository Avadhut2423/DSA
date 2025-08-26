package PrimeNumbers;

import java.util.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		int b=sc1.nextInt();
		
		while(a<b) {
			int count=0;
			for(int i=2;i<a-1;i++) {
				if(a%i==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(a);
			}
			a++;
		}
	}

}
