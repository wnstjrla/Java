package test01;
import java.util.Scanner;
import java.util.Random;
public class RandomPlacement {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �� �ο��� �Է����ּ��� >>");
		
		int allStudent = scan.nextInt(); //�л� ��
		int[] locate = new int[allStudent]; //�л� �ο��� ��ŭ�� �迭
		int key = 0; //�� �� ������ ���ϴ� Ʈ����
		int a,b,imsi;
		
		System.out.print("�д��� ������ �ּ��� >>");
		int bundan = scan.nextInt(); //�д� �Է¹ޱ�
		
		for(int i=0; i<allStudent; i++) locate[i] = i+1; //1~�л��� ��ŭ ���� ����
		
		while(key < 100) { //100�� ��ŭ ������
			a = rand.nextInt(allStudent); //���� ���� �ϳ� �ޱ�
			b = rand.nextInt(allStudent); //���� ���� �ϳ� �ޱ�
			imsi = locate[a];
			locate[a] = locate[b];
			locate[b] = imsi;
			key++; //���� �� ���� �̿��Ͽ� ���� ��ġ�� �������� �ٲٱ�
		}
		System.out.println("=== ��Ź ===");
		for(int i=1; i<=locate.length; i++) {
			System.out.printf("%02d ", locate[i-1]);
			if(i%bundan==0 && i!=0) System.out.println(); //�ڸ� ��ġ
		}
		
		scan.close(); //Scanner Ŭ���� ����
	}

}