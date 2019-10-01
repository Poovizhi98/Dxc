package javaday4;

public class Static {
	int a=10;
   static  int b=20;
	
	public void display() {
		int a=100;
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Static static1=new Static();
        //Static.display();
        static1.display();
        System.out.println(b);
        b++;
        System.out.println(b);
	}

}
