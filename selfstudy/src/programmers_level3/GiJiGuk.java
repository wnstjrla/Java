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
			if(ap[i] == 0) count++; //기지국이 없다면 기지국이 필요한 아파트의 개수 증가
			
			if(i == stations[a]-1) {
				for(int j=(stations[a]-1)-w; j<=(stations[a]-1)+w; j++) { //기존의 기지국 위치 +- 범위 만큼
					if(j >= 0 && j <= ap.length-1) ap[j] = 1; //범위가 아파트 범위 안에 있다면 1을 대입 
				}
				if(a+1 < stations.length) a++;
				count -= (w+1); 
			}
			
			if((i == ap.length-1 || ap[i] == 1) && count != 0) { //기지국이 있다면 필요한 아파트 개수 만큼 기지국 설치
				answer += (count / range) + (count % range > 0 ? 1 : 0);
				count = 0;
			}
		}

		System.out.println(answer);
	}

}
