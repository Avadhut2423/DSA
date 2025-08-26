package StringBole;

public class ReplaceCharacter {
	
	public static String replace(String s,char ch1,char ch2) {
		
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==ch1) {
				arr[i]=ch2;
			}
			else if(arr[i]==ch2) {
				arr[i]=ch1;
			}
		}
		
		return new String(arr);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="apple";
		char ch1='a';
		char ch2='p';
		
		System.out.println(replace(s,ch1,ch2));
		
	}

}
