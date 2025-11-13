<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<h2>ログイン</h2>
		<form action="LoginServlet" method="post">
			UserID : <input type="text" name="userid"> <br>
			Password : <input type="password" name="pass"> <br>
			<input type="submit" value="login">
		</form>
		
		<p>
			<%= request.getAttribute("error") == null ? "" : request.getAttribute("error") %>
		</p>
	</body>
</html>