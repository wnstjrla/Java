/*���ڿ� s���� �������� ���е� ���ڵ��� ����Ǿ� �ֽ��ϴ�.
str�� ��Ÿ���� ���� �� �ּҰ��� �ִ밪�� ã�� �̸� "(�ּҰ�) (�ִ밪)"������ ���ڿ��� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.
������� s�� "1 2 3 4"��� "1 4"�� �����ϰ�,
"-1 -2 -3 -4"��� "-4 -1"�� �����ϸ� �˴ϴ�.*/
package programmers_level2;

import java.util.Arrays;

public class BigAndSmall {

	public static void main(String[] args) {
		String exam1 = "0 -1 59 64 -50 99 2"; //"-50 99" ����
		//String exam2 = "-1 -2 -3 -4"; //"-4 -1" ����
		//String exam3 = "-1 -1"; //"-1 -1" ����
		
		String[] sp = exam1.split(" ");
		int[] num = new int[sp.length];
		
		for(int i=0; i<num.length; i++) {
			num[i] = Integer.parseInt(sp[i]);
		}
		
		Arrays.sort(num);
		
		String result = num[0] + " " + num[num.length-1];
		System.out.println(result);
	}

}
