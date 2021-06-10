<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <%@page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <link rel="apple-touch-icon" sizes="76x76" href="./assetsAdmin/img/apple-icon.png">
    <link rel="icon" type="image/png" href="./assetsAdmin/img/favicon.png">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
      <title>Tiệm của Trang</title>
    <!-- Favicons -->
   
   
 	<link href="assets/image/img/logoTittle.png" rel="icon">
    <link href="assets/image/img/apple-touch-icon.png" rel="apple-touch-icon">
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
    <!--     Fonts and icons     -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
    <!-- CSS Files -->
    <link href="./assetsAdmin/css/bootstrap.min.css" rel="stylesheet" />
    <link href="./assetsAdmin/css/paper-dashboard.css?v=2.0.1" rel="stylesheet" />
    <!-- CSS Just for demo purpose, don't include it in your project -->
    <link href="./assetsAdmin/demo/demo.css" rel="stylesheet" />
</head>

<body class="">
    <div class="wrapper ">
          <div class="sidebar" data-color="white" data-active-color="danger">
            <div class="logo">
                <a href="https://www.creative-tim.com" class="simple-text logo-mini">
                    <div class="logo-image-small">
                        <img src="./assetsAdmin/img/logo-small.png">
                    </div>
                    <!-- <p>CT</p> -->
                </a>
		        <a href="" class="simple-text logo-normal">
		          Trang Nhỏ
		          <!-- <div class="logo-image-big">
		            <img src="../assetsAdmin/img/logo-big.png">
		          </div> -->
		        </a>
            </div>
            <div class="sidebar-wrapper">
                <ul class="nav">
                    <li >
                        <a href="<c:url value="HomeServletAdmin?task=home"/>">
                            <i class="nc-icon nc-bank"></i>
                            <p>Trang Chủ</p>
                        </a>
                    </li>
                    <li>
                        <a href="<c:url value="DetailAccountAdmin?task=AccountAdmin"/>">
                            <i class="nc-icon nc-single-02"></i>
                            <p>Thông tin người dùng</p>
                        </a>
                    </li>

                    <li class="active">
                        <a href="<c:url value="HoaDonServlet?task=HoaDonAdmin"/>">
                            <i class="nc-icon nc-paper"></i>
                            <p>Hóa Đơn</p>
                        </a>
                    </li>

                    <li>
                        <a href="<c:url value="DetailAccountAdmin?task=ListNhanVien"/>">
                            <i class="nc-icon nc-tile-56"></i>
                            <p>Danh Sách Nhân Viên</p>
                        </a>
                    </li>

                    <li>
                        <a href="<c:url value="DetailAccountAdmin?task=ListKhachHang"/>">
                            <i class="nc-icon nc-circle-10"></i>
                            <p>Danh Sách Khách Hàng</p>
                        </a>
                    </li>
                    <li>
                        <a href="<c:url value="ProductServletAdmin?task=SanPhamAdmin"/>">
                            <i class="nc-icon nc-box"></i>
                            <p>Sản Phẩm</p>
                        </a>
                    </li>
                    <li>
                        <a href="<c:url value="ProductServletAdmin?task=ThemSanPham"/>">
                            <i class="nc-icon nc-simple-add"></i>
                            <p>Thêm Sản Phẩm</p>
                        </a>
                    </li>
                    <li class=" active-pro">
                        <a href="<c:url value="DetailAccountAdmin?task=ThemNhanVien"/>">
                            <i class="nc-icon nc-spaceship"></i>
                            <p>Thêm Nhân Viên</p>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="main-panel" style="height: 100vh;">
            <!-- Navbar -->
            <nav class="navbar navbar-expand-lg navbar-absolute fixed-top navbar-transparent">
                <div class="container-fluid">
                    <div class="navbar-wrapper">
                        <div class="navbar-toggle">
                            <button type="button" class="navbar-toggler">
                                <span class="navbar-toggler-bar bar1"></span>
                                <span class="navbar-toggler-bar bar2"></span>
                                <span class="navbar-toggler-bar bar3"></span>
                            </button>
                        </div>
                        <a class="navbar-brand" href="javascript:;">Title</a>
                    </div>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-bar navbar-kebab"></span>
                        <span class="navbar-toggler-bar navbar-kebab"></span>
                        <span class="navbar-toggler-bar navbar-kebab"></span>
                    </button>
                    <div class="collapse navbar-collapse justify-content-end" id="navigation">
                        <form>
                            <div class="input-group no-border">
                                <input type="text" value="" class="form-control" placeholder="Search...">
                                <div class="input-group-append">
                                    <div class="input-group-text">
                                        <i class="nc-icon nc-zoom-split"></i>
                                    </div>
                                </div>
                            </div>
                        </form>
                        <ul class="navbar-nav">
                            <li class="nav-item btn-rotate dropdown">
                                <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i class="nc-icon nc-bell-55"></i>
                                    <p>
                                        <span class="d-lg-none d-md-block">Some Actions</span>
                                    </p>
                                </a>
                                <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                                    <a class="dropdown-item" href="#">Action</a>
                                    <a class="dropdown-item" href="#">Another action</a>
                                    <a class="dropdown-item" href="#">Something else here</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
            <!-- End Navbar -->
            <div class="content">
                <div class="card-header">
                    <h4 class="card-title"> Danh sách Hóa Đơn</h4>
                </div>
                <table id="cart" class="table table-hover table-condensed">
                    <thead>
                        <tr>
                            <th style="width:10%">Stt</th>
                            <th style="width:10%">Mã Hóa Đơn</th>
                            <th style="width:38%">Mã Khach Hang</th>
                            <th style="width:10%" class="text-center">Ngày Lập</th>
                            <th style="width:10%">Tổng Tiền</th>
                            <th style="width:10%"> </th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="p" items="${ListHD }">
                        <tr>
                            <td data-th="Product">${p.stt }</td>
                            <td data-th="Price">${p.idHD }</td>
                            <td data-th="Quantity">${p.idUser } </td>
                            <td data-th="Subtotal" class="text-center">${p.ngayLap }</td>
                            <td>${p.tong }</td>
                            <td class="actions" data-th="">
                                <a href="<c:url value="ChiTietHoaDonServlet?task=CTHD&idHD=${p.idHD }"/>" class="btn btn-info btn-sm"><i class="nc-icon nc-simple-add"></i></a>
                                
                            </td>
                        </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <footer class="footer footer-black  footer-white ">
                <div class="container-fluid">
                    <div class="row">
                        <nav class="footer-nav">
                            <ul>
                                <li><a href="https://www.creative-tim.com" target="_blank">Creative Tim</a></li>
                                <li><a href="https://www.creative-tim.com/blog" target="_blank">Blog</a></li>
                                <li><a href="https://www.creative-tim.com/license" target="_blank">Licenses</a></li>
                            </ul>
                        </nav>
                        <div class="credits ml-auto">
                            <span class="copyright">
                                © <script>
                                document.write(new Date().getFullYear())
                                </script>, made with <i class="fa fa-heart heart"></i> by Creative Tim
                            </span>
                        </div>
                    </div>
                </div>

            </footer>
        </div>
    </div>


    <!--   Core JS Files   -->
    <script src="./assetsAdmin/js/core/jquery.min.js"></script>
    <script src="./assetsAdmin/js/core/popper.min.js"></script>
    <script src="./assetsAdmin/js/core/bootstrap.min.js"></script>
    <script src="./assetsAdmin/js/plugins/perfect-scrollbar.jquery.min.js"></script>
    <!--  Google Maps Plugin    -->
    <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
    <!-- Chart JS -->
    <script src="./assetsAdmin/js/plugins/chartjs.min.js"></script>
    <!--  Notifications Plugin    -->
    <script src="./assetsAdmin/js/plugins/bootstrap-notify.js"></script>
    <!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->
    <script src="./assetsAdmin/js/paper-dashboard.min.js?v=2.0.1" type="text/javascript"></script>
</body>
<footer class="main-panel" style="background-color: white;" >
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