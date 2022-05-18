<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<%@include file="../include/header.jsp"%>
	<h1>게시물 조회</h1>

	<form role="form" method="post">
		<div>
			<input type="hidden" name="bno" value="${boardVO.bno}" readonly>
	
			<label>제목</label>
			<input type="text" name="title"	value="${boardVO.title}" readonly>
		</div>
		
		<div>
			<label>내용</label>
			<textarea type="text" name="content" readonly>${boardVO.content}</textarea>
		</div>
		
		<div>
			<label>글쓴이</label> 
			<input type="text" name="title" value="${boardVO.writer}" readonly>
		</div>
	</form>
	
	<button type="submit" class="modify">수정</button>
	<button type="submit" class="delete">삭제</button>
	<button type="submit" class="listall">목록보기</button>
	
	<script>
		window.addEventListener("DOMContentLoaded", () => {
			const form = document.querySelector("form")
			const btnModify = document.querySelector(".modify")
			const btnRemove = document.querySelector(".delete")
			const btnListAll = document.querySelector(".listall")
			
			console.log(form)
			
			btnModify.addEventListener('click', () => {
				form.action = "/board/modify"
				form.method = "get"
				form.submit()
			})
			
			btnRemove.addEventListener('click', () => {
				form.action = "/board/remove"
				form.method = "get"
				form.submit()
			})
			
			btnListAll.addEventListener('click', () => {
				location.href = "/board/listAll"
			})
		})
	</script>

	<%@include file="../include/footer.jsp"%>
</body>
</html>
