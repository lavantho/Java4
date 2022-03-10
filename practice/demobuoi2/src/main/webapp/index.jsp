<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/demobuoi2/DemoServlet" method="get">
<label>Họ tên</label>
<input type="text" name="name">
<button>Gửi</button>
<h2>Hello ${name }</h2>
</form>
</body>
</html>