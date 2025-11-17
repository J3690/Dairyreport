<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>登録内容確認</title>
	</head>
	<body>
		<h2>登録内容確認</h2>
		
		<%
			User user = (User) request.getAttribute("user");
			if(user != null) {
		%>
		
		<p> User ID : <%= user.getUserId() %> </p>
		<p> Password : <%= user.getPassword() %> </p>
		<p> User Name : <%= user.getUserName() %> </p>
		
		<form action="RegisterConfirmServlet" method="post">
			<input type="hidden" name="userid" value="<%= user.getUserId() %>">
			<input type="hidden" name="password" value="<%= user.getPassword() %>">
			<input type="hidden" name="username" value="<%= user.getUserName() %>">
		</form>
		
		<form action="register.jsp" method="get">
			<input type="submit" value="戻る">
		</form>
		
		<%
			}
		%>

	</body>
</html>