<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/bootstrap.css" />
<title>게시판 리스트</title>
</head>
<body>
	
	<div class="container">
		<table class="table table-hover">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성일</th>
				<th>수정일</th>
				<th>조회수</th>
				<th>수정하기</th>
				<th>삭제하기</th>
			</tr>
			<c:forEach items="${list}" var="list">
				<tr>
					<td>${list.bId}</td>
					<td><a href="content_view?bId=${list.bId}">${list.bTitle}</a></td>
					<td><%-- ${list.bDate} --%> <fmt:formatDate value="${list.bDate}" pattern="yyyy-MM-dd HH:mm"/></td>
					<td><%-- ${list.bModify_Date} --%> <fmt:formatDate value="${list.bModify_Date}" pattern="yyyy-MM-dd HH:mm"/></td>
					<td>${list.bHit}</td>
					<td><a href="update_view?bId=${list.bId}" class="btn btn-default" role="button">수정하기</a></td>
					<td><a href="delete?bId=${list.bId}" class="btn btn-default" role="button">삭제하기</a></td>
				</tr>
			</c:forEach>
		</table>
		<a href="write_view" class="btn btn-default" role="button">글쓰기</a>
	</div>
	<br />
	<form action="search">
		<input type="text" name="sname" />
		<input type="submit" value="검색" />
	</form>
	
	<c:forEach items="${s}" var="s">
		${s.bTitle}
		${s.bContent}
	</c:forEach>
	
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
	
</body>
</html>