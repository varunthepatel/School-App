package com.dineshonjava.struts2.login;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Printall extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
//System.out.println("hi");
        
        try{
        
        //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

	//creating connection with the database 
          Connection  con=DriverManager.getConnection
                     ("jdbc:mysql://localhost/school","root","1234");
          Statement stmt = con.createStatement();    

          ResultSet rs = stmt.executeQuery("select * from sinfo");
          out.println("<table border=1 width=50% height=50%>");
          out.println("<tr><th>Id</th><th>User</th><th>Password</th><th>First Name</th><th>Last Name</th><th>D-O-B</th><th>Address</th><th>Email</th><tr>");
          while (rs.next()) {
              int a = rs.getInt("sid");
              String b = rs.getString("suser");
              String c = rs.getString("spass");
              String d = rs.getString("fname");
              String e = rs.getString("lname");
              String f = rs.getString("sdob");
              String g = rs.getString("saddress");
              String h = rs.getString("semail");
              out.println("<tr><td>" + a + "</td><td>" + b + "</td><td>" + c + "</td><td>" + d + "</td><td>" + e + "</td><td>" + f + "</td><td>" + g + "</td><td>" + h + "</td></tr>"); 
          }
          out.println("</table>");
          out.println("</html></body>");
          con.close();
         }
          catch (Exception e) {
          out.println("error");
      }	
      }
  }