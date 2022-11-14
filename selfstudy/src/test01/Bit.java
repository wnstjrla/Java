package test01;

public class Bit {
	
	static enum sub{
		a, b, c
	}
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 4;
		num1 = num1 >> 3 << num2;
		System.out.println(num1);
		
		int number = 10;
		System.out.println(Integer.toBinaryString(number));
		
		int test = Integer.valueOf(0);
		System.out.println(test);
	}

}
