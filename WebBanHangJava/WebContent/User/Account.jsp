<%@page import="entities.Account"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <%@page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>  	     
    <title>Tiệm của Trang</title>
    <!-- Favicons -->
   
   
    <link href="<c:url value="assets/image/img/logoTittle.png"/>"  rel="icon">
    <link href="<c:url value="assets/image/img/apple-touch-icon.png"/>" rel="apple-touch-icon">

    <!-- Google Fonts -->
    <link href="<c:url value="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Montserrat:300,400,500,700"/>" rel="stylesheet">

    <!-- Vendor CSS Files -->
    <link href="<c:url value="assets/vendor/bootstrap/css/bootstrap.min.css"/>" type="text/css" media="all" rel="stylesheet">
    <link href="<c:url value="assets/vendor/icofont/icofont.min.css"/>" type="text/css" media="all"  rel="stylesheet">
    <link href="<c:url value="assets/vendor/font-awesome/css/font-awesome.min.css"/>" type="text/css" media="all"  rel="stylesheet">
    <link href="<c:url value="assets/vendor/ionicons/css/ionicons.min.css"/>" type="text/css" media="all"  rel="stylesheet">
    <link href="<c:url value="assets/vendor/animate.css/animate.min.css"/>" type="text/css" media="all"  rel="stylesheet">
    <link href="<c:url value="assets/vendor/venobox/venobox.css"/>" type="text/css" media="all"  rel="stylesheet">
    <link href="<c:url value="assets/vendor/owl.carousel/assets/owl.carousel.min.css"/>" type="text/css" media="all" rel="stylesheet">
    <link href="<c:url value="assets/vendor/aos/aos.css"/>" type="text/css" media="all" rel="stylesheet">
    <link rel="stylesheet" href="<c:url value=" assets/Account/assets/bootstrap/css/bootstrap.min.css"/>"media="all"  type="text/css">
    <link rel="stylesheet" href="<c:url value="assets/Account/assets/font-awesome/css/font-awesome.min.css"/>"media="all"  type="text/css">
    <link rel="stylesheet" href="<c:url value="assets/Account/assets/css/animate.css"/>"media="all"  type="text/css">
    <link rel="stylesheet" href="<c:url value="assets/Account/assets/css/style.css"/>" media="all" type="text/css">

    <!-- Template Main CSS File -->
    <link href="<c:url value="./assets/css/style.css"/>" type="text/css" media="all" rel="stylesheet">
</head>

