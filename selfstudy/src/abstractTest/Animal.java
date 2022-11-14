package abstractTest;

public abstract class Animal {
	public String name = "동물";
	
	public void bress() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
}
