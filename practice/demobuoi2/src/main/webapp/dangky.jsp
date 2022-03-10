<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<style type="text/css">
body{
background-image: url("https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Yasuo_36.jpg");
}
</style>
</head>
<body>
  <div class="container">
  <div class="row">
  <div class="col-3"></div>
  <div class="col-6">
  <form action="/demobuoi2/dangky" method="POST" class="form-control">
  <div class="mb-3 row">
    <label for="staticEmail" class="col-sm-2 col-form-label ">Email</label>
    <div class="col-sm-10">
      <input type="email" class="form-control" name="email">
    </div>
  </div>
  <div class="mb-3 row">
    <label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="inputPassword" name="passwd">
    </div>
  </div>
  <div class="mb-3 row">
    <label for="staticEmail" class="col-sm-2 col-form-label">SDT</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="sdt">
    </div>
  </div>
  <div class="form-check">
  <input class="form-check-input" type="radio" name="gt" id="flexRadioDefault1" value="nam">
  <label class="form-check-label" for="flexRadioDefault1">
   Nam
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" name="gt" id="flexRadioDefault2" checked value="nu">
  <label class="form-check-label" for="flexRadioDefault2">
    Nữ
  </label>
</div>
<button class="btn btn-primary">Đăng ký</button>
<small class="text-danger">${success}</small>
  </form>
  </div>
  </div>
  </div>
</body>
</html>