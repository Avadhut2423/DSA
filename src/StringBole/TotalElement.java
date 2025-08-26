package StringBole;

public class TotalElement {

public static int count(String s) {
		
		String names=s.trim();
		int count=0;
		
		for(int i=0;i<names.length();i++) {
			
			if(names.charAt(i)!=' ') {
				count++;
			}
		}
		return count;
			}
	public static void main(String[] args) {
		
		System.out.println(count("Accenture coding round"));
	}

}
