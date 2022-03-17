<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
	<title>Student Registration Page</title>
</head>

<body>
	
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName"/>	<br><br>
		Last Name: <form:input path="lastName"/>	<br><br>
		Country: <form:select path="country">
<%-- 
					<form:option value="India" label="India"></form:option>
					<form:option value="Canada" label="Canada"></form:option>
					<form:option value="Pakistan" label="Pakistan"></form:option>
					<form:option value="Norway" label="Norway"></form:option>
					<form:option value="Kenya" label="Kenya"></form:option>
 --%>
 					<form:options items="${student.countryList}" />
					
				</form:select>	<br><br>
		
		Favourite Language: 
<%-- 		<form:radiobutton path="language" value="Java"/> Java
		<form:radiobutton path="language" value="Python"/> Python
		<form:radiobutton path="language" value="C++"/> C++
		<form:radiobutton path="language" value="JavaScript"/> JavaScript	<br><br>
 --%>
 		<form:radiobuttons path="language" items="${student.languageList}"/>	<br><br>
 		
 		Operating System:
 		Windows <form:checkbox path="operatingSystems" value="Windows"/>
 		MacOS <form:checkbox path="operatingSystems" value="MacOS"/>
 		Linux <form:checkbox path="operatingSystems" value="Linux"/>	<br><br>
 				
		<input type="submit" value="Submit" />
	</form:form>

</body>

</html>