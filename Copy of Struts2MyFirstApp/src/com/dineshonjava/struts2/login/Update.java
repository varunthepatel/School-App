package com.dineshonjava.struts2.login;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

@SuppressWarnings("serial")
public class Update extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    	
//System.out.println("hi");

String id1= request.getParameter("id");
String name1= request.getParameter("user");
String pass1= request.getParameter("pass");
String fname1= request.getParameter("fname");
String lname1= request.getParameter("lname");
String email1= request.getParameter("email");
//String dob1= request.getParameter("dob");
String address1= request.getParameter("address");
try{
        
        //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

	//creating connection with the database 
          Connection  con=DriverManager.getConnection
                     ("jdbc:mysql://localhost/school","root","1234");
  //        Statement stmt = con.createStatement();    
         PreparedStatement ps=con.prepareStatement
                  ("update sinfo SET suser=(?),spass=(?),saddress=(?),semail=(?),fname=(?),lname=(?) Where sid=(?) ");

         ps.setString(1, name1);
         ps.setString(2, pass1);
       
        ps.setString(3, address1);
   //     ps.setString(7, dob1);
        ps.setString(4, email1);
        ps.setString(5, fname1);
        ps.setString(6, lname1);
        ps.setString(7, id1);
        //  ResultSet rs=stmt.executeQuery("select * from login Where id=?");
     //     ResultSet rs = stmt.executeQuery("select * from login Where id =(?) ");
      //  rs.setString(1, id3);
        int i=ps.executeUpdate();
        if(i>0)
        {
          out.println("You are sucessfully registered");
        }
      
        }
          catch (Exception e) {
          out.println("error");
      }	
      }
  }