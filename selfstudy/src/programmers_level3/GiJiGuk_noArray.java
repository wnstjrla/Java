package programmers_level3;

public class GiJiGuk_noArray {

	public static void main(String[] args) {
		int n = 16;
		int[] stations = {9};
		int w = 2;
		
		int answer = 0; //3
		int count = 0;
		int a = 0;
		int b = (w*2)+1;
		
		for(int i=1; i<=n; i++) {
			count++;
			if(i == stations[a]) {
				count -= (w+1);
				if(a+1 < stations.length) a++;
				answer += (count / b) + (count % b > 0 ? 1 : 0);
				count = 0-w;		
			}
			if(i >= n && count > 0) {
				answer += (count / b) + (count % b > 0 ? 1 : 0);
				count = 0;
			}
		}
		
		System.out.println("answer = " + answer);
	}

}
