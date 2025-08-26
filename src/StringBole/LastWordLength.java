package StringBole;

public class LastWordLength {

	
	public static int lastWordLen(String s) {
		
		int n= s.length();
		int count=0;
		
		for(int i=0;i<n;i++) {
			
			if(s.charAt(i)!=' ') {
				count++;
			}
			else {
				count=0;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello World";
		System.out.println(lastWordLen(s));
	}

}
