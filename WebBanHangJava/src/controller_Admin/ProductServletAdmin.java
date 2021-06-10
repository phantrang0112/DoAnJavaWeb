package controller_Admin;

import java.io.IOException;
import java.sql.Connection;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.DateFormatter;

import controller_User.MyConnect;
import entities.Account;
import entities.Product;
import model_Admin.AccountModel_Admin;
import model_Admin.ProductModelAdmin;

/**
 * Servlet implementation class ProductServletAdmin
 */
@WebServlet("/ProductServletAdmin")
public class ProductServletAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductServletAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String message = "";
		String page = "";
		ProductModelAdmin productModelAdmin = new ProductModelAdmin();
		HttpSession session = request.getSession();
		String chuoiString = request.getParameter("task");
		String idSP = request.getParameter("idSP");
		if (chuoiString.equals("SanPhamAdmin")) {
			request.setAttribute("ListSP", productModelAdmin.getList());
			page = "Admin/Product.jsp";
		}
		 if(chuoiString.equals("ThemSanPham")) {
			page = "Admin/AddProduct.jsp";
		 }
		 if (chuoiString.equals("deleteSP")) {
				int kkq = productModelAdmin.deleteProduct(idSP);
				System.out.println(kkq);
				if (kkq == 0) {
					message = "delete that bai";
					page = "Admin/Product.jsp";
				} else {
					request.setAttribute("ListSP", productModelAdmin.getList());
					message = "xoa thành công";
					page = "Admin/Product.jsp";
				}
			}
		request.setAttribute("thong bao", message);
		request.getRequestDispatcher(page).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String message = "";
		String page = "";
		ProductModelAdmin pro = new ProductModelAdmin();
		HttpSession session = request.getSession();
		Connection cn = new MyConnect().getcn();
		if (cn == null) {
			message = "ket noi that bai2";
			request.setAttribute("thong bao", message);

			return;

		}
		String chuoiString = request.getParameter("task");
		String idSP= request.getParameter("txtIdSP");
		String tenSP = request.getParameter("txtTenSP");
		int gia = Integer.parseInt(request.getParameter("txtGiaSP"));
		int soLuong = Integer.parseInt(request.getParameter("txtSoLuong"));
		String hinhString= request.getParameter("txtHinhSP");
		String ngayNhapDate = request.getParameter("txtNgayNhap");
		// lay nagy hien tais
		final java.sql.Date ngaylap = java.sql.Date.valueOf(ngayNhapDate);
		String trangThai = request.getParameter("txtTrangThai");
		String tenLoai= request.getParameter("txtTenLoai");
		System.out.println(tenLoai+"idloai");
		if (chuoiString.equals("updateSP")) {
			System.out.println(tenSP + gia);
			if ((tenSP == "") || (gia == 0)) {
				message = "Không được để trống tên sản phẩm.";
				page = "Admin/DSNhanVien.jsp";
			} else {
				Product product = new Product(tenSP, soLuong, gia, ngaylap, trangThai);
				ProductModelAdmin proModel = new ProductModelAdmin(product);
				String idSPUD = request.getParameter("idSP");
				System.out.println(idSPUD + "id");
				int kq = proModel.updateSPGetIdSP(idSPUD);
				System.out.println(kq + "kq");
				if (kq == 0) {
					message = "update that bai";
					request.setAttribute("ListSP", pro.getList());
					page = "Admin/Product.jsp";
				} else {
					message = "Cập nhật thành công";
					request.setAttribute("ListSP", pro.getList());
					page = "Admin/Product.jsp";

				}
			}

		}
		
		if(chuoiString.equals("insertProduct")) {
			Product product= new Product(idSP,tenSP,soLuong,gia,ngaylap,hinhString,trangThai);
			 ProductModelAdmin productModel= new ProductModelAdmin(product);
			 int kqq= productModel.insertProduct(tenLoai);
			 if(kqq==0) {
				 message ="Thêm thất bại, mã sản phẩm đã tồn tại";
				 page = "Admin/AddProduct.jsp";
			 }
			 else {
				 message ="Thêm Sản Phẩm thành công";
				 page = "Admin/AddProduct.jsp";
			}
		}
		request.setAttribute("thong bao", message);
		request.getRequestDispatcher(page).forward(request, response);
	}

}
