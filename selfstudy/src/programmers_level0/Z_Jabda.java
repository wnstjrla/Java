package programmers_level0;

import java.util.*;

@SuppressWarnings("unused")
public class Z_Jabda {

	public static void main(String[] args) {
		String[] history = {"hello i am david", "hello kail", "hi tina"};
		String keyword = "hello";
		
		@SuppressWarnings("unused")
		String[][] words = new String[history.length][3];
		String[] result = new String[10];
		int count = 0;
		
		for(int i=0; i<history.length; i++) {
			if(history[i].indexOf(keyword) > -1) {
				result[count] = history[i];
				count++;
			}
		}
		String[] answer = new String[2];
		count = 0;
		for(int i=0; i<result.length; i++) {
			if(result[i].indexOf(keyword) > -1) {
				answer[count] = result[i];
				count++;
			}
		}
		
		
		System.out.println();
		
	}

}
