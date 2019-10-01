package javaday4;

public class StringBufferDemo {
	public void display() {
		String message="Garbagecollector";
		System.out.println(message.concat("Isveryeasytounderstand"));
		System.out.println(message);//Strings are immutable
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StringBuffer is mutable 
		// Thead and synchronization 
		StringBuffer quotes=new StringBuffer();
		System.out.println(quotes.capacity());
		System.out.println(quotes.append("aoherotdetyuopiyt"));
		System.out.println(quotes.capacity());
		System.out.println(quotes.length());
		StringBufferDemo a=new StringBufferDemo();
		a.display();

	}

}
