package StringBole;

public class Palindrome {
	
	public static boolean isPalindrome(String a) {
		
		
		for(int i=0;i<a.length();i++) {
			
			if(a.charAt(i)!=a.charAt(a.length()-1-i)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean alphanumericCheck(String a) {
		
		int start=0;
		int last=a.length()-1;
		
		while(start<last) {
			
			
			if(!Character.isLetterOrDigit(a.charAt(start))) {
				start++;
			}
			else if(!Character.isLetterOrDigit(a.charAt(last))) {
				last--;
			}
			else if(Character.toLowerCase(a.charAt(start))!=Character.toLowerCase(a.charAt(last))) {
				return false;
			}
			else {
				start++;
				last--;
			}
	
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Avadhut";
		System.out.println(isPalindrome(s));
		String ab="A man,a plan,a canal:panama";
		System.out.println(alphanumericCheck(ab));
		
	}

}
