package javaday4;

public class DemoInstanceAndStatic {
   
    {
    	//Anonymous block
    	System.out.println("instance block");
    }
    static {
    	System.out.println("Static block");
    }
    public DemoInstanceAndStatic() {
    	System.out.println("DemoInstanceAndStatic constructor");
    }
    W w=new W();
    public class W{
    	public W() {
    		System.out.println("W constructor");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main");
		new DemoInstanceAndStatic();
		new DemoInstanceAndStatic();

	}

}
