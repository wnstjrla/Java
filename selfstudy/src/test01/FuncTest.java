package test01;

public class FuncTest {
	static int func(int n) {
		if(n == 0) return 1;
		return n * func(n-1);
	}
	public static void main(String[] args) {
		int a = 5;
		System.out.println(func(a));
		
	}

}
