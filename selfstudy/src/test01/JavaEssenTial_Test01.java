package test01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaEssenTial_Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = 0, sum=0;
		System.out.println("정수 5개를 입력해 주세요 ");
		for(int i=1; i<=5; i++) {
			System.out.print(i + " >> ");
			try{
				test = scan.nextInt();
			}
			
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다 다시 입력하세요.");
				scan.next();
				i--;
				continue;
			}
			sum+=test;
		}
		System.out.println("총합 : " + sum);
		scan.close();
	}
}
