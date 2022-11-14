package programmers_level1;

import java.util.Stack;

public class CraneGatcha {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		int[][] board = new int[][] {
			{0, 0, 0, 0 ,0},
			{0, 0, 1, 0, 3},
			{0, 2, 5, 0, 1},
			{4, 2, 4, 4, 2},
			{3, 5, 1, 3, 1}
		};
		int[] moves = new int[] {1, 5, 3, 5, 1, 2, 1, 4};
		int result = 0;
		
		for(int i=0; i<moves.length; i++) {
			for(int j=0; j<board.length; j++) {
				if(board[j][moves[i]-1] != 0) {
					if(stack.empty()) stack.push(board[j][moves[i]-1]);
					else if(stack.peek() == board[j][moves[i]-1]) {
						stack.pop();
						result+=2;
					}
					else stack.push(board[j][moves[i]-1]);
					board[j][moves[i]-1] = 0;
					break;
				}
			}
		}
		System.out.println(result);
	}

}
