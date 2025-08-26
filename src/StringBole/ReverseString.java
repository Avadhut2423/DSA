package StringBole;

import java.util.Arrays;

public class ReverseString {

	
	public static String revString(String a) {
		
		int n=a.length();
		int j=0;
		char[] arr=new char[n];
		
		for(int i=n-1;i>=0;i--) {
			arr[j]=a.charAt(i);
			j++;
		}
		System.out.println(Arrays.toString(arr));//It will collect the elements but prit like a array
		
		return new String(arr);//creates a new String object from the characters stored in the array.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hello";
		System.out.println(revString(s));
	}

}
