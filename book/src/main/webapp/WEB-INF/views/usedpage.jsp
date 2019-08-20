<%@page import="com.seohyang.book.UsedDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록 출력!</title>
</head>
<body>


	<c:forEach var="dto" items="${list }">
		<hr>
		TITLE : ${dto.booktitle } 
		WRITER : ${dto.bookcontent }

	</c:forEach>









</body>
</html>