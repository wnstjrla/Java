package test01;

import java.util.Scanner;

public class BinaryChange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("<10������ 2������ ��ȯ �ϱ�>");
		System.out.print("0~128������ ���ڸ� �Է��� �ּ��� >> ");
		
		int a = scan.nextInt();
		int b = 128;
		
		System.out.print(a + "�� 2���� : ");
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
