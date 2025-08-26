package Array;

import java.util.Scanner;

public class IndexFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int find=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==find) {
				System.out.println("index :"+i);
				break;
			}
		}
	}

}
