<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>新規ユーザー登録</title>
	</head>

	<body>
		<h2>新規ユーザー登録</h2>
		<form action="RegisterServlet" method="post">
			UserID : <input type="text" name="userid"> <br>
			Password : <input type="password" name="pass"> <br>
			UserName : <input type="text" name="name"> <br>
			
			<input type="submit" value="確認画面へ">
		</form>
		
		<form action="login.jsp" method="get">
			<input type="submit" value="ログイン画面に戻る">
		</form>
		
		<p style="color:red;">
			<%= request.getAttribute("error") == null ? "" : request.getAttribute("error") %>
		</p>
	</body>
</html>