package javaday4ex;

public class Vehicle {
	private String color;
	private int noOfWheels;
	private String model;
	public Vehicle(String color, int noOfWheels, String model) {
		super();
		this.color = color;
		this.noOfWheels = noOfWheels;
		this.model = model;
	}
	public void vehicleDisplay() {
		System.out.println("This is main or parent class(Vehicle class)");
	}
    public Vehicle() {
		super();
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", noOfWheels=" + noOfWheels + ", model=" + model + "]";
	}
	
	

}
