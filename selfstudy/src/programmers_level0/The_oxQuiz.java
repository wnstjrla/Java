package programmers_level0;

import java.util.Arrays;

public class The_oxQuiz {

	public static void main(String[] args) {
		String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
		String[] result = new String[quiz.length];
		
		String[][] sp = new String[quiz.length][5];
		
		int a, b, y;
		
		for(int i=0; i<sp.length; i++) {
			sp[i] = quiz[i].split(" ");
			
			a = Integer.parseInt(sp[i][0]);
			b = Integer.parseInt(sp[i][2]);
			y = Integer.parseInt(sp[i][4]);
			if(sp[i][1].equals("+")) {
				if(a + b == y) result[i] = "O";
				else result[i] = "X";
			}
			else {
				if(a - b == y) result[i] = "O";
				else result[i] = "X";
			}
		}
		
		System.out.println(Arrays.toString(result));
		
		
	}

}
