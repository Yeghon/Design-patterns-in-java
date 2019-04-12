package builderDesign;

public class Phonebuilder 
{
	private String os, processor;
	private int ram, battery;
	private double screenSize;
	public String getOs() {
		return os;
	}
	public Phonebuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public Phonebuilder getProcessor() {
		return this;
	}
	public Phonebuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public Phonebuilder getRam() {
		return this;
	}
	public Phonebuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public Phonebuilder getBattery() {
		return this;
	}
	public Phonebuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public Phonebuilder getScreenSize() {
		return this;
	}
	public Phonebuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	
	public Phone getPhone()
	{
		return new Phone(os, processor, ram, battery, screenSize);
	}
	
	

}
