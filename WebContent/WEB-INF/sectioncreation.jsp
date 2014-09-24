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
		<c:forEach var="faculty" items="${faculty}">
		<option value="faculty">${ faculty }</option>
		</c:forEach>
	</select> <br>
Subject : 
	<select name="subject">
		<c:forEach var="subject" items="${subject}">
		<option value="subject">${subject}</option>
		</c:forEach>
	</select> <br>
Subject Prerequisite : <input type = "text" name = "subjectprerequisite">
Schedule : <input type = "text" name = "schedule">
<input type = "submit" value = "Isummite">
</form>

</body>
</html>