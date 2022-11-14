/*문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고,
"-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.*/
package programmers_level2;

import java.util.Arrays;

public class BigAndSmall {

	public static void main(String[] args) {
		String exam1 = "0 -1 59 64 -50 99 2"; //"-50 99" 리턴
		//String exam2 = "-1 -2 -3 -4"; //"-4 -1" 리턴
		//String exam3 = "-1 -1"; //"-1 -1" 리턴
		
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
