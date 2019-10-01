package javaday4;

public class Student {
	private String name;
	private int regno;

	public Student(String name, int regno) {
		super();
		this.name = name;
		this.regno = regno;
	}

 	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
    	this.regno = regno;
	}

	
}
