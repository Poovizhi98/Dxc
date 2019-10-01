package javaday4;

public class ContractEmployee extends Employee1 {
	private int payPerHour;
	private int duration;
	

	public ContractEmployee(int empId, String empName) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}
	public ContractEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "ContractEmployee [payPerHour=" + payPerHour + ", duration=" + duration + ", getEmpId()=" + getEmpId()
				+ ", getEmpName()=" + getEmpName() + "]";
	}
	

}
