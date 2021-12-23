
<%@page import="model_User.ProductTypeModel"%>
<%@page import="model_User.ProductModel"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
 <%@page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tiệm của Trang</title>
    <!-- Favicons -->
    <link href="assets/image/img/logoTittle.png" rel="icon">
    <link href="assets/image/img/apple-touch-icon.png" rel="apple-touch-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Montserrat:300,400,500,700" rel="stylesheet">

    <!-- Vendor CSS Files -->
    <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/vendor/icofont/icofont.min.css" rel="stylesheet">
    <link href="assets/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="assets/vendor/ionicons/css/ionicons.min.css" rel="stylesheet">
    <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
    <link href="assets/vendor/venobox/venobox.css" rel="stylesheet">
    <link href="assets/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="assets/vendor/aos/aos.css" rel="stylesheet">

    <!-- Template Main CSS File -->
    <link href="./assets/css/style.css" rel="stylesheet">
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
                            <li ><a href="<c:url value="ProductServlet?task=Product"/>">Sản phẩm</a></li>
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

    <!-- ======= Portfolio Section ======= -->
    <main id="main">
        <section id="portfolio" class="section-bg">
            <div class="container" data-aos="fade-up">
            <form action="ProductServlet?task=Search" method="post"">
                <div class="col-12 row">
                    <div class="col-3">
                        <a href="<c:url value="AccountServlet?task=home"/>"> Trang chủ</a>
                        <span style="width: 3px;  border: 1px solid white; margin-right: 5px;"></span>
                        <a href="<c:url value="ProductServlet?task=Product"/>">Sản phẩm</a>
                    </div>
                     <div class="col-8">
                    
                        <div class="p-1 bg-light rounded rounded-pill shadow-sm mb-4">
                        
                            <div class="input-group">
                                <input type="search" placeholder="Nhập sản phẩm bạn cần tìm?" name="txtSearch" aria-describedby="button-addon1" class="form-control border-0 bg-light">
                                <div class="input-group-append">
                                    <button id="button-addon1" type="submit" class="btn btn-link text-primary"><i class="fa fa-search"></i></button>
                                </div>
                            </div>
                            
                           
                        </div>
                    </div>
                    
                </div>
                <h5 style="text-align: center; color: red"><%=request.getAttribute("thong bao") %></h5>
                <header class="section-header">
                    <h3 class="section-title">Sản phẩm</h3>
                    
                </header>
                </form>
                 
                <div class="row" data-aos="fade-up" data-aos-delay="100">
                    <div class=" col-12 ">
                        <ul id="portfolio-flters">
                         	
                            <li data-filter="* " class="filter-active ">All</li>
                           
							<c:forEach var="a" items="${productType }">
                            	<li data-filter=".filter-${a.filter }">${a.tenLoai}</li>
                            </c:forEach>
                        
                        </ul>
                    </div>
                </div>

                <div class="row portfolio-container " data-aos="fade-up " data-aos-delay="200 ">
                	
					<c:forEach var="p" items="${product}">
	                    <div class="col-lg-4 col-md-6 portfolio-item filter-${p.filter }">
	                        <div class="portfolio-wrap ">
	                            <figure>
	                                <img src="assets/image/img/${p.product.hinhSP }" class="img-fluid " alt=" ">
	                                <a href="CartServlet?action=add&idSP=${p.product.idSP}"><button data-gall="portfolioGallery "  title="Web 3 " type="button" class="btn link-preview btn btn-success btn-lg  ">Thêm vào giỏ hàng</button></a>
	                            </figure>
	
	                            <div class="portfolio-info ">
	                                <h4><a href="portfolio-details.html ">${p.product.tenSP}</a></h4>
	                                <p style="color:rgb(3, 180, 97);">${p.product.gia}</p>
	                            </div>
	                        </div>
	                    </div>	                  
					</c:forEach>

                </div>

            </div>
        </section>
    </main>
    <!-- End Portfolio Section -->
    <script src="assets/vendor/jquery/jquery.min.js "></script>
    <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js "></script>
    <script src="assets/vendor/jquery.easing/jquery.easing.min.js "></script>
    <script src="assets/vendor/waypoints/jquery.waypoints.min.js "></script>
    <script src="assets/vendor/counterup/counterup.min.js "></script>
    <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js "></script>
    <script src="assets/vendor/venobox/venobox.min.js "></script>
    <script src="assets/vendor/owl.carousel/owl.carousel.min.js "></script>
    <script src="assets/vendor/aos/aos.js "></script>

    <!-- Template Main JS File -->
    <script src="assets/js/main.js "></script>

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