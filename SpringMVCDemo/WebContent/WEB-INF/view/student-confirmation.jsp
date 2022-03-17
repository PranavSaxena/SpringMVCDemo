<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
	<title>Student Confirmation Page</title>
</head>

<body>

	The student is confirmed: ${student.firstName} ${student.lastName}	<br>
	Country: ${student.country}	<br>
	Language: ${student.language} <br>
	OS: 
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li> ${temp} </li>
		</c:forEach>
	</ul>

</body>

</html>