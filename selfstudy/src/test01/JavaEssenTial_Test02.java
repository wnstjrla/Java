package test01;

public class JavaEssenTial_Test02 {

	public static void main(String[] args) {
		int count = 2147000000;
		while(true) {
			try{
				count+=1000000000;
			}
			catch(OutOfMemoryError e) {
				System.out.println("메모리 초과");
				break;
			}
			finally {
				System.out.println(count);
			}
		}
		
	}

}
