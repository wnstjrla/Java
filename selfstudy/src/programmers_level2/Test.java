package programmers_level2;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String a = "12432";
		String[] b = a.split("(?<=.)");
		
		int[] c = new int[b.length];
		int result = 0;
		
		for(int i=0; i<b.length; i++) {
			c[i] = Integer.parseInt(b[i]);
		}
		
		Arrays.sort(c);
		
		for(int i=0; i<b.length; i++) {
			result += (c[i] * (Math.pow(10, i)));
		}
		
		System.out.println(result);
	}
}
