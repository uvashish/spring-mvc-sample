<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer</title>
</head>
<body>
<!-- 	Language: <a href="?language=en">English</a> | <a href="?language=es">Spanish</a> -->
	<form:form commandName="customer">
		<table>
			<tr>
				<td><spring:message code="customer.firstName"/></td>
				<td><form:input path="firstName"/></td>
			</tr>
			
			<tr>
				<td><spring:message code="customer.lastName"/></td>
				<td><form:input path="lastName"/></td>
			</tr>
	
			<tr>
				<td>
					<input type="submit" value="Add Customer"/>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>