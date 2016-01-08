package com.dineshonjava.struts2.login;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

public class Search extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    	
//System.out.println("hi");

        String id3= request.getParameter("id3");
// System.out.println(""+id2);   
try{
        
        //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

	//creating connection with the database 
          Connection  con=DriverManager.getConnection
                     ("jdbc:mysql://localhost/school","root","1234");
  //        Statement stmt = con.createStatement();    
         PreparedStatement ps=con.prepareStatement
                  ("select * from pinfo Where pid=(?)");

       ps.setString(1, id3);
  
        ResultSet rs=ps.executeQuery();
        out.println("<table border=1 width=50% height=50%>");
        out.println("<tr><th>Subject</th><th>First Name</th><th>Last Name</th><tr>");
          while (rs.next()) {
        	  String s = rs.getString("psubject"); 
            String n = rs.getString("fname");
              String nm = rs.getString("lname");
              out.println("<tr><td>" + s + "</td><td>" + n + "</td><td>" + nm + "</td></tr>"); 
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