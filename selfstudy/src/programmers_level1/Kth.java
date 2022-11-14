package programmers_level1;
import java.util.Arrays;
public class Kth {

	public static void main(String[] args) { //출력 예시 [5, 6, 3];
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] copy = {};
		int first = 0, last = 0, key = 0, imsi = 0;
		int[] result = new int[commands.length];
		
		for(int i=0; i<commands.length; i++) {
			first = commands[i][0];
			last = commands[i][1];
			key = commands[i][2];
			copy = new int[last-first+1];
			System.arraycopy(array, first-1, copy, 0, last-first+1);
			System.out.println(Arrays.toString(copy));
			for(int j=0; j<copy.length; j++) { //정렬
				for(int k=j; k<copy.length; k++) {
					if(copy[j] > copy[k]) {
						imsi = copy[j];
						copy[j] = copy[k];
						copy[k] = imsi;
					}
				}
			}
			
			result[i] = copy[key-1];
		}
		
		System.out.println(Arrays.toString(result));
	}

}
