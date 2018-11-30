<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/bootstrap.css" />
<style>
	.jumbotron {
		text-align:center;
	}
</style>
</head>
<body>

	<div class="jumbotron">
		<h1>${list.bTitle}</h1>
		<p>${list.bContent}</p>
		<p>
			<a class="btn btn-primary btn-lg" href="list" role="button">목록</a>
		</p>
	</div>

	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>