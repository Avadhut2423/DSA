package Practice;

import java.util.Scanner;

public class AdditionOfCubes {
	
	public static int cubeOfNum(int start,int end) {
		
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum=sum+i*i*i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int e=sc.nextInt();
		
		System.out.println(cubeOfNum(s, e));
	}

}
