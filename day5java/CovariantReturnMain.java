package day5java;

import day5java.Covariantreturn;

public class CovariantReturnMain {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		Covariantreturn covariantreturn=new Covariantreturn();
		covariantreturn.giveFeedback();
		Cat c=new Cat();
		c.eat(covariantreturn);
	}

}
