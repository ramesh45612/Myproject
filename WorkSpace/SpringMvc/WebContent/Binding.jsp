<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form action="test" method="POST" commandName="employeeForm">
	<table>
		<tr>
			<td>Employee Name :</td>
			<td><form:input path="name" /></td>
			<td><form:errors path="name" /></td>
		</tr>
		<tr>
			<td>Salary :</td>
			<td><form:input path="sal" /></td>
			<td><form:errors path="sal" /></td>
		</tr>
		
		
		<tr>
			<td><input type="submit" value="Submit"></td>
		</tr>
	</table>
</form:form>
