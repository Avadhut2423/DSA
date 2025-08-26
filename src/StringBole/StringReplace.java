package StringBole;

public class StringReplace {
	
	public static String replace(String a) {
		
		StringBuffer str=new StringBuffer();
		for(int i=0;i<a.length();i++) {
			
			
			if(a.charAt(i)=='.') {
				str.append("[.]");
			}
			else {
				str.append(a.charAt(i));
			}
		}
		
		return str.toString();//again the stringbuffer is converted into string before returning
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String address="1.1.1.1";
		System.out.println("Before Replacing");
		System.out.println(address);
		System.out.println("After Replacing");
		System.out.println(replace(address));

	}
}
