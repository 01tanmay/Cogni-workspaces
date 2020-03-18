<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>
<head>
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="student-process" modelAttribute="student">
	
	First Name: <form:input path="firstName" />

		<br>
		<br>
	 Last Name: 
		<form:input path="lastName" />

		<br>
		<br>
	 Country: <form:select path="country">

			<form:options items="${student.countryOptions}" />
		</form:select>
		<br>
		<br>		
	 Favourite Programming language: 
		<br>
		<br>
			Java   <form:radiobutton path="favLang" value="Java" />
			C      <form:radiobutton path="favLang" value="C" />
			Python <form:radiobutton path="favLang" value="Python" />
		<br>
		<br>
		<INPUT type="submit" value="Submit" />
	</form:form>

</body>
</html>
<%-- </jsp:root> --%>