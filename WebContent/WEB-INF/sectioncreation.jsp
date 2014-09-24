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

<!-- Teacher : <input type = "text" name = "teacher"> <br> -->
Teacher : 
	<select name="teacher">

	<option value="teacher">${faculty}</option>

	</select> <br>
	


Subject : <input type = "text" name = "subject"> <br>
Subject Prerequisite : <input type = "text" name = "subjectprerequisite"> <br>

<!-- Schedule : <input type = "text" name = "schedule"> <br> -->

Schedule :
	<select name="schedule">
	<option value="blank"> </option>
	<option value="schedule">Please enter valid Schedule</option>
	</select>
</form>




<!-- Schedule : <input type = "text" name = "schedule"> -->
<input type = "submit" value = "Submit">

</form>

</body>
</html>