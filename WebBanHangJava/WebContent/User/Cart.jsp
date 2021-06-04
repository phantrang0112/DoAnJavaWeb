<%@page import="entities.Item"%>
<%@page import="entities.Product"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
  
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

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
                            <li><a href="#">Giới thiệu</a></li>
                            <li><a href="<c:url value="MenuServlet"/>">Menu</a></li>
                            <li><a href="<c:url value="ProductServlet?task=Product"/>">Sản phẩm</a>
                               
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
    <div class="container ">
        <div class="col-12 row" style="margin: 20px;">
            <div class="col-3">
                <a href="<c:url value="AccountServlet?task=home"/>"> Trang chủ</a>
                <span style="width: 3px;  border: 1px solid rgb(146, 236, 169); margin-right: 5px;"></span>
                <a href="product.html">Giỏ Hàng</a>
            </div>
        </div>
       
        <% ArrayList<Item> cart=(ArrayList<Item>)request.getAttribute("list");%>
        <%if(cart==null) { %>
        <p style="margin: 40px; font-size: larger; color: red"><%=request.getAttribute("thong bao")%></p>
        <%} else{ %>
        <form action="CartServlet" method="post">
        <table id="cart" class="table table-hover table-condensed">
            <thead>
                <tr>

                    <th style="width:50%">Tên sản phẩm</th>
                    <th style="width:10%">Giá</th>
                    <th style="width:8%">Số lượng</th>
                    <th style="width:22%" class="text-center">Thành tiền</th>
                    <th style="width:10%"> </th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="i" items="<%=cart%>">
                <tr>
                
                    <td data-th="Product">
                        <div class="row">
                            <div class="col-sm-2 hidden-xs"><img src="assets/image/img/${i.product.hinhSP }" alt="Sản phẩm 1" class="img-responsive" width="100">
                            </div>
                            <div class="col-sm-10">
                                <h4 style="margin-left: 20px " class="nomargin">${i.product.tenSP}</h4>
                               
                            </div>
                        </div>
                    </td>
                    <td data-th="Price">${i.product.gia} đ</td>
                    <td data-th="Quantity"><input class="form-control text-center" value="${i.soluong}" type="number">
                    </td>
                    <td data-th="Subtotal" class="text-center">${i.soluong*i.product.gia } đ</td>
                    <td class="actions" data-th="">
                        <a href="CartServlet?action=delete&idSP=${i.product.idSP }"><i class="fa fa-trash-o"></i></a>
                      
                    </td>
                </tr>
              </c:forEach>
            </tbody>
            <tfoot>
                <tr class="visible-xs">
                    <td class="text-center"><strong>Tổng <%=request.getAttribute("totalCart")%>  đ</strong>
                    </td>
                </tr>
                <tr>
                    <td><a href="<c:url value="ProductServlet?task=Product"/>" class="btn btn-warning"><i class="fa fa-angle-left"></i> Tiếp tục mua hàng</a>
                    </td>
                    <td colspan="2" class="hidden-xs"> </td>
                    <td class="hidden-xs text-center"><strong>Tổng tiền <%=request.getAttribute("totalCart")%> đ</strong></td>
                  <td>  <a href="CartServlet?action=removeall"> Xóa tất cả</a></td>
                    <td><a href="" class="btn btn-success btn-block"><input style="background-color:transparent; outline: none;border: none;" type="submit" value="Mua Hang"> </i></a>
                    </td>
                </tr>
            </tfoot>
        </table>
          </form>
        <%} %>
      
    </div>

</body>
<footer style="margin-top: 200px" ">
    <div class="footer-top ">s
        <div class="container ">
            <div class="row ">
                <div class="col-md-4 col-lg-4 footer-about wow fadeInUp ">
                    <img class="logo-footer " src="assets/img/logo.png " alt="logo-footer " data-at2x="assets/img/logo.png ">
                    <p>
                        Hãy đến với chúng tôi. Chúng tôi sẽ mang đến cho bạn những gì tuyệt vời nhất
                    </p>
                    <p><a href="# ">TrangNho</a></p>
                </div>
                <div class="col-md-4 col-lg-4 offset-lg-1 footer-contact wow fadeInDown ">
                    <h3>Liên hệ:</h3>
                    <p><i class="fas fa-map-marker-alt "></i> 61/7 Đường 104, Tăng Nhơn Phú A,Q9</p>
                    <p><i class="fas fa-phone "></i> Phone: 0327248445</p>
                    <p><i class="fas fa-envelope "></i> Email: <a href="mailto:hello@domain.com ">phantrang011220@gmail.com</a></p>
                    <p><i class="fab fa-skype "></i> Skype: phantrang0112</p>
                </div>
                <div class="col-md-4 col-lg-3 footer-social wow fadeInUp ">
                    <h3>Follow us</h3>
                    <p>
                        <a href="# "><i class="fab fa-facebook "></i></a>
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