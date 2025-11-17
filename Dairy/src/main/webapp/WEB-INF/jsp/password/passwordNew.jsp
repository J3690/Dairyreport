<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<form action="../../password" method="post">
			<input type="hidden" name="action" value="update">
			<input type="hidden" name="userid" value="<%= request.getAttribute("userid") %>">
			
			新しいパスワード : <input type="password" name="password"> <br>
			<input type="submit" value="更新">
		</form>
	</body>
</html>