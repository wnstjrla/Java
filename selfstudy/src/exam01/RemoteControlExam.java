package exam01;

public class RemoteControlExam {

	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Tv();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(3);
		rc.turnOff();
	}

}
