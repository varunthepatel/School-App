package com.dineshonjava.struts2.login;
   
import java.io.IOException;  
import java.io.PrintWriter;  
      

    import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
      
      
    @SuppressWarnings("serial")
	public class SecondServlet extends HttpServlet {  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
      
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
              
        String n=request.getParameter("user");  
        String p=request.getParameter("password");  
           if(n.equals("admin") && p.equals("admin")){
        	   
        	   RequestDispatcher rd=request.getRequestDispatcher("Admin.jsp");  
               rd.forward(request,response);  
           }
           else if(LoginAction.validate(n, p)){  
            RequestDispatcher rd=request.getRequestDispatcher("Instructor.jsp");  
            rd.forward(request,response);  
        }  
        else {  
            out.print("Sorry username or password error");  
            RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");  
            rd.include(request,response);  
        }  
              
        out.close();  
        }  
    }  