<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
	<title>Student Confirmation Page</title>
</head>

<body>

	Customer confirmed: ${customer.firstName} ${customer.lastName} <br><br>
	Free passes: ${customer.freePasses} <br><br>
	Postal Code: ${customer.postalCode}	<br><br>
	Course Code: ${customer.courseCode}	<br><br>
	
	
</body>

</html>