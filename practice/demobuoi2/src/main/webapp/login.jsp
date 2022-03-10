<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
background-image: url("https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Yasuo_36.jpg");
}
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
<div class="row">
<div class="col-3"></div>
<div class="col-6">
<form action="/demobuoi2/loginServlet" method="POST" class="form-control bg-dark">
<label for="username">Email</label>
<input type="text" name="username" placeholder="email@example.com" class="form-control" id="username"/>
<label for="passwd">Password</label>
<input type="password" name="passwd" class="form-control" id="passwd"/><br>
<button class="btn btn-primary">Đăng nhập</button>
<small class="text-danger">${success}</small>
</form>
</div>
</div>
</div>
</body>
</html>