package test01;

import java.util.Stack;

public class stackTest {

	public static void main(String[] args) {
		Stack<String> a = new Stack<>();
		a.push("Hello"); //���ÿ� �� �߰�
		a.push("Guys");
		a.push("World");
		System.out.println(a.firstElement());
		System.out.println(a.peek());
		System.out.println(a.size());
		
		System.out.println("----------");
		
		a.pop(); //���ÿ� ���������� ���� ���� �����Ѵ�
		System.out.println(a.firstElement()); //���ÿ� ���� ù ��°�� �� ������ �� �ҷ�����
		System.out.println(a.peek()); //�ֻ��� �����͸� �������� �ʰ� �� �ҷ�����
		System.out.println(a.contains("Hello")); //���ÿ� ���ϴ� �����Ͱ� �ִ��� Ȯ��(true/false)
		System.out.println(a.size()); //������ ũ�� Ȯ��
		
		System.out.println("----------");
		
		a.clear(); //���� �ʱ�ȭ 
		System.out.println(a.empty()); //������ ����ִ��� Ȯ��(true/false)
		System.out.println(a.size());
		
		System.out.println("----------");
		
		Stack<Integer> b = new Stack<>();
		b.push(1);
		b.push(2);
		b.push(3);
		for(int i = 0; i<b.size(); i++) {
			System.out.println(b.search(i));
		}
		b.clear();
		System.out.println(b.size());
	}

}
