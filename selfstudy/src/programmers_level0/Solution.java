package programmers_level0;

public class Solution {

	public static void main(String[] args) {
		int n = 15; //result = 5
		int count = 0;
		int result = 0;
		
		for(int i=1; i<=n; i++) {
			count = 0;
			for(int j=1; j<=i; j++) {
				if(i % j == 0) count++;
			}
			if(count >= 3) result++;
		}
		
		System.out.println(result);
	}

}
