package javaday4;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularEmployee regularEmployee=new RegularEmployee(1001, "Neha");
		regularEmployee.setRegularSalary(62000);
		regularEmployee.setBonus(2000);
		System.out.println(regularEmployee);
		
		ContractEmployee contractEmployee=new ContractEmployee(1002,"Tufail");
		contractEmployee.setPayPerHour(5000);
		contractEmployee.setDuration(60);
		System.out.println(contractEmployee);

	}

}
