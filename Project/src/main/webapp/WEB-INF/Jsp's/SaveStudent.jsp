<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>save</title>
</head>
<body>
	<form action="SaveStudentData" method="post">
		<pre>
			ID    <input type="number" name="id"/>
			Code  <input type="text" name="code"/>
			Name  <input type="text" name="name"/>
			Type  
			Urban <input type="radio" name="type" value="urban"/>
			Rural <input type="radio" name="type" value="rural"/>
`			<input type="submit" value="save"/>
		</pre>
	</form>
</body>
</html>