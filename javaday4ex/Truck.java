package javaday4ex;

public class Truck extends Vehicle {
	
	private int capacity;
	private String brand;
    public void truckDisplay() {
    	System.out.println("This is truck");
    }
	public Truck(String color, int noOfWheels, String model) {
		super(color, noOfWheels, model);
		// TODO Auto-generated constructor stub
	}

	public Truck() {
		// TODO Auto-generated constructor stub
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Truck\n [capacity=" + capacity + ",\n brand=" + brand + ",\n getColor()=" + getColor() + ", \ngetNoOfWheels()="
				+ getNoOfWheels() + ",\n getModel()=" + getModel() + "]";
	}
    
	

}
