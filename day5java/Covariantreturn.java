package day5java;
class Covariantreturn {
	int ratings;
	void giveFeedback() {
		System.out.println("Please give ratings for food");
	}
}
class Dosa extends Covariantreturn{
		
	}
class Animal{
		public Covariantreturn eat(Covariantreturn covariant) {
			Covariantreturn f=new Covariantreturn();
			f.ratings=5;
			return f;
		}
	}
class Cat extends Animal{
		public Dosa eat(Covariantreturn covariant)
		{
			Dosa d=new Dosa();
			d.ratings=1;
			return d;
		}
	}
class Dog extends Animal{
		public Dosa eat() {
			System.out.println("Dog eats pedigree");
			return null;
		}
}



	

