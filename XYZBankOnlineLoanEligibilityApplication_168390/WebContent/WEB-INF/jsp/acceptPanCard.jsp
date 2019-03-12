<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accept Pan Card</title>
</head>

<body>
<script type="text/javascript">
	function validate(){
	if(document.getElementByName("panCard")==null || document.getElementByName("panCard")==""){
		alert("Pancard must not be empty");
	}
	if(document.getElementByName("panCard").match("{A-Z}[5]{0-9}[5]")){
		alert("Pancard Pattern must be Followed. ex=AZXTD8765J");
	}
	}
</script>
<form:form action="testEligibility.obj" modelAttribute="qq" method="post">
		<h2><b>XYZ Bank's Online Loan Eligibility Test Application</b></h2>
						Your PAN Card Number:<input type="text"  value="" name="panCard" ><br>
						<br>
						<input type="submit"  value="Test Eligibility" name="submit" onclick="validate()">
</form:form>	
</body>
</html>