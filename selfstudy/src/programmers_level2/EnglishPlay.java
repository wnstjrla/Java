package programmers_level2;

import java.util.*;

public class EnglishPlay {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		int n = 5; //�ο���
		int[] result = new int[] {0, 0}; //���ϰ��� [3, 3]�� ���;���
		
		Stack<String> stack = new Stack<>();
        int turn = 1; //��
        int time = 0; //����
        String lastword = "";
        String firstword = "";
        
        for(int i=0; i<words.length; i++) {
        	firstword = "" + words[i].charAt(0); //ù ��° ����
            time++;
            if(time > n) {
                time = 1;
                turn++;
            }
            
            if(stack.empty()) stack.push(words[i]);
            else {
            	if(stack.peek().length() <= 1) break; //�ܾ �ѱ��� ���ϸ� ����
            	else if(stack.contains(words[i])) break; //�ߺ��� �ܾ�� ����
            	else if(lastword != "" && !firstword.equals(lastword)) break; //�߸��� �ܾ�� ����
            	stack.push(words[i]);
            }
            lastword = "" + words[i].charAt(words[i].length()-1); //������ ����
        }
        System.out.println(time + " " + turn);
	}

}