<body>

    <!-- </div> -->
    <!-- ======= Header ======= -->
    <header id="header" class=" ">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-xl-11 d-flex align-items-center">
                    <h1 class="logo mr-auto">
                        <!-- <img src="assets\image\img\Logo.png" style="height: 100px; width: 300px;" class="img-fluid"> -->
                        <a href="home.html">TrangNhỏ</a>
                    </h1>
                    <!-- Uncomment below if you prefer to use an image logo -->


                    <nav class="nav-menu d-none d-lg-block" style="font-size: large;">
                        <ul>
                            <li class="active"><a href="<c:url value="AccountServlet?task=home"/>">Trang chủ</a></li>
                            <li><a href="#about">Giới thiệu</a></li>
                            <li><a href="<c:url value="MenuServlet"/>">Menu</a></li>
                            <li ><a href="<c:url value="ProductServlet?task=Product"/>">Sản phẩm</a>
                                
                            </li>
                            <li><a href="<c:url value="AccountServlet?task=contact"/>">liên hệ</a></li>
                            <li style="padding:0px ;  margin-left: 70px;" class="icon icon_account drop-down">

                                <a href="<c:url value="DetailAccount"/>">
                                    <i class="ion-ios-people-outline" style="font-size: 30px;"></i>
                                </a>
                                <ul>
                                    <li><a href="<c:url value="DetailAccount"/>">Chi tiết</a></li>
                                    <li><a href="#">Đăng Xuất</a></li>
                                </ul>
                            </li>
                            <li style="padding:0px 15px; " class=" icon icon_cart">
                                <a href="<c:url value="CartServlet?action=cart"/>">
                                    <i class="ion-ios-cart-outline" style="font-size: 30px;"></i>
                                </a>

                            </li>

                        </ul>
                    </nav>
                    <!-- .nav-menu -->
                </div>
            </div>

        </div>
    </header>
    <!-- Contact Form -->
    <div class="c-form-container section-container section-bg">
        <div class="container">
            <div class="col-12 row" style="margin: 20px; font-size: large; font-weight: bolder;">
                <div class="col-3">
                    <a href="<c:url value="AccountServlet?task=home"/>"> Trang chủ</a>
                    <span style="width: 3px;  border: 1px solid rgb(146, 236, 169); margin-right: 5px;"></span>
                    <a href="account.html">Tài khoản</a>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2 c-form section-description wow fadeIn">
                    <h1> Chi tiết tài khoản </h1>

                </div>
            </div>

            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 c-form-box wow fadeInUp">
               
					<h3 style="text-align: center; color: red"><%=request.getAttribute("thong bao") %></h3>

                    <div class="c-form-bottom">
                        <form role="form" action="DetailAccount?task=update" method="post" class="signin-form">
                       <% Account acc= (Account)session.getAttribute("acccountHienTai"); %>
                            <div class="form-group">
                                <label for="c-form-name">
		                    			<span class="label-text">Tên đăng nhập</span> 
		                    			<span class="contact-error" ></span>
		                    		</label>
                                <input type="text" name="txtname" placeholder="<%=acc.getUserName()%>" class="c-form-name form-control" id="c-form-name">
                            </div>
                           <div class="form-group">
                                <label for="c-form-name">
		                    			<span class="label-text">Mật khẩu</span> 
		                    			<span class="contact-error" ></span>
		                    		</label>
                                <input type="password" name="txtpassword"  placeholder="Mat khau" class="c-form-name form-control"  id="c-form-name"   >
                                
                            </div>
                           
                             <!-- <div class="form-group">
	              					<input type="password" class="form-control" placeholder="Password" name="txtpass" required>
	             					 <span toggle="#password-field" class="fa fa-fw fa-eye field-icon toggle-password"></span>
	           				 </div>  --> 
                            <div class="form-group">
                                <label for="c-form-email">
		                    			<span class="label-text">Email:</span> 
		                    			<span class="contact-error" ></span>
		                    	</label>
                                <input type="text" name="txtemail" placeholder="<%=acc.getEmail() %>" class="c-form-email form-control" id="c-form-email">
                            </div>
                            <div class="form-group">
                                <label for="c-form-subject">
		                    			<span class="label-text">Sdt</span> 
		                    			<span class="contact-error"></span>
		                    		</label>
                                <input type="text" name="txtsdt"  placeholder="<%=acc.getSdt() %>" class="c-form-subject form-control" id="c-form-subject">
                            </div>
                            
                            <button type="submit" class="btn"> Lưu chỉnh sửa</button>
							
                        </form>
                    </div>

                </div>
            </div>



            <div class="row">
                <div class="col-sm-3 c-form-info-box wow fadeInUp">
                    <div class="c-form-info-box-icon">
                        <i class="fa fa-map-marker"></i>
                    </div>
                    <p>Via Po 10<br>10136 Turin IT</p>
                </div>
                <div class="col-sm-3 c-form-info-box wow fadeInDown">
                    <div class="c-form-info-box-icon">
                        <i class="fa fa-phone"></i>
                    </div>
                    <p>Phone:<br>333 12 68 347</p>
                </div>
                <div class="col-sm-3 c-form-info-box wow fadeInUp">
                    <div class="c-form-info-box-icon">
                        <i class="fa fa-envelope"></i>
                    </div>
                    <p>Email:<br><a href="mailto:contact.azmind@gmail.com">contact.azmind@gmail.com</a></p>
                </div>
                <div class="col-sm-3 c-form-info-box wow fadeInDown">
                    <div class="c-form-info-box-icon">
                        <i class="fa fa-skype"></i>
                    </div>
                    <p>Skype:<br>azmind_online</p>
                </div>
            </div>

        </div>
    </div>

    <!-- Javascript -->
    <script src="<c:url value="assets/Account/assets/js/jquery-1.11.1.min.js"/> type="text/javascript"></script>
    <script src=" <c:url value="assets/Account/assets/bootstrap/js/bootstrap.min.js"/> type="text/javascript"></script>
    <script src=" <c:url value="assets/Account/assets/js/jquery.backstretch.min.js"/> type="text/javascript"></script>
    <script src=" <c:url value="assets/Account/assets/js/wow.min.js"/> type="text/javascript"></script>
    <script src="<c:url value=" assets/Account/assets/js/scripts.js"/> type="text/javascript"></script>

    <script src="<c:url value="assets/vendor/jquery/jquery.min.js "/> type="text/javascript"></script>
    <script src="<c:url value="assets/vendor/bootstrap/js/bootstrap.bundle.min.js "/> type="text/javascript"></script>
    <script src="<c:url value="assets/vendor/jquery.easing/jquery.easing.min.js "/> type="text/javascript"></script>
    <script src="<c:url value="assets/vendor/waypoints/jquery.waypoints.min.js "/> type="text/javascript"></script>
    <script src="<c:url value="assets/vendor/counterup/counterup.min.js "/> type="text/javascript"></script>
    <script src="<c:url value="assets/vendor/isotope-layout/isotope.pkgd.min.js "/> type="text/javascript"></script>
    <script src="<c:url value="assets/vendor/venobox/venobox.min.js "/> type="text/javascript"></script>
    <script src="<c:url value="assets/vendor/owl.carousel/owl.carousel.min.js "/> type="text/javascript"></script>
    <script src="<c:url value="assets/vendor/aos/aos.js "/> type="text/javascript"></script>

    <!-- Template Main JS File -->
    <script src="<c:url value="assets/js/main.js "/> type="text/javascript"></script>

</body>
<footer>
    <div class="footer-top ">
        <div class="container ">
            <div class="row ">
                <div class="col-md-6 col-lg-6 footer-about wow fadeInUp ">
                    <img class="logo-footer " src="./assets/image/img/LLogo.png " style="height: 100px;width: 300px" alt="logo-footer " data-at2x="assets/img/logo.png ">
                    <p>
                        Hãy đến với chúng tôi. Chúng tôi sẽ mang đến cho bạn những gì tuyệt vời nhất
                    </p>
               
                </div>
                <div class="col-md-5 col-lg-5 offset-lg-1 footer-contact wow fadeInDown ">
                    <h3>Liên hệ:</h3>
                    <p><i class="nc-icon nc-favourite-28 "></i> 61/7 Đường 104, Tăng Nhơn Phú A,Q9</p>
                    <p><i class="nc-icon nc-favourite-28  "></i> Phone: 0327248445</p>
                    <p><i class="nc-icon nc-favourite-28  "></i> Email: <a href="mailto:hello@domain.com ">phantrang011220@gmail.com</a></p>
                    <p><i class="nc-icon nc-favourite-28 "></i> Skype: phantrang0112</p>
                </div>
            </div>
        </div>
    </div>

</footer>

</html>