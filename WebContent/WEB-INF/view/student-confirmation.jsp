<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>

</head>

<body>
	Welcome! <br>
	Name: ${student.firstName} ${student.lastName} <br>
	Country: ${student.country} <br>
	Language: ${student.computerLanguage} <br>
	Operating Systems:
	<ul>
	  <c:forEach var="temp" items="${student.operatingSystems}"> 
	  	<li>${temp}</li>
	  </c:forEach>
	</ul>
</body> 
</html>