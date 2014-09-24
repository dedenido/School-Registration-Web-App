<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action = "newSection" method = "post">
Section Name: <input type = "text" name = "sectionname"> <br>
Teacher : 
	<select name="teacher">
	<option value="volvo">${ faculty }</option>
	<option value="saab">Saab</option>
	</select> <br>
Subject : <input type = "text" name = "subject">
Subject Prerequisite : <input type = "text" name = "subjectprerequisite">
Schedule : <input type = "text" name = "schedule">
<input type = "submit" value = "Isummite">
</form>

</body>
</html>