package com.dineshonjava.struts2.login;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

@SuppressWarnings("serial")
public class Printstudentdata extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    	
System.out.println("hi");

String user= request.getParameter("user1");
 System.out.println(""+user);   
try{
        
        //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

	//creating connection with the database 
          Connection  con=DriverManager.getConnection
                     ("jdbc:mysql://localhost/school","root","1234");
  //        Statement stmt = con.createStatement();    
         PreparedStatement ps=con.prepareStatement
                  ("select * from login Where user=(?)");

        ps.setString(1, user);
      //  ResultSet rs=stmt.executeQuery("select * from login Where id=?");
     //     ResultSet rs = stmt.executeQuery("select * from login Where id =(?) ");
      //  rs.setString(1, id3);
        ResultSet rs=ps.executeQuery();
        out.println("<table border=1 width=50% height=50%>");
        out.println("<tr><th>Id</th><th>User</th><th>Password</th><tr>");
          while (rs.next()) {
              int n = rs.getInt("id");
              String nm = rs.getString("user");
              String s = rs.getString("password"); 
              out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td></tr>"); 
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