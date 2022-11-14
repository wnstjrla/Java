package programmers_level2;

import java.util.*;

public class EnglishPlay {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		int n = 5; //인원수
		int[] result = new int[] {0, 0}; //리턴값은 [3, 3]이 나와야함
		
		Stack<String> stack = new Stack<>();
        int turn = 1; //턴
        int time = 0; //차례
        String lastword = "";
        String firstword = "";
        
        for(int i=0; i<words.length; i++) {
        	firstword = "" + words[i].charAt(0); //첫 번째 글자
            time++;
            if(time > n) {
                time = 1;
                turn++;
            }
            
            if(stack.empty()) stack.push(words[i]);
            else {
            	if(stack.peek().length() <= 1) break; //단어가 한글자 이하면 종료
            	else if(stack.contains(words[i])) break; //중복된 단어면 종료
            	else if(lastword != "" && !firstword.equals(lastword)) break; //잘못된 단어면 종료
            	stack.push(words[i]);
            }
            lastword = "" + words[i].charAt(words[i].length()-1); //마지막 글자
        }
        System.out.println(time + " " + turn);
	}

}
