<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
	<title> Form </title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName"/>
	<br><br>
	Last Name: <form:input path="lastName"/>
	<br><br>
	country: <form:select path="country">
		<form:options items="${student.countryOptions}"></form:options>
	</form:select>
	
	<br><br>
	
	Computer Language:
	<br>
	<form:radiobuttons path="computerLanguage" items="${student.computerLanguageOptions}"/>
	<br><br>
	
	Operating Systems:
	<br>
	<form:checkboxes path="operatingSystems" items="${student.operatingSystemOptions}"/>
	<br><br>
	
	<input type="submit" value="Submit"/>
	
	</form:form>
</body>
</html>