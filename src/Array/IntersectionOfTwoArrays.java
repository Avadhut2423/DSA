package Array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrays {
	
	public static List intersection(int[] arr1,int[] arr2) {
		
		int i=0,j=0;
		List<Integer> list=new ArrayList<Integer>();
		while(i<arr1.length && j<arr2.length) {
			
			if(arr1[i]>arr2[j]) {
				j++;
			}
			else if(arr2[j]>arr1[i]) {
				i++;
			}
			else {
				list.add(arr1[i]);
				i++;
				j++;
			}
		}
		return list;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,2,1};
		int b[]= {2,2};
		System.out.println(intersection(a, b));
		
	}

}
