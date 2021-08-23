package chapter6.command;

public class Light {
	String type;
	
	public Light(String type) {
		this.type = type;
	}
	
	void on() {
		System.out.println(type + " light on");
	}
	void off() {
		System.out.println(type + " light off");
	}
}
