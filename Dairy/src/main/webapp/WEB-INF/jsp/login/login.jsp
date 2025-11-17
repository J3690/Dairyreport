<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ログイン</title>
	</head>

	<body>
		<h2>ログイン</h2>
		<form action="../../login" method="post">
			User ID : <input type="text" name="userid"> <br>
			Password : <input type="password" name="password"> <br>
			<input type="submit" value="ログイン">
		</form>
		
		<% String err = (String)request.getAttribute("error"); %>
		<% if(err != null) { %>
			<p style="color:red;"> <%= err %> </p>
		<% }  %>
		
		<form action="../password/passwordCheck.jsp">
			<button type="submit"> パスワード変更 </button>
		</form>
		
		<a href="../register/registerInput.jsp"> 新規登録はこちら </a>
	</body>
</html>