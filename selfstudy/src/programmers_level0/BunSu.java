package programmers_level0;

import java.util.Arrays;

public class BunSu {

	public static void main(String[] args) {
		int denum1 = 4;
		int num1 = 10;
		int denum2 = 10;
		int num2 = 4;
		
		int[] result = new int[2];
		
		if(num1 < num2) { //�ι�° �м��� �и� �� ū ���
			if(num2 % num1 == 0) { //�������� ū���� ����� ���
				denum1 *= num2/num1;
				num1 *= num2/num1;
			}
			else { //�������� ū���� ���ؼ� ����� ���
				denum1 *= num2;
				denum2 *= num1;
				num1 *= num2;
				num2 *= num1;
			}
		}
		else if(num1 > num2) { //ù��° �м��� �и� �� ū ���
			if(num1 % num2 == 0) { //�������� ū���� ����� ���
				denum2 *= num1/num2;
				num2 *= num1/num2;
			}
			else { //�������� ū���� ���ؼ� ����� ���
				denum1 *= num2;
				denum2 *= num1;
				num1 *= num2;
				num2 *= num1;
			}
		}
		
		result[0] = denum1 + denum2;
		result[1] = num1;
		
		System.out.println(Arrays.toString(result));
	}

}
