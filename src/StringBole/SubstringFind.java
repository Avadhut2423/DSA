package StringBole;

public class SubstringFind {
	
	public static int substringFind(String s1,String s2) {
		
		int index=s1.indexOf(s2);//This will check substring is present or not and if present then return index of first occurrence of substring
		if(index!=-1) {
			return index;
		}
		else {
			return -1;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Hello,would";
		String b="would";
		
		System.out.println(substringFind(a,b));
	}

}
