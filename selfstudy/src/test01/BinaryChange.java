package test01;

import java.util.Scanner;

public class BinaryChange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("<10진수를 2진수로 변환 하기>");
		System.out.print("0~128사이의 숫자를 입력해 주세요 >> ");
		
		int a = scan.nextInt();
		int b = 128;
		
		System.out.print(a + "의 2진수 : ");
		for(int i=0; i<8; i++) {
			if(a >= b) {
				System.out.print("1");
				a-=b;
			}
			else System.out.print("0");
			b/=2;
		}
		
		scan.close();
	}

}
