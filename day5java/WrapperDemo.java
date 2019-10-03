package day5java;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String marks="90";
       int i=Integer.parseInt(marks);
       System.out.println(i+5);
       
       int p=90;
       Integer p1=new Integer(p);//boxing 
       
       int k=p1.intValue();//unboxing
       
       int k1=p1;//Autoboxing
       Integer p2=k1;//Autounboxing
       System.out.println(p);
       System.out.println(p1);
       System.out.println(k);
       System.out.println(k1);
       System.out.println(p2);
	}

}
