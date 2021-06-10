
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <%@page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Tiệm của Trang</title>
    <!-- Favicons -->
   
   
 <link href="assets/image/img/logoTittle.png" rel="icon">
    <link href="assets/image/img/apple-touch-icon.png" rel="apple-touch-icon">
   <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<link rel="stylesheet" href="css/style.css">
</head>
<!--  <body>
	<p>hi trang</p>

	<h1>Dang Nhap</h1>
	
	<form action="AccountServlet?task=login" method="post">
	<p><%if(request.getAttribute("thong bao")==null){
	%><p>Hay dang nhap</p>
	<%}
	else{%><p>Sai mat khau hoac ten dang nhap</p><%}%></p>
	
	
		<label for="fname">First name:</label><br> 
		<input type="text"id="fname" name="txtname" value="John"><br> 
		<label for="lname">Last name:</label><br> 
		<input type="text" id="lname"name="txtpass" value="Doe"><br>
		 <br> <input type="submit" value="login">
	</form>
</body>-->
<body class="img js-fullheight" style="background-image: url(images/bg.jpg);">
	<section class="ftco-section">
		<div class="container">
			
			<div class="row justify-content-center">
				<div class="col-md-6 col-lg-4">
					<div class="login-wrap p-0">
		      	<h3 class="mb-4 text-center">Tiệm của Trang</h3>
		      	
		      	<form action="AccountServlet?task=login" method="post" class="signin-form">
		      		<div class="form-group">
		      			<input type="text" class="form-control" placeholder="Tên đăng nhập"  name="txtname" required>
		      		</div>
		            <div class="form-group">
		              <input id="password-field" type="password" class="form-control" placeholder="Mật khẩu" name="txtpass" required>
		              <span toggle="#password-field" class="fa fa-fw fa-eye field-icon toggle-password"></span>
		            </div>
		            <div class="form-group">
		            	<button type="submit" class="form-control btn btn-primary submit px-3" value="login">Đăng Nhập</button>
		            </div>
	            <div class="form-group d-md-flex">
	            	<div class="w-50">
		            	<label class="checkbox-wrap checkbox-primary">Nhớ mật khẩu
									  <input type="checkbox" checked>
									  <span class="checkmark"></span>
									</label>
								</div>
								<div class="w-50 text-md-right">
									<a href="<c:url value="AccountServlet?task=DangKi"/>" style="color: #fff">Đăng ký</a>
									
								</div>
	            </div>
	          </form>
	          <p class="w-100 text-center">&mdash;Đăng nhập băng &mdash;</p>
	          <div class="social d-flex text-center">
	          	<a href="#" class="px-2 py-2 mr-md-1 rounded"><span class="ion-logo-facebook mr-2"></span> Facebook</a>
	          	<a href="#" class="px-2 py-2 ml-md-1 rounded"><span class="ion-logo-twitter mr-2"></span> Twitter</a>
	          </div>
		      </div>
				</div>
			</div>
		</div>
	</section>

	<script src="js/jquery.min.js"></script>
  <script src="js/popper.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/main.js"></script>

	</body>

</html>