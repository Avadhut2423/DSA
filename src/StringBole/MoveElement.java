package StringBole;

import java.util.*;
public class MoveElement {
	
	public static String hashMove(String s) {
		
		String s1=new String("");
		String s2=new String("");
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='#') {
				s1=s1+s.charAt(i);
			}
			else {
				s2=s2+s.charAt(i);
			}
		}
		
		
		return s1+s2;//But this is not memory effecient 
		//because Strings are immutable so we cannot chage the String
		//In this program for each and every character ,new object is created
		//For memory efficiency,we can use StringBuilder
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(hashMove(s));
	}

}
