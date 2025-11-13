<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
	<h2>処理完了</h2>
	
	<p style="color:green;">
		<%= request.getAttribute("message") == null ? "処理が完了しました" : request.getAttribute("message") %>
	</p>
	
	<form action="login.jsp" method="get">
		<input type="submit" value="ログイン画面に戻る">
	</form>
	</body>
</html>