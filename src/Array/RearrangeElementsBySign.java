package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeElementsBySign {
	
	public static int[] isRearrange(int[] arr) {
		
		int n=arr.length;
		
		ArrayList<Integer> plist=new ArrayList<Integer>();
		ArrayList<Integer> nlist=new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			
			if(arr[i]>0) {
			    plist.add(arr[i]);
			}
			else {
				nlist.add(arr[i]);
			}
		}
		
		int[] arr1=new int[n];
		int k=0;
		int c=0;
		
		while(c<plist.size()) {
			
			arr1[k]=plist.get(c);
			arr1[k+1]=nlist.get(c);
			k=k+2;
			c++;
		}
		
		return arr1;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,1,-2,-5,2,-4};
		System.out.println(Arrays.toString(isRearrange(a)));
	}

}
