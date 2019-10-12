package jdbcDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.Load an appropriate driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		//2.Connect to db
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/dxc","root","root");
        Statement stat=con.createStatement();
        ResultSet res=stat.executeQuery("select * from customer");
        while(res.next())
        {
        	System.out.println(res.getString("customerName"));
        	//System.out.println(res.getString(2));
        	//System.out.println(res.getString(3));
        	//System.out.println(res.getString(4));
        	
        }
	}

}
