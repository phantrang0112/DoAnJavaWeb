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
    <header id="header" class="fixed-top header-transparent">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-xl-11 d-flex align-items-center">
                    <h1 class="logo mr-auto">
                        <!-- <img src="assets\image\img\Logo.png" style="height: 100px; width: 300px;" class="img-fluid"> -->
                        <a href="<c:url value="AccountServlet?task=home"/>">TrangNhỏ</a>
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
                                    <li><a href="<c:url value="Home.jsp"/>">Đăng Xuất</a></li>
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
    <!-- ======= Intro Section ======= -->
    <section id="intro">
        <div class="intro-container">
            <div id="introCarousel" class="carousel  slide carousel-fade" data-ride="carousel">

                <ol class="carousel-indicators"></ol>

                <div class="carousel-inner" role="listbox">

                    <div class="carousel-item active" style="background-image: url(assets/image/img/intro-carousel/1.jpg)">
                        <div class="carousel-container">
                            <div class="container">
                                <h2 class="animate__animated animate__fadeInDown">Chào mừng bạn đến với Tiệm Của Trang</h2>

                                <a href="<c:url value="AccountServlet?task=home"/>" class="btn-get-started scrollto animate__animated animate__fadeInUp">Hãy bắt đầu </a>
                            </div>
                        </div>
                    </div>

                    <div class="carousel-item" style="background-image: url(assets/image/img/intro-carousel/2.jpg)">
                        <div class="carousel-container">
                            <div class="container">
                                <h2 class="animate__animated animate__fadeInDown">Chào mừng bạn đến với Tiệm Của Trang</h2>

                                <a href="<c:url value="AccountServlet?task=home"/>" class="btn-get-started scrollto animate__animated animate__fadeInUp">Hãy bắt đầu </a>
                            </div>
                        </div>
                    </div>

                    <div class="carousel-item" style="background-image: url(assets/image/img/intro-carousel/3.jpg)">
                        <div class="carousel-container">
                            <div class="container">
                               <h2 class="animate__animated animate__fadeInDown">Chào mừng bạn đến với Tiệm Của Trang</h2>

                                <a href="<c:url value="AccountServlet?task=home"/>" class="btn-get-started scrollto animate__animated animate__fadeInUp">Hãy bắt đầu </a>
                           </div>
                        </div>
                    </div>

                    <div class="carousel-item" style="background-image: url(assets/image/img/intro-carousel/4.jpg)">
                        <div class="carousel-container">
                            <div class="container">
                               <h2 class="animate__animated animate__fadeInDown">Chào mừng bạn đến với Tiệm Của Trang</h2>

                                <a href="<c:url value="AccountServlet?task=home"/>" class="btn-get-started scrollto animate__animated animate__fadeInUp">Hãy bắt đầu </a>
                           </div>
                        </div>
                    </div>

                    <div class="carousel-item" style="background-image: url(assets/image/img/intro-carousel/5.jpg)">
                        <div class="carousel-container">
                            <div class="container">
                               <h2 class="animate__animated animate__fadeInDown">Chào mừng bạn đến với Tiệm Của Trang</h2>

                                <a href="<c:url value="AccountServlet?task=home"/>" class="btn-get-started scrollto animate__animated animate__fadeInUp">Hãy bắt đầu </a>
                           </div>
                        </div>
                    </div>

                </div>

                <a class="carousel-control-prev" href="#introCarousel" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon ion-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>

                <a class="carousel-control-next" href="#introCarousel" role="button" data-slide="next">
                    <span class="carousel-control-next-icon ion-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>

            </div>
        </div>
    </section>
    <!-- End Intro Section -->
    <!-- ===section menu card====-->
    <section id="card_group" class="container " style="color: black;">
        <div style="text-align: center;">
            <h1>Danh mục sản phẩm(nhớ thêm hình vô loại nha trang)</h1>
            <h2>bánh ngọt/kẹo/mứt/trà hoa quả</h2>
        </div>
        <div class="card-deck" style="text-align: center;">
            <div class="card loaiSp">
                <img class="card-img-top img-fluid" src="./assets/image/img/LoaiSp/1.jpg" style="height: 276px;" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Kẹo</h5>

                </div>
                <div class="card-footer">
                    <small class="text-muted">Last updated 3 mins ago</small>
                </div>
            </div>
            <div class="card loaiSp">
                <img class="card-img-top img-fluid" src="./assets/image/img/LoaiSp/5.jpg" style="height: 276px;" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Trà trái cây</h5>

                </div>
                <div class="card-footer">
                    <small class="text-muted">Last updated 3 mins ago</small>
                </div>
            </div>
            <div class="card">
                <a href="home.html" style="color: black;">
                    <img class="card-img-top img-fluid" href="home.html" style="height: 276px;" src="./assets/image/img/LoaiSp/Article121-635876995046793593.jpg" alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">Mứt</h5>

                    </div>
                    <div class="card-footer">
                        <small class="text-muted">Last updated 3 mins ago</small>
                    </div>
                </a>
            </div>
            <div class="card">
                <img class="card-img-top" style="height: 276px;" src="./assets/image/img/6.jpg" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Bánh ngọt</h5>

                </div>
                <div class="card-footer">
                    <small class="text-muted">Last updated 3 mins ago</small>
                </div>
            </div>
        </div>
    </section>
    <!-- ======= About Us Section ======= -->
    <section id="about">
        <div class="container" data-aos="fade-up">

            <header class="section-header">
                <h3>Tại sao chọn chúng tôi</h3>
                <p>.</p>
            </header>

            <div class="row about-cols">

                <div class="col-md-4" data-aos="fade-up" data-aos-delay="100">
                    <div class="about-col">
                        <div class="img">
                            <img src="./assets/image/img/LoaiSp/1.jpg" alt="" class="img-fluid">
                            <div class="icon"><i class="ion-ios-heart-outline"></i></div>
                        </div>
                        <h2 class="title"><a href="#">Giá cả phải chăng</a></h2>
                        <p>
                            Ở mức giá vừa phải bạn có thể mua được sản phẩm có chất lượng cao
                        </p>
                    </div>
                </div>

                <div class="col-md-4" data-aos="fade-up" data-aos-delay="200">
                    <div class="about-col">
                        <div class="img">
                            <img src="./assets/image/img/LoaiSp/1.jpg" alt="" class="img-fluid">
                            <div class="icon"><i class="ion-ios-heart-outline"></i></div>
                        </div>
                        <h2 class="title"><a href="#">Hương vị tuyệt hảo</a></h2>
                        <p>
                            Tất cả các sản phẩm đều được lựa chọn cẩn thận dựa trên sự hài lòng của người dùng

                        </p>
                    </div>
                </div>

                <div class="col-md-4" data-aos="fade-up" data-aos-delay="300">
                    <div class="about-col">
                        <div class="img">
                            <img src="./assets/image/img/LoaiSp/1.jpg" alt="" class="img-fluid">
                            <div class="icon"><i class="ion-ios-heart-outline"></i></div>
                        </div>
                        <h2 class="title"><a href="#"> Sản phẩm chất lượng</a></h2>
                        <p>
                            Cam kết chỉ cung cấp sản phẩm có nguồn gốc được kiểm soát chất lượng.
                        </p>
                    </div>
                </div>

            </div>

        </div>
    </section>
    <!-- End About Us Section -->
    <!-- ======= Portfolio Section ======= -->
    <main id="main">
        <section id="portfolio" class="section-bg">
            <div class="container" data-aos="fade-up">

                <header class="section-header">
                    <h3 class="section-title">Sản phẩm nổi bật</h3>
                </header>
                <div class="row" data-aos="fade-up" data-aos-delay="100">
                    <div class=" col-12 ">
                        <ul id="portfolio-flters">
                            <li data-filter="* " class="filter-active ">Kẹo</li>
                            <li data-filter=".filter-tra">Trà</li>
                            <li data-filter=".filter-card ">Mứt</li>
                            <li data-filter=".filter-web ">Bánh</li>
                        </ul>
                    </div>
                </div>

                <div class="row portfolio-container " data-aos="fade-up " data-aos-delay="200 ">

                    <div class="col-lg-4 col-md-6 portfolio-item filter-tra">
                        <div class="portfolio-wrap ">
                            <figure>
                                <img src="assets/img/portfolio/app1.jpg " class="img-fluid " alt=" ">
                                <a href="assets/img/portfolio/app1.jpg " data-lightbox="portfolio " data-title="App 1 " class="link-preview "><i class="ion ion-eye "></i></a>
                                <a href="portfolio-details.html " class="link-details " title="More Details "><i class="ion ion-android-open "></i></a>
                            </figure>

                            <div class="portfolio-info ">
                                <h4><a href="portfolio-details.html ">App 1</a></h4>
                                <p>App</p>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-4 col-md-6 portfolio-item filter-web ">
                        <div class="portfolio-wrap ">
                            <figure>
                                <img src="assets/img/portfolio/web3.jpg " class="img-fluid " alt=" ">
                                <a href="assets/img/portfolio/web3.jpg " class="link-preview venobox " data-gall="portfolioGallery " title="Web 3 "><i class="ion ion-eye "></i></a>
                                <a href="portfolio-details.html " class="link-details " title="More Details "><i class="ion ion-android-open "></i></a>
                            </figure>

                            <div class="portfolio-info ">
                                <h4><a href="portfolio-details.html ">Web 3</a></h4>
                                <p>Web</p>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-4 col-md-6 portfolio-item filter-tra">
                        <div class="portfolio-wrap ">
                            <figure>
                                <img src="assets/img/portfolio/app2.jpg " class="img-fluid " alt=" ">
                                <a href="assets/img/portfolio/app2.jpg " class="link-preview venobox " data-gall="portfolioGallery " title="App 2 "><i class="ion ion-eye "></i></a>
                                <a href="portfolio-details.html " class="link-details " title="More Details "><i class="ion ion-android-open "></i></a>
                            </figure>

                            <div class="portfolio-info ">
                                <h4><a href="portfolio-details.html ">App 2</a></h4>
                                <p>App</p>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-4 col-md-6 portfolio-item filter-card ">
                        <div class="portfolio-wrap ">
                            <figure>
                                <img src="assets/img/portfolio/card2.jpg " class="img-fluid " alt=" ">
                                <a href="assets/img/portfolio/card2.jpg " class="link-preview venobox " data-gall="portfolioGallery " title="Card 2 "><i class="ion ion-eye "></i></a>
                                <a href="portfolio-details.html " class="link-details " title="More Details "><i class="ion ion-android-open "></i></a>
                            </figure>

                            <div class="portfolio-info ">
                                <h4><a href="portfolio-details.html ">Card 2</a></h4>
                                <p>Card</p>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-4 col-md-6 portfolio-item filter-web ">
                        <div class="portfolio-wrap ">
                            <figure>
                                <img src="assets/img/portfolio/web2.jpg " class="img-fluid " alt=" ">
                                <a href="assets/img/portfolio/web2.jpg " class="link-preview venobox " data-gall="portfolioGallery " title="Web 2 "><i class="ion ion-eye "></i></a>
                                <a href="portfolio-details.html " class="link-details " title="More Details "><i class="ion ion-android-open "></i></a>
                            </figure>

                            <div class="portfolio-info ">
                                <h4><a href="portfolio-details.html ">Web 2</a></h4>
                                <p>Web</p>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-4 col-md-6 portfolio-item filter-tra">
                        <div class="portfolio-wrap ">
                            <figure>
                                <img src="assets/img/portfolio/app3.jpg " class="img-fluid " alt=" ">
                                <a href="assets/img/portfolio/app3.jpg " class="link-preview venobox " data-gall="portfolioGallery " title="App 3 "><i class="ion ion-eye "></i></a>
                                <a href="portfolio-details.html " class="link-details " title="More Details "><i class="ion ion-android-open "></i></a>
                            </figure>

                            <div class="portfolio-info ">
                                <h4><a href="portfolio-details.html ">App 3</a></h4>
                                <p>App</p>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-4 col-md-6 portfolio-item filter-card ">
                        <div class="portfolio-wrap ">
                            <figure>
                                <img src="assets/img/portfolio/card1.jpg " class="img-fluid " alt=" ">
                                <a href="assets/img/portfolio/card1.jpg " class="link-preview venobox " data-gall="portfolioGallery " title="Card 1 "><i class="ion ion-eye "></i></a>
                                <a href="portfolio-details.html " class="link-details " title="More Details "><i class="ion ion-android-open "></i></a>
                            </figure>

                            <div class="portfolio-info ">
                                <h4><a href="portfolio-details.html ">Card 1</a></h4>
                                <p>Card</p>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-4 col-md-6 portfolio-item filter-card ">
                        <div class="portfolio-wrap ">
                            <figure>
                                <img src="assets/img/portfolio/card3.jpg " class="img-fluid " alt=" ">
                                <a href="assets/img/portfolio/card3.jpg " class="link-preview venobox " data-gall="portfolioGallery " title="Card 3 "><i class="ion ion-eye "></i></a>
                                <a href="portfolio-details.html " class="link-details " title="More Details "><i class="ion ion-android-open "></i></a>
                            </figure>

                            <div class="portfolio-info ">
                                <h4><a href="portfolio-details.html ">Card 3</a></h4>
                                <p>Card</p>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-4 col-md-6 portfolio-item filter-web ">
                        <div class="portfolio-wrap ">
                            <figure>
                                <img src="assets/img/portfolio/web1.jpg " class="img-fluid " alt=" ">
                                <a href="assets/img/portfolio/web1.jpg " class="link-preview venobox " data-gall="portfolioGallery " title="Web 1 "><i class="ion ion-eye "></i></a>
                                <a href="portfolio-details.html " class="link-details " title="More Details "><i class="ion ion-android-open "></i></a>
                            </figure>

                            <div class="portfolio-info ">
                                <h4><a href="portfolio-details.html ">Web 1</a></h4>
                                <p>Web</p>
                            </div>
                        </div>
                    </div>

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