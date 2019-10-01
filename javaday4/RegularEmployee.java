package javaday4;

public class RegularEmployee extends Employee1 {
	private int RegularSalary;
	private int bonus;

	public RegularEmployee() {
		// TODO Auto-generated constructor stub
	}

	public RegularEmployee(int empId, String empName) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}

	public int getRegularSalary() {
		return RegularSalary;
	}

	public void setRegularSalary(int regularSalary) {
		RegularSalary = regularSalary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "RegularEmployee [RegularSalary=" + RegularSalary + ", bonus=" + bonus + ", getEmpId()=" + getEmpId()
				+ ", getEmpName()=" + getEmpName() + "]";
	}
	
	

}
