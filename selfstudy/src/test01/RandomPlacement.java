package test01;
import java.util.Scanner;
import java.util.Random;
public class RandomPlacement {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("반의 총 인원을 입력해주세요 >>");
		
		int allStudent = scan.nextInt(); //학생 수
		int[] locate = new int[allStudent]; //학생 인원수 만큼의 배열
		int key = 0; //몇 번 돌릴지 정하는 트리거
		int a,b,imsi;
		
		System.out.print("분단을 설정해 주세요 >>");
		int bundan = scan.nextInt(); //분단 입력받기
		
		for(int i=0; i<allStudent; i++) locate[i] = i+1; //1~학생수 만큼 숫자 지정
		
		while(key < 100) { //100번 만큼 돌리기
			a = rand.nextInt(allStudent); //랜덤 정수 하나 받기
			b = rand.nextInt(allStudent); //랜덤 정수 하나 받기
			imsi = locate[a];
			locate[a] = locate[b];
			locate[b] = imsi;
			key++; //받은 두 수를 이용하여 숫자 위치를 랜덤으로 바꾸기
		}
		System.out.println("=== 교탁 ===");
		for(int i=1; i<=locate.length; i++) {
			System.out.printf("%02d ", locate[i-1]);
			if(i%bundan==0 && i!=0) System.out.println(); //자리 배치
		}
		
		scan.close(); //Scanner 클래스 종료
	}

}