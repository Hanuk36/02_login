<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/02_login/Guest" method="post" enctype="multipart/form-data">
 		<p>올린사람 : <input type="text" name="name"></p>
 		<p>첨부파일 : <input type="file" name="f_name"></p>
 		<input type="submit" value="업로드">
 	</form>
</body>
</html>