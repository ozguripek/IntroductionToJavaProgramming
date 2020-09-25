package chapter09.Exercise08;

public class Fan {
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;

	private int speed= SLOW;
	private boolean on;
	private double radius=5;
	String color= "blue";
	
	Fan() {

	}
	public String toString() {
		
		if (on) {
			return "speed: " + getSpeed() + " color: " + getColor() + " radius " + getRadius();
		}
		else {
			return "color: " + getColor() + " radius " + getRadius() + " fan is off";
		}
	}
	public String getSpeed() {
		String s = "";
		switch (speed) {
			case 1: s = "SLOW"; break;
			case 2: s = "MEDIUM"; break;
			case 3: s = "FAST";
		}
		return s;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String colort) {
		this.color = colort;
	}
		
	
}
