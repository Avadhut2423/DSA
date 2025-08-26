package StringBole;

public class Palendrome {
	
	public static boolean isPalendrome(String s) {
		
		int n=s.length();
		
		for(int i=0;i<=n/2;i++) {
			if(s.charAt(i)!=s.charAt(n-1-i)) {
				
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="aaaaaabbbaaaaaa";
		System.out.println(isPalendrome(s));;
	}

}
