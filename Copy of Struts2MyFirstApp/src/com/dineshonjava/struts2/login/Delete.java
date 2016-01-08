package com.dineshonjava.struts2.login;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

public class Delete extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    	
System.out.println("hi");

String id2= request.getParameter("id2");
 System.out.println(""+id2);   
try{
        
        //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

	//creating connection with the database 
          Connection  con=DriverManager.getConnection
                     ("jdbc:mysql://localhost/school","root","1234");
  //        Statement stmt = con.createStatement();    
         PreparedStatement ps=con.prepareStatement
                  ("delete from sinfo Where sid=(?)");

        ps.setString(1, id2);
      //  ResultSet rs=stmt.executeQuery("select * from login Where id=?");
     //     ResultSet rs = stmt.executeQuery("select * from login Where id =(?) ");
      //  rs.setString(1, id3);
        int i=ps.executeUpdate();
        if(i>0)
        {
          out.println("You are sucessfully Deleted");
        }
        con.close();
        
        }
          catch (Exception e) {
          out.println("error");
      }	
      }
  }