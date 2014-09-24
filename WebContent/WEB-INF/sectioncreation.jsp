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
		<option value="faculty">${faculty}</option>
		</c:forEach>
	</select> <br>
	

Subject : 
	<select name="subject">
		<c:forEach var="subject" items="${subject}">
		<option value="subject">${subject}</option>
		</c:forEach>

	</select> <br>

<!-- Subject Prerequisite : <input type = "text" name = "subjectprerequisite"> <br> -->
<!-- Teacher : <input type = "text" name = "teacher"> <br> -->
<!-- Subject : <input type = "text" name = "subject"> <br> -->
<!-- Schedule : <input type = "text" name = "schedule"> <br> -->

Schedule : <br>
     Day :
	 <select name="days">
	   <c:forEach var = "days" items = "${days}">
	   <option value = "days">${days}</option>
	   </c:forEach> 
	</select> 
	
	 Period :
	 <select name="period">
	   <c:forEach var = "period" items = "${period}">
	   <option value = "period">${period}</option>
	   </c:forEach> 
	</select> <br>
	
</form>




<!-- Schedule : <input type = "text" name = "schedule"> -->
<input type = "submit" value = "Submit">

</form>

</body>
</html>