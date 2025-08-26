package Array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

        

public class RemoveDuplicates {
	
	public static int[] removeDuplicates(int[] arr) {
		
		int n=arr.length;
		int i=0;
		for(int j=1;j<n;j++) {
			
			if(arr[i]!=arr[j]) {
				arr[i+1]=arr[j];
				i++;
			}
		}
		
		return Arrays.copyOf(arr,i+1);//return only unique elements  (names of array,length)
		
	}
	
	public static Set remove(int[] arr) {
		
		int n=arr.length;
		Set<Integer> hset=new LinkedHashSet<Integer>();
		
		for(int i=0;i<n;i++) {
			hset.add(arr[i]);
		}
		
		return hset;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,5,6,6,9};
		
		int r[]=removeDuplicates(arr);
		System.out.println(Arrays.toString(r));
		System.out.println(remove(arr));
	}

}
