<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>完了画面</title>
	</head>
	
	<body>
	<h2>完了画面</h2>
	
	<p style="color:red;">
		<%= request.getSttribute("message") == null ? "処理が完了しました" : request.getAttribute("error") %>
	</p>
	
	<form action="login.jsp" method="get">
		<input type="submit" value="ログイン画面に戻る">
	</form>
	</body>
</html>