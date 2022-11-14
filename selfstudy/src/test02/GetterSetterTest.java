package test02;

public class GetterSetterTest {

	public static void main(String[] args) {
		GetterSetter gs = new GetterSetter();
		System.out.println(gs.getSpped());
		gs.setSpeed(10);
		System.out.println(gs.getSpped());
	}

}
