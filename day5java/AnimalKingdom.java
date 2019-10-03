package day5java;

public abstract class AnimalKingdom {
     int picture;
     int foodee;
     String hunger;
     String boundaries;
     String location;
     public abstract void makeNoise();
     public abstract void eat();
     public abstract void sleep();
     public abstract void roam() ;
}
abstract class Feline extends AnimalKingdom{
	@Override
	public void roam() {
		// TODO Auto-generated method stub
		System.out.println("Feline roam");
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Feline sleep");
	}
	
}
abstract class Hippo extends AnimalKingdom{
	public abstract void eat();
}
abstract class Canine extends AnimalKingdom{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Canine makes noise ");
	}

	@Override
	public void roam() {
		// TODO Auto-generated method stub
		System.out.println("Canine roam");
	}
	
}
class Lion12 extends Feline{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Lion makes noise very loudly");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Lion eat A");
	}
	
}
class Tiger extends Feline{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Tiger makes noise loudly");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Tiger eat deer");
	}
	
}
class Cat1 extends Feline{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Cat makes noise meow");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat eat mouse");	
	}
	
}
class Bulldog extends Canine{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Bulldog eat d");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Bulldog sleep like dog");
	}	
}
class Pug extends Canine{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Pug eat e");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("pug sleeps like bulldog");
	}
	
}