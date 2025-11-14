<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>パスワード変更</title>
	</head>
	
	<body>
		<h2>パスワード変更(本人確認)</h2>
		
		<form action="ChangePasswordServlet" method="post">
		<!-- ChangePasswordServlet の post メソッドに処理が渡る -->
			User ID : <input type="text" name="userid"> <br> <!-- 入力 -->
			User Name : <input type="text" name="username"> <br>
			<input type="submit" value="次へ">
		</form>
		
		<form action="login.jsp" method="get">
			<input type="submit" value="ログイン画面に戻る">
		</form>
		
		<p style="color:red;">
			<%= request.getAttribute("error") == null ? "" : request.getAttribute("error") %>
		</p>
	</body>
</html>