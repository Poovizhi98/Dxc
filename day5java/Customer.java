package day5java;

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
     
     @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + billAmount;
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (billAmount != other.billAmount)
			return false;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
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
		Customer c1=new Customer(10,"Poovizhi","Bangalore",2800);
		Customer c2=new Customer(10,"Poovizhi","Bangalore",2800);
		Customer c3=c1;
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
	

	}

}
