package javaday4ex;

public class Car extends Vehicle {
	private int mileage;
	private int speed;
	public void carDisplay() {
		System.out.println("This is Car");
	}

	public Car(String color, int noOfWheels, String model) {
		super(color, noOfWheels, model);
		// TODO Auto-generated constructor stub
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car\n [mileage=" + mileage + ", \nspeed=" + speed + ",\n getColor()=" + getColor() + ",\n getNoOfWheels()="
				+ getNoOfWheels() + ",\n getModel()=" + getModel() + "]";
	}
	

}
