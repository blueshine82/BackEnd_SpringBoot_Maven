<!-- 최초 프로젝트 생성시 src/main 폴더구조만 존재하고, webapp/WEB-INF/views 폴더 구조는 모두 생성이 필요하여 생성하였습니다. -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 아래의 c:forEach 코드를 사용하기 위해서 아래와 같이 taglib 내용을 추가해야 사용가능 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<!-- <meta charset="UTF-8"> -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Views Test Page</title>
</head>
<body>
	<h2>Test! ${name}</h2>
	<div>JSP List Test</div>
	<c:forEach var="item" items="${list}" varStatus="idx">
	${idx.index}, ${item} <br/>
	</c:forEach>
</body>
</html>