package Javaday3;

public class Customer {
	
	int customerId;
	String customerName;
	String customerAddress;
	int billAmount;
	
     public Customer() {
    	 customerId=0;
    	 customerName="Not available";
    	 customerAddress="Not available";
    	 billAmount=100;
	}
     public Customer(int cId,String cNme,String cAddr,int bAmou)
     {
         customerId=cId;
         customerName=cNme;
         customerAddress=cAddr;
         billAmount=bAmou;
     }
      
     public Customer(int customerId, String customerName) {
		this();
		this.customerId = customerId;
		this.customerName = customerName;
	}
     
     
	public Customer(String customerName, String customerAddress, int billAmount) {
		this();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
	}
	
	
	public Customer(int customerId, String customerName, int billAmount) {
		this();
		this.customerId = customerId;
		this.customerName = customerName;
		this.billAmount = billAmount;
	}
	public void display()
     { 
    	 System.out.println("Customer Id is: "+customerId);
    	 System.out.println("Customer Name is: "+customerName);
    	 System.out.println("Customer Address is: "+customerAddress);
    	 System.out.println("Bill Amount is: "+billAmount);
    	 System.out.println("########################");
     }
	

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer(1,"Neha","Delhi",980);
		Customer c2=new Customer(2,"Kousalya");
		c2.display();
		Customer c3=new Customer();
		c3.display();
		Customer c4=new Customer("Ragul","Tamil Nadu",1000);
		c4.display();
		Customer c5=new Customer(5,"Poovisha",5000);
		c5.display();
		c1.setBillAmount(5000);
		System.out.println(c1.getBillAmount());
		c1.display();
		c3.setCustomerName("Thenral");
		System.out.println(c3.getCustomerName());
		
	

	}

}
