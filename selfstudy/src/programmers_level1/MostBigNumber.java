package programmers_level1;

import java.util.Arrays;

public class MostBigNumber {

	public static void main(String[] args) {
		int[] numbers = {90, 85, 1000, 20, 400};
		int[] firstNumbers = new int[numbers.length];
		int[] secondNumbers = new int[numbers.length];
		int[] thirdNumbers = new int[numbers.length];
		int[] fourNumbers = new int[numbers.length];
		int change = 0;
		String result = "";
		
		for(int i=0; i<numbers.length; i++) { //숫자의 각 자리 수 구하기
			if(numbers[i] >= 1000) { //1000
				firstNumbers[i] = 1;
				secondNumbers[i] = 0;
				thirdNumbers[i] = 0;
				fourNumbers[i] = 0;
			}
			else if(numbers[i] >= 100) { //652
				firstNumbers[i] = numbers[i]/100;
				secondNumbers[i] = (numbers[i] / 10) % 10;
				thirdNumbers[i] = numbers[i] % 10;
				fourNumbers[i] = -1;
			}
			else if(numbers[i] >= 10) { //65
				firstNumbers[i] = numbers[i] / 10;
				secondNumbers[i] = numbers[i] % 10;
				thirdNumbers[i] = -1;
				fourNumbers[i] = -1;
			}
			else if(numbers[i] >= 0) { //6
				firstNumbers[i] = numbers[i];
				secondNumbers[i] = -1;
				thirdNumbers[i] = -1;
				fourNumbers[i] = -1;
			}
		}
		System.out.println(Arrays.toString(firstNumbers));
		System.out.println(Arrays.toString(secondNumbers));
		System.out.println(Arrays.toString(thirdNumbers));
		System.out.println(Arrays.toString(fourNumbers));
		
		for(int i=0; i<numbers.length; i++) { //숫자들을 오름차순으로 정렬
			for(int j=0; j<numbers.length; j++) {
				if(firstNumbers[i] < firstNumbers[j]) {
					change = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = change;
				}
				else if(firstNumbers[i] == firstNumbers[j]){ //첫 째 자리수의 값이 같다면 두 번째 자리수 비교
					if(secondNumbers[i] < secondNumbers[j] && secondNumbers[j] != 0) {
						change = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = change;
					}
					else if(secondNumbers[i] == secondNumbers[j]){ //두 번째 자리수의 값이 같다면 세 번째 자리수 비교
						if(thirdNumbers[i] < thirdNumbers[j] && thirdNumbers[j] != 0) {
							change = numbers[i];
							numbers[i] = numbers[j];
							numbers[j] = change;
						}
						else if(thirdNumbers[i] == thirdNumbers[j]){ //세 번째 자리수의 값이 같다면 네 번째 자리수 비교
							if(fourNumbers[i] < fourNumbers[j] && fourNumbers[j] != 0) {
								change = numbers[i];
								numbers[i] = numbers[j];
								numbers[j] = change;
							}
						}
					}
				}
			}
			System.out.println(Arrays.toString(numbers));
		}
		for(int i=0; i<numbers.length; i++) result += numbers[i];
		System.out.println(result);
	}

}
