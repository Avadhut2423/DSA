package Array;
import java.util.*;

public class SumOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		
		System.out.println("sum of the array elements"+sum);
		
	}

}
