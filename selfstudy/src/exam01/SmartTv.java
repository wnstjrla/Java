package exam01;

public class SmartTv implements RemoteControl, Serch{
private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Tv�� �մϴ�");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Tv�� ���ϴ�");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} 
		
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		
		else {
			this.volume = volume;
		}
		
		System.out.println("���� Tv�� ���� : " + this.volume);
	}
	
	@Override
	public void Serch_url(String url) {
		System.out.println(url + "�� �˻��մϴ�");
	}
}
