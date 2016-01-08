package com.dineshonjava.struts2.login;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Register extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	
        String suser = request.getParameter("user1");
        String spass = request.getParameter("password1");
        String sid = request.getParameter("id1");
        String saddress = request.getParameter("address1");
        String sdob = request.getParameter("dob1");
        String fname = request.getParameter("fname1");
        String lname = request.getParameter("lname1");
        String semail = request.getParameter("email1");
        try{
        
        //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

	//creating connection with the database 
          Connection  con=DriverManager.getConnection
                     ("jdbc:mysql://localhost/school","root","1234");

        PreparedStatement ps=con.prepareStatement
                  ("insert into sinfo values(?,?,?,?,?,?,?,?)");

        ps.setString(1, sid);
        ps.setString(2, suser);
        ps.setString(3, spass);

        ps.setString(4, saddress);
        ps.setString(5, sdob);
        ps.setString(6, semail);
        ps.setString(7, fname);
        ps.setString(8, lname);
        int i=ps.executeUpdate();
        
          if(i>0)
          {
            out.println("You are sucessfully registered");
          }
        
        }
        catch(Exception se)
        {
            se.printStackTrace();
        }
	
      }
  }