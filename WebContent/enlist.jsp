<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>O &amp; B University</title>
</head>
<body>
<h1>Enlist in Sections</h1>
<form action="enlist" method="post">

<h2>Who are you?</h2>
<input type="radio" name="studentNumber" value="111">Grady Booch
<input type="radio" name="studentNumber" value="222">James Rumbaugh
<input type="radio" name="studentNumber" value="333">Ivar Jacobson

<h2>Choose Your Sections</h2>
<input type="checkbox" name="sectionNumber" value="AAA111">Math 11 - AAA111
<input type="checkbox" name="sectionNumber" value="BBB222">Math 14 - BBB222
<input type="checkbox" name="sectionNumber" value="CCC333">Math 53 - CCC333

<div>
<input type="submit" value="Submit">
</div>
</form>
</body>
</html>