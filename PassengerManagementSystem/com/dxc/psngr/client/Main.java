package com.dxc.psngr.client;

import java.util.Scanner;

import com.dxc.psngr.dao.PassengerDAO;
import com.dxc.psngr.dao.PassengerDAOImpl;
import com.dxc.psngr.model.Passenger;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		PassengerDAO passengerDAO = new PassengerDAOImpl();
		while(true) {
			System.out.println("M E N U");
			System.out.println("1.Add passenger");
			System.out.println("2.Get All Passengers");
			System.out.println("3.E X I T");
			Scanner scanner=new Scanner(System.in);
			int choice=0;
			System.out.println("Please enter your choice between 1 to 3");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Please enter pnrNumber");
				int pnrNumber=scanner.nextInt();
				System.out.println("Please enter passenger Name");
				String passengerName=scanner.next();
				System.out.println("Please enter source");
				String source=scanner.next();
				System.out.println("Please enter destination");
				String destination=scanner.next();
				System.out.println("Please enter fare");
				int fare=scanner.nextInt();
				
				Passenger passenger=new Passenger(pnrNumber,passengerName,source,destination,fare);
				passengerDAO.addPassenger(passenger);
				System.out.println(passenger);
				break;
			case 2:
				System.out.println(passengerDAO.getAllPassengers());
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("R u drunk??Please enter number between 1 to 3 only");
				
			}
		}

	}

}
