<%@page import="java.util.List"%>
<%@page import="com.seohyang.book.UsedDTO"%>
<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 12345647498

	<%
		List<UsedDTO> list = (List<UsedDTO>)request.getAttribute("list");
		for(UsedDTO dto : list) {
	%>
		<%=dto.getBooktitle() %>
		<%=dto.getBookcontent() %>
	
	
	<%
	} 
	%> --%>




 <c:forEach var = "dto" items="${list }">
<hr>
TITLE : ${dto.booktitle } <br>
CONTENT : ${dto.bookcontent } <br>
GENRE : ${dto.bookgenre } <br>
AUTHOR : ${dto.bookauthor } <br>
PRICE : ${dto.bookprice } <br>
USER : ${dto.bookuser } <br>
TEL : ${dto.booktel } <br>
ADDR : ${dto.bookaddr } <br>
 


</c:forEach> 

</body>
</html>