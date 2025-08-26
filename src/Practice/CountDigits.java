package Practice;

public class CountDigits {
	
	public static void count(int n) {
		
		int temp=n;
		int count=0;
		
		while(temp!=0) {
			temp=temp/10;
			count++;
		}
		
		System.out.println("Count :"+count);
		
		int div=(int) Math.pow(10, count-1);
		System.out.println("div :"+div);
		
		while(div!=0) {
			int digit=n/div;
			System.out.print(digit+" ");
			n=n%div;
			div=div/10;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7523;
		
		count(n);
		
	}

}
