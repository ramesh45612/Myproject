    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<%-- Details of Customers:
	<table border="1">
	<tr><th>Account Number</th><th>Account Name</th>
    <c:forEach var="emp" items="${list}"> 
    <tr>
    <td>${emp.accountnumber}</td>
    <td>${emp.name}</td>
    </tr>
    </c:forEach>
    </table>
    <br/>
 --%>
 ${list}