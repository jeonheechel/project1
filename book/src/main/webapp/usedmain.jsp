<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>중고 거래 페이지 상품등록</title>
		<link rel="stylesheet" href="resources/css/used.css">

	</head>
	<body>
	<div id="roof">
	<form action="insert.do">
	<div class="idname">
		 도서명 <input type="text" name="booktitle" value="도서명" class="id"><br>
	</div>
	<div class="idname1">
		 부가설명(내용)<input type="text" name="bookcontent" value="부가설명(내용)" class="id1"><br>
	</div>
	<div class="idname2">
		 상품장르<input type="text" name="bookgenre" value="상품장르" class="id2"><br>
	</div>
	<div class="idname3">
		 저자(지은이)<input type="text" name="bookauthor" value="저자(지은이)" class="id3"><br>
	</div>
	<div class="idname4">
		 가격<input type="text" name="bookprice" value="가격" class="id4"><br>
	</div>
		 <hr>
	<div class="idname5">
		 판매자<input type="text" name="bookuser" value="판매자(선택사항)" class="id5"><br>
	</div>
	<div class="idname6">
		 연락처<input type="text" name="booktel" value="연락처(선택사항)" class="id6"><br>
	</div>
	<div class="idname7">
		 주소<input type="text" name="bookaddr" value="주소(선택사항)" class="id7"><br>
	</div>
		 
		 
		 
		<button type="submit" value="중고 책 등록" class="id8" >중고 책 등록</button>
		
	</form>
	</div>
	</body>
</html>