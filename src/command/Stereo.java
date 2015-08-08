package command;

public class Stereo {
	public void on() {
		System.out.println("Stereo is on");
	}
	public void off() {
		System.out.println("Stereo is off");
	}
	public void setCd() {
		System.out.println("set for CD input");
	}
	public void setRadio() {
		System.out.println("set for Radio");
	}
	public void setVolume(int vol) {
		System.out.println("set volume " + vol);
	}
}
