package testB;
import testA.Test1;
public class Test2 extends Test1{
	//super�� ȣ���� ��� protected ���ٰ���
//	Test2() { super(); }

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Test1 t1 = new Test1();
//		System.out.println(t1.a);
		
		Test2 t2 = new Test2();
		//���� ����� ��� protected ���ٰ���
		System.out.println(t2.a);
		
		//�����ڰ� protected�϶� ��ü ���� �Ұ���
		
		
		
		
		
		
	}
}
