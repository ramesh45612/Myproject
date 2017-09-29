<%@page import="Ram.*" %>  
<% 
//int id=Integer.parseInt(request.getParameter("id"));  
String name=request.getParameter("name");
String mobile=request.getParameter("mobile");
String  email=request.getParameter("email");

User usr= new User(name,mobile,email);
UserDao dao=new UserDao();
int i=dao.register(usr);

out.print("details stored successfuly"+i);

%>
 
 