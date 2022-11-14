package test02;

public class GetterSetter {
	private int speed;
	
	//Getter
	public int getSpped() {
		return speed;
	} 
	
	//Setter
	public void setSpeed(int speed) {
		if(this.speed <= 0) this.speed = speed;
		else this.speed = 0;
	}
}
