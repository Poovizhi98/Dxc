package javaday4ex;

public class Bus extends Vehicle {
	private int noOfSeats;
	private int noOfPassengers;
	public void busDisplay() {
		System.out.println("This is Bus");
	}

	public Bus(String color, int noOfWheels, String model) {
		super(color, noOfWheels, model);
		// TODO Auto-generated constructor stub
	}

	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	@Override
	public String toString() {
		return "Bus \n[noOfSeats=" + noOfSeats + ", \nnoOfPassengers=" + noOfPassengers + ",\n getColor()=" + getColor()
				+ ",\n getNoOfWheels()=" + getNoOfWheels() + ",\n getModel()=" + getModel() + "]";
	}
	

}
