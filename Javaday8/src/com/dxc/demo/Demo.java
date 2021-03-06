package com.dxc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
      public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	  Class.forName("com.mysql.jdbc.Driver");
    	  Connection con = DriverManager.getConnection
    			  ("jdbc:mysql://localhost:3306/dxc", "root", "root");
    	  Statement stat =
                  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                          ResultSet.CONCUR_UPDATABLE);
    	  ResultSet res = stat.executeQuery("select * from employee");
          ResultSetMetaData rsmd = res.getMetaData();
          System.out.println("BEFORE");
          while (res.next()) { for (int i = 1; i <= rsmd.getColumnCount(); i++) {
              System.out.print(res.getString(i) + " ");System.out.println(); }  }
          res.moveToInsertRow();
          res.updateInt(1, 997);
          res.updateString(2, "Dutta");
          res.updateString(3, "Kokata");
          res.updateInt(4, 1234);
          res.insertRow();
         
          res.absolute(3);
          res.updateString(2, "Isha");
          res.updateRow();
     
          res.beforeFirst();
          System.out.println("AFTER UPDATING ");
          while (res.next()) { for (int i = 1; i <= rsmd.getColumnCount(); i++) {
              System.out.print(res.getString(i) + " "); } System.out.println(); }
          /*
           * res.next(); System.out.println(res.getString(2)); res.last();
           * res.relative(-2); System.out.println(res.getString(2)); res.previous();
           * System.out.println(res.getString(2));
           */
          /*
           * //
           *
           * System.out.println(rsmd.getColumnCount());
           * System.out.println(rsmd.getColumnName(3));
           * System.out.println(rsmd.getTableName(2));
           *
           * while (res.next()) { for (int i = 1; i <= rsmd.getColumnCount(); i++) {
           * System.out.print(res.getString(i) + " "); } System.out.println(); }
           */
	}
}
