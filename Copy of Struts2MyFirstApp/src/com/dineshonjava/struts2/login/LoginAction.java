package com.dineshonjava.struts2.login;


import java.sql.*;  

public class LoginAction {  
public static boolean validate(String user,String password){  
boolean status=false;  
try{  
    //loading drivers for mysql
    Class.forName("com.mysql.jdbc.Driver");

//creating connection with the database 
      Connection  con=DriverManager.getConnection
                 ("jdbc:mysql://localhost/school","root","1234");

    		String sql = "SELECT * FROM login WHERE";
         sql+=" user = ? AND password = ?";
    	        
    		PreparedStatement ps = con.prepareStatement(sql);
   
		ps.setString(1, user);
		ps.setString(2, password);
         ResultSet rs = ps.executeQuery();
status=rs.next();  
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  

} 


