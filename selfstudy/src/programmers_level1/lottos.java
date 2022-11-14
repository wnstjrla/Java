package programmers_level1;
import java.util.Arrays;
public class lottos {
	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		int[] total = {6, 6, 5, 4, 3, 2, 1}; 
		int[] result = {0, 0};
		int winCount = 0;
		int lowerCount = 0;
		
		for(int i=0; i<lottos.length; i++) {
			for(int j=0; j<win_nums.length; j++) {
				if(lottos[i] == win_nums[j]) winCount++;
			}
			if(lottos[i] == 0) lowerCount++;
		}
		
		result[0] = total[winCount+lowerCount];
		result[1] = total[winCount];
		
		System.out.println(Arrays.toString(result));
	}

}
