package programmers_level2;

public class DuoDelete {

	public static void main(String[] args) {
		String s = "baabaa";
		String read = "";
		int answer = -1;
		int stop = 0;
		
		while(stop == 0) {
			for(int i=0; ; i++) {
				if(s.equals("")) { //중복이 모두 제거되었다면 반복 종료 + 1리턴
					answer = 1;
					stop = 1;
					break;
				}
				
				if(i >= s.length()) { //끝까지 중복이 없다면 반복 종료 + 0 리턴
					answer = 0;
					stop = 1;
					break;
				}
				
				read = "" + s.charAt(i); //중복찾기
				if(s.indexOf(read + read) > -1) { 
					s = s.replace(read+read, "");
					break;
				}
			}
		}
		
		System.out.println(answer);
	}

}
