package programmers_level2;

public class DuoDelete {

	public static void main(String[] args) {
		String s = "baabaa";
		String read = "";
		int answer = -1;
		int stop = 0;
		
		while(stop == 0) {
			for(int i=0; ; i++) {
				if(s.equals("")) { //�ߺ��� ��� ���ŵǾ��ٸ� �ݺ� ���� + 1����
					answer = 1;
					stop = 1;
					break;
				}
				
				if(i >= s.length()) { //������ �ߺ��� ���ٸ� �ݺ� ���� + 0 ����
					answer = 0;
					stop = 1;
					break;
				}
				
				read = "" + s.charAt(i); //�ߺ�ã��
				if(s.indexOf(read + read) > -1) { 
					s = s.replace(read+read, "");
					break;
				}
			}
		}
		
		System.out.println(answer);
	}

}
