package programmers_level3;

public class GiJiGuk {

	public static void main(String[] args) {
		int n = 16;
		int[] stations = {9};
		int w = 2;
		
		int answer = 0; //3
		int[] ap = new int[n];
		int count = 0;
		int range = (w*2)+1;
		int a = 0;
		
		for(int i=0; i<ap.length; i++) {
			if(ap[i] == 0) count++; //�������� ���ٸ� �������� �ʿ��� ����Ʈ�� ���� ����
			
			if(i == stations[a]-1) {
				for(int j=(stations[a]-1)-w; j<=(stations[a]-1)+w; j++) { //������ ������ ��ġ +- ���� ��ŭ
					if(j >= 0 && j <= ap.length-1) ap[j] = 1; //������ ����Ʈ ���� �ȿ� �ִٸ� 1�� ���� 
				}
				if(a+1 < stations.length) a++;
				count -= (w+1); 
			}
			
			if((i == ap.length-1 || ap[i] == 1) && count != 0) { //�������� �ִٸ� �ʿ��� ����Ʈ ���� ��ŭ ������ ��ġ
				answer += (count / range) + (count % range > 0 ? 1 : 0);
				count = 0;
			}
		}

		System.out.println(answer);
	}

}
