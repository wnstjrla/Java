package programmers_level0;

import java.util.Arrays;

public class BunSu {

	public static void main(String[] args) {
		int denum1 = 4;
		int num1 = 10;
		int denum2 = 10;
		int num2 = 4;
		
		int[] result = new int[2];
		
		if(num1 < num2) { //두번째 분수의 분모가 더 큰 경우
			if(num2 % num1 == 0) { //작은수를 큰수로 통분할 경우
				denum1 *= num2/num1;
				num1 *= num2/num1;
			}
			else { //작은수와 큰수를 곱해서 통분할 경우
				denum1 *= num2;
				denum2 *= num1;
				num1 *= num2;
				num2 *= num1;
			}
		}
		else if(num1 > num2) { //첫번째 분수의 분모가 더 큰 경우
			if(num1 % num2 == 0) { //작은수를 큰수로 통분할 경우
				denum2 *= num1/num2;
				num2 *= num1/num2;
			}
			else { //작은수와 큰수를 곱해서 통분할 경우
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
