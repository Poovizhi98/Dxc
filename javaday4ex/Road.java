package javaday4ex;

public class Road {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck=new Truck("Brown",6,"A");
		truck.truckDisplay();
		truck.setCapacity(2000);
		truck.setBrand("Mahindra");
		
		Bus bus=new Bus("Yellow",4,"B");
		truck.truckDisplay();
		bus.setNoOfSeats(52);
		bus.setNoOfPassengers(40);
		System.out.println(bus);
		bus.vehicleDisplay();
		
		Car car=new Car("Red",4,"C");
		car.carDisplay();
		car.setMileage(500);
		car.setSpeed(100);
		System.out.println(car);

		

	}

}
