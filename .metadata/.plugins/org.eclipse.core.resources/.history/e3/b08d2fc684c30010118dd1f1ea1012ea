<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>エラー</title>
	</head>

	<body>
		<h2>エラーが発生しました</h2>
		
		<p style="color:red;">
			<%= request.getAttribute("error") == null ? "予期せぬエラーが発生しました" : request.getAttribute("error") %>
		</p>
		
		<form action="login.jsp" method="get">
			<input type="submit" value="ログイン画面に戻る">
		</form>
	</body>
</html>