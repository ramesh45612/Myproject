 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

 
 	details stored successfully!!
 	
 <h1> details from Database</h1>
 
 <table border="1">
	<tr><th>First Name</th><th>last Name</th><th>Mobile Number</th><th>Password</th>
    <c:forEach var="contact" items="${list}"> 
    <tr>
    <td>${contact.firstName}</td>
    <td>${contact.lastName}</td>
      <td>${contact.mobileNumber}</td>
      <td>${contact.password}</td>
    
    </tr>
    </c:forEach>
    </table>
     