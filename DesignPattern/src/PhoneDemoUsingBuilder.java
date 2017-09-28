class Phone {
	private String os;
	private String battery;
	private String camera;
	private int screenSize;
	public Phone(String os, String battery, String camera, int screenSize) {
		super();
		this.os = os;
		this.battery = battery;
		this.camera = camera;
		this.screenSize = screenSize;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", battery=" + battery + ", camera=" + camera + ", screenSize=" + screenSize + "]";
	}
}

class PhoneBuilder {
	private String os;
	private String battery;
	private String camera;
	private int screenSize;

	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	// every setter return builder class
	public PhoneBuilder setBattery(String battery) {
		this.battery = battery;
		return this;
	}

	public PhoneBuilder setCamera(String camera) {
		this.camera = camera;
		return this;
	}

	public PhoneBuilder setScreenSize(int screenSize) {
		this.screenSize = screenSize;
		return this;
	}

	public Phone getPhone() {
		return new Phone(os, battery, camera, screenSize);
	}
}

public class PhoneDemoUsingBuilder {
	public static void main(String[] args) {
		// without using builder we will create object as normally
		//need to pass exactly params order also
		// we have to pass all parameters
		Phone ob = new Phone("Android", "goodBatery", "20 Mega Px", 5);
		System.out.println(ob);
		// using Phone Builder
		System.out.println("Using Phone Builder");
		PhoneBuilder pb = new PhoneBuilder();
		//if you not specified it will take default
/*		pb.setBattery("goodBatery");
*/		pb.setCamera("20 Mega Px Cam");
		pb.setOs("Android");
		pb.setScreenSize(5);	
		Phone phone=pb.getPhone();
		System.out.println(phone);
		
		Phone pb1 = new PhoneBuilder()
		.setBattery("bat")
		.setCamera("cam")
		.setOs("os")
		.setScreenSize(12)
		.getPhone();
		
		System.out.println(pb1);
	}
}


//notes
/*
for create object will go creational desing pattern like above		
compose objects include one more object in object - structural design pattern
communication b/w objects will  go behavioral design patterns

Factory Design Pattern:
we want to hide the logic of creation of object
*/