package test01;

public class Pointer {

	public static void main(String[] args) {
		int a = 131241;
		for(int i=1; i<=100; i++) {
			if(a != (int)Math.log(i)) {
				a = (int)Math.log(i);
				System.out.println((int)Math.log(i));
			}
			System.out.println(i + "ÀÔ´Ï´Ù");
		}
		int i;
		for(i=4; i<=6; ++i);
		System.out.println(i);
	}
}
