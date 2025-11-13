<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<h2>登録内容確認</h2>
		
		<%
			User user = (User) request.getAttribute("user");
			if(user != null) {
		%>
		
		<p> UserID : <%= user.getUserId() %> </p>
		<p> Password : <%= user.getPassword() %> </p>
		<p> UserName : <%= user.getUserName() %> </p>
		<p> 入力した内容で間違いない場合は、登録を押してください</p>
		
		<form action="RegisterConfirmServlet" method="post">
			<input type="hidden" name="userid" value="<%= user.getUserId() %>">
			<input type="hidden" name="pass" vallue="<%= user.getPassword() %>">
			<input type="hidden" name="name" value="<%= user.getUserName() %>">
			<input type="submit" value="登録">
		</form>
		
		<form action="register.jsp" method="get">
			<input type="submit" value="戻る">
		</form>
		
		<%
			}
		%>
	</body>
</html>