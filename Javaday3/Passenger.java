package Javaday3;

public class Passenger {
	String pnrNumber;
	String mobileNumber;
	String passengerName;
	int fare;
	int cgst=100;
	int sgst=100;
	
	public void bookTicket()
	{
		pnrNumber="1987654321987644";
		mobileNumber="9787404130";
		passengerName="Poovizhi";
		fare=5000;
		fare=fare+cgst+sgst;
		System.out.println(passengerName+ " Your ticket booked successfully");
		System.out.println(mobileNumber+" is recorded too!");
		System.out.println("Your total fare is "+fare);
	}
	
	public void cancelTicket()
	{
		pnrNumber="7890654312345678";
		mobileNumber="9629600606";
		passengerName="Poovisha";
		fare=6000;
		fare=fare+cgst+sgst;
		System.out.println(passengerName+ " Your ticket booked successfully");
		System.out.println(mobileNumber+" is recorded too!");
		System.out.println("Your total fare is "+fare);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passenger p=new Passenger();
		p.bookTicket();
		System.out.println("#############");
		p.cancelTicket();

	}

}
