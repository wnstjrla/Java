package test01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaEssenTial_Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = 0, sum=0;
		System.out.println("���� 5���� �Է��� �ּ��� ");
		for(int i=1; i<=5; i++) {
			System.out.print(i + " >> ");
			try{
				test = scan.nextInt();
			}
			
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ� �ٽ� �Է��ϼ���.");
				scan.next();
				i--;
				continue;
			}
			sum+=test;
		}
		System.out.println("���� : " + sum);
		scan.close();
	}
}
