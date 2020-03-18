<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Customer Registration Form</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<i>Fill cutomer registration form. </i>
	<br>
	<br>
	<form:form action="processCustomerForm" modelAttribute="customer">
	
First Name: <form:input path="firstName" />
		<br>
		<br>
Last Name(*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"></form:errors>

		<input type="submit" value="Submit">

	</form:form>

</body>
</html>
