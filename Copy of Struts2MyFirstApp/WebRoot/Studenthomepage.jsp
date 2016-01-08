<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
</head>
<body>



 <div class="row">
    <div class="large-12 columns">
<span style="color:#611DEB">
      <h1>School management system</h1>
      <hr/>
    </div>
  </div>
 
   
 
 
   
 
  <div class="row">
       <article>

       
   
        <h2>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href="Login.jsp" style="color:#1DA3EB"> 
Logout</a> &nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <a href style="color:#1DA3EB">About us</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href style="color:#1DA3EB">Admissions</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href="faculty1.html" style="color:#1DA3EB">Faculty</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href="contactus.html" style="color:#1DA3EB">Contact us</a></h2>     


            <img src="http://i.picresize.com/images/2014/10/05/InNyq.jpg"/>
          </div>
        </div>
 
      <hr/>
 
      <article>
 <h1  style="color:green"> Hi <%=request.getParameter("user")%>
 
<ul>
<li><a href="Search.jsp">Instructor`s Information</li>
<li><a href="http://www.nyit.edu/library">Library Login</li>
<li><a href="">Fees Managment</li>
<li><a href="http://www.nyit.edu/files/uploads/00/MAFinalExamsSpring15.pdf">Exam Schedule</li>
</ul>
 
  <footer class="row">
    <div class="large-12 columns">
      <hr/>
      <div class="row">
        <div class="large-6 columns">
          <p>@school management project team</p>
        </div>
   
    </div>
  </footer>
   






 
	
</body>
</html>