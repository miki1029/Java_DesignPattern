package command;

public class Light {
	private String lightName;
	
	public Light() {
		this.lightName = "Light";
	}
	
	public Light(String place) {
		this.lightName = place + " light";
	}
	
	public void on() {
		System.out.println(lightName + " is On");
	}
	public void off() {
		System.out.println(lightName + " is Off");
	}
}
