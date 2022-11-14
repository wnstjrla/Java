package programmers_level2;

public class GwalHo {

	public static void main(String[] args) {
		String s = "((()";
		boolean result = true;
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(') count++;
			else if(s.charAt(i) == ')') count--;
			if(count < 0) break;
		}
		if(count != 0) result = false;
		else result = true;
		
		System.out.println(result);

	}

}
