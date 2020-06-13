/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionPack;

import java.sql.*;

/**
 *
 * @author Admin
 */
public class SQLConnection {
    
    public static Connection ConnectDB(){
   
      Connection cn=null;
        try {
            Class.forName("add lie");//for exp org.sqlite.JDBC
            
            cn=DriverManager.getConnection("Add Database path");// jdbc:sql:filename
            
//            System.out.println("Connected....");
        } catch (Exception e) {
        e.printStackTrace();
        }
    
return cn;
}
    
}
