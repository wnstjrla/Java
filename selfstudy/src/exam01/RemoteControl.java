package exam01;

public interface RemoteControl {
	//���
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 1; //public static final ����
	
	//�޼ҵ�
	//abstract void turnOn();
	void turnOn(); //abstract ����
	void turnOff();
	void setVolume(int volume);
	
}
