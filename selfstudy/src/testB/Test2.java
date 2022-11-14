package testB;
import testA.Test1;
public class Test2 extends Test1{
	//super로 호출할 경우 protected 접근가능
//	Test2() { super(); }

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Test1 t1 = new Test1();
//		System.out.println(t1.a);
		
		Test2 t2 = new Test2();
		//정적 멤버일 경우 protected 접근가능
		System.out.println(t2.a);
		
		//생성자가 protected일때 객체 생성 불가능
		
		
		
		
		
		
	}
}
