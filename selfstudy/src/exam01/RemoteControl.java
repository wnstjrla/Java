package exam01;

public interface RemoteControl {
	//상수
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 1; //public static final 생략
	
	//메소드
	//abstract void turnOn();
	void turnOn(); //abstract 생략
	void turnOff();
	void setVolume(int volume);
	
}
