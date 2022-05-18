<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<%@include file="../include/header.jsp"%>
	<h1>게시물 등록</h1>

	<form role="form" method="post">
		<div>
			<label>제목</label>
			 <input type="text" name="title">
		</div>

		<div>
			<label>내용</label>
			<textarea name="content" rows="3"></textarea>
		</div>

		<div>
			<label>글쓴이</label>
			 <input type="text" name="writer">
		</div>
		<div>
			<button type="submit">Submit</button>
		</div>
	</form>

	<%@include file="../include/footer.jsp"%>
</body>
</html>
