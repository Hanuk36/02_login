<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>결과보기</h2>
	<h3>
		<ul>
			<li>올린사람 : ${name}</li>
			<li>파일이름 : ${f_name}</li>
			<li>파일타입 : ${contentType}</li>
			<!-- KB-MB-GB-TB -->
			<li>파일크기 : <fmt:formatNumber type="number" pattern="#,###" value="${f_size/1024}"/> KB</li>
			<li>마지막수정날짜 : ${f_last2}</li>
			<li><img src="upload/${f_name}"></li>
			
			<!-- 다운로드 누르면 jsp 를 통해서 이미지 down.jsp 에 다운로드 하겠다. -->
			<!-- 다운로드가 되도 실제로 이미지가 보이지 않는다. -->
			<!-- 바이트스트림 써야된다. 이제부터 그 코딩한다. -->
			<li>다운로드 : <a href="view/fileup_down/down.jsp?path=upload&f_name=${f_name}"><b>${f_name}</b></a></li>
		</ul>
	</h3>
</body>
</html>