package Array;

import java.util.ArrayList;
import java.util.List;

public class IndexArrangment {
	
	public static List isDiv3And5(int n) {
		
	
		List<String> list=new ArrayList<String>();
		
		
		for(int i=1;i<=n;i++) {
			
			if(i%3==0 && i%5==0) {
				list.add("FizzBuzz");
			}
			else if(i%3==0) {
				list.add("Fizz");
			}
			else if(i%5==0) {
				list.add("Buzz");
			}
			else {
				list.add(i+" ");
			}
			
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=15;
		System.out.println(isDiv3And5(a));
		
	}

}
