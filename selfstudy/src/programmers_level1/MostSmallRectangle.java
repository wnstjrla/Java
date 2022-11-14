package programmers_level1;

public class MostSmallRectangle {

	public static void main(String[] args) {
		int[][] size = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int result = 0, change = 0;
		
		for(int i=0; i<size.length; i++) {
			if(size[i][0] < size[i][1]) {
				change = size[i][0];
				size[i][0] = size[i][1];
				size[i][1] = change;
			}
		}
		change = size[0][0];
		for(int i=1; i<size.length; i++) {
			if(change < size[i][0]) change = size[i][0];
		}
		
		for(int i=0; i<size.length; i++) {
			if(result < size[i][1]) result = size[i][1];
		}
		
		System.out.println(result*change);
	}
	

}
