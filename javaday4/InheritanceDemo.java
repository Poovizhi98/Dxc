package javaday4;

class Mammal{
	int age=100;
	protected void eat() {
		System.out.println("All mammals eat");
	}		
		public void display() 
		{
		int age=90;
		System.out.println(age);
		System.out.println(this.age);
	    }
}
class Dog extends Mammal
{
	int age=45;
	public void eat() {
		System.out.println("Dogs eat pedigree");
		System.out.println(age);
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.display();
		d.eat();

	}

}
