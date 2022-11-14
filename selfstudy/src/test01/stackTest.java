package test01;

import java.util.Stack;

public class stackTest {

	public static void main(String[] args) {
		Stack<String> a = new Stack<>();
		a.push("Hello"); //스택에 값 추가
		a.push("Guys");
		a.push("World");
		System.out.println(a.firstElement());
		System.out.println(a.peek());
		System.out.println(a.size());
		
		System.out.println("----------");
		
		a.pop(); //스택에 마지막으로 들어온 값을 제거한다
		System.out.println(a.firstElement()); //스택에 가장 첫 번째로 들어간 데이터 값 불러오기
		System.out.println(a.peek()); //최상위 데이터를 제거하지 않고 값 불러오기
		System.out.println(a.contains("Hello")); //스택에 원하는 데이터가 있는지 확인(true/false)
		System.out.println(a.size()); //스택의 크기 확인
		
		System.out.println("----------");
		
		a.clear(); //스택 초기화 
		System.out.println(a.empty()); //스택이 비어있는지 확인(true/false)
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
