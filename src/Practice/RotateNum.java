package Practice;

public class RotateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12345;
		int count=Integer.toString(num).length();
		int rotate=2;
		
		int div=(int) Math.pow(10,rotate);//100
		int mul=(int) Math.pow(10,count-rotate);//1000
		
		int remainder=num%div;//45
		int finalNum=remainder*mul+num/div;//45*1000+123=45123
		
		System.out.println(finalNum);
	}

}
