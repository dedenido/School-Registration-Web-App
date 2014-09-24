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

<div>You are logged in as ${ user.name }, with User ID ${ user.userId }
	and type ${ user.type }.</div>
<h1>Create Sections</h1>

<form action = "newSection" method = "post">
Section Name: <input type = "text" name = "sectionname"> <br>

Teacher : 
	<select name="teacher">
		<c:forEach var="faculty" items="${faculty}">
		<option value="faculty">${faculty}</option>
		</c:forEach>
	</select> <br>
	

Subject : 
	<select name="subjects">
		<c:forEach var="subject" items="${subject}">
		<option value="subject">${subject}</option>
		</c:forEach>

	</select> <br>

Schedule : <br>
     Day :
	 <select name="days">
	   <c:forEach var = "days" items = "${days}">
	   <option value = "days">${days.dayName}</option>
	   </c:forEach> 
	</select> 
	
	 Period :
	 <select name="period">
	   <c:forEach var = "period" items = "${period}">
	   <option value = "period">${period.timePeriod}</option>
	   </c:forEach> 
	</select> <br>

<input type = "submit" value = "Submit">

</form>

</body>
</html>