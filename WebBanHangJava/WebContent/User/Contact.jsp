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
                            <li class="drop-down"><a href="<c:url value="ProductServlet?task=Product"/>">Sản phẩm</a>
                                <ul>
                                    <li><a href="a.html">Drop Down 1</a></li>
                                    <li><a href="#">Drop Down 3</a></li>
                                    <li><a href="#">Drop Down 4</a></li>
                                    <li><a href="#">Drop Down 5</a></li>


                                </ul>
                            </li>
                            <li><a href="contact.html">liên hệ</a></li>
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
    <main>
        <!-- ======= Contact Section ======= -->
        <section id="contact" class="section-bg">
            <div class="container" data-aos="fade-up">

                <div class="col-12 row">
                    <div class="col-3">
                        <a href="home.html"> Trang chủ</a>
                        <span style="width: 3px;  border: 1px solid white; margin-right: 5px;"></span>
                        <a href="contact.html">Liên hệ</a>
                    </div>
                </div>
            </div>

            <div class="container" data-aos="fade-up">
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3918.4627534908627!2d106.78827831452926!3d10.852364992270054!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3175276ba7c9c74b%3A0x39754fa981bfe6a5!2zMTEvMTA0IMSQxrDhu51uZyBNYW4gVGhp4buHbiwgUGjGsOG7nW5nIFTDom4gUGjDuiwgUXXhuq1uIDksIFRow6BuaCBwaOG7kSBI4buTIENow60gTWluaCwgVmnhu4d0IE5hbQ!5e0!3m2!1svi!2s!4v1622107087768!5m2!1svi!2s"
                    style="border:0; width: 100%; height: 350px; margin-top: 20px;" allowfullscreen="" loading="lazy"></iframe>
            </div>

            <div class="container" data-aos="fade-up">

                <div class="row mt-5">

                    <div class="col-lg-4">
                        <div class="info">
                            <div class="address">
                                <i class="icofont-google-map"></i>
                                <h4>Địa chỉ</h4>
                                <p>A61/7 Đường 104, Tăng Nhơn Phú A,Q9s</p>
                            </div>

                            <div class="open-hours">
                                <i class="icofont-clock-time icofont-rotate-90"></i>
                                <h4>Giờ mở cửa:</h4>
                                <p>
                                    Thứ 2- Thứ 7:<br> 11:00 AM - 2300 PM
                                </p>
                            </div>

                            <div class="email">
                                <i class="icofont-envelope"></i>
                                <h4>Email:</h4>
                                <p>phantrang011220@gmail.com</p>
                            </div>

                            <div class="phone">
                                <i class="icofont-phone"></i>
                                <h4>SĐT:</h4>
                                <p>0327248445</p>
                            </div>

                        </div>

                    </div>

                    <div class="col-lg-8 mt-5 mt-lg-0">

                        <form action="forms/contact.php" method="post" role="form" class="php-email-form">
                            <div class="form-row">
                                <div class="col-md-6 form-group">
                                    <input type="text" name="name" class="form-control" id="name" placeholder="Your Name" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                                    <div class="validate"></div>
                                </div>
                                <div class="col-md-6 form-group">
                                    <input type="email" class="form-control" name="email" id="email" placeholder="Your Email" data-rule="email" data-msg="Please enter a valid email" />
                                    <div class="validate"></div>
                                </div>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="subject" id="subject" placeholder="Subject" data-rule="minlen:4" data-msg="Please enter at least 8 chars of subject" />
                                <div class="validate"></div>
                            </div>
                            <div class="form-group">
                                <textarea class="form-control" name="message" rows="8" data-rule="required" data-msg="Please write something for us" placeholder="Message"></textarea>
                                <div class="validate"></div>
                            </div>
                            <div class="mb-3">
                                <div class="loading">Loading</div>
                                <div class="error-message"></div>
                                <div class="sent-message">Your message has been sent. Thank you!</div>
                            </div>
                            <div class="text-center"><button type="submit">Send Message</button></div>
                        </form>

                    </div>

                </div>

            </div>
        </section>
        <!-- End Contact Section -->
    </main>
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
                <div class="col-md-4 col-lg-4 footer-about wow fadeInUp ">
                    <img class="logo-footer " src="assets/footer/assets/img/logo.png " alt="logo-footer " data-at2x="assets/img/logo.png ">
                    <p>
                        We are a young company always looking for new and creative ideas to help you with our products in your everyday work.
                    </p>
                    <p><a href="# ">Our Team</a></p>
                </div>
                <div class="col-md-4 col-lg-4 offset-lg-1 footer-contact wow fadeInDown ">
                    <h3>Contact</h3>
                    <p><i class="fas fa-map-marker-alt "></i> Via Rossini 10, 10136 Turin Italy</p>
                    <p><i class="fas fa-phone "></i> Phone: (0039) 333 12 68 347</p>
                    <p><i class="fas fa-envelope "></i> Email: <a href="mailto:hello@domain.com ">hello@domain.com</a></p>
                    <p><i class="fab fa-skype "></i> Skype: you_online</p>
                </div>
                <div class="col-md-4 col-lg-3 footer-social wow fadeInUp ">
                    <h3>Follow us</h3>
                    <p>
                        <a href="# "><i class="fab fa-facebook ">facebook</i></a>
                        <a href="# "><i class="fab fa-twitter "></i></a>
                        <a href="# "><i class="fab fa-google-plus-g "></i></a>
                        <a href="# "><i class="fab fa-instagram "></i></a>
                        <a href="# "><i class="fab fa-pinterest "></i></a>
                    </p>
                </div>
            </div>
        </div>
    </div>

</footer>

</html>