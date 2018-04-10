
public class DeskLamp {
	//Fields
	private boolean isOn;
	
	//Methods
	public void turnOn() {
		this.isOn=true;
	}
	public void turnOff() {
		this.isOn=false;
	}
	public String toString() {
		if(isOn) {
			return "ÄÑÁü";
		}
		else {
			return "²¨Áü";
		}
	}
}
