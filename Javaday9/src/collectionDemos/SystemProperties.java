package collectionDemos;

import java.util.Enumeration;
import java.util.Properties;

public class SystemProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Properties all=System.getProperties();
        //System.out.println(all);
        
        Enumeration<Object>elements=all.elements();
        while(elements.hasMoreElements()) {
        	System.out.println(elements.nextElement());
        }
        
	}

}
