package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.Account;
import entities.ChiTietHoaDon;
import entities.HoaDon;
import entities.Item;
import model.CartModel;
import model.ChiTietHoaDonModel;
import controller.*;
import model.HoaDonModel;
import model.ProductModel;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CartModel cartModel = new CartModel();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CartServlet() {
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
		String action = request.getParameter("action");
		String idSP = request.getParameter("idSP");
		if (action.equals("add")) {
			System.out.println("add roi nha" + idSP);
			cartModel.addlist(idSP);
			request.setAttribute("list", cartModel.getlistItems());
			request.setAttribute("totalCart", cartModel.totallist());
			page = "User/Cart.jsp";
		} else if (action.equals("delete")) {
			cartModel.removeProduct(idSP);
			page = "User/Cart.jsp";
			request.setAttribute("list", cartModel.getlistItems());
		} else if (action.equals("removeall")) {
			cartModel.removeAll();
			page = "User/Cart.jsp";
			request.setAttribute("list", cartModel.getlistItems());
		} else if (action.equals("cart")) {
			page = "User/Cart.jsp";
			request.setAttribute("list", cartModel.getlistItems());
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
		String message="";
		String pageString = "";
		String action = request.getParameter("action");
		String masp = request.getParameter("masp");
		System.out.println("voday");
		HttpSession session = request.getSession();
		// lay nagy hien tai
//				SimpleDateFormat dateFormat= new SimpleDateFormat("MM/dd/yyyy");
//				Calendar calendar= Calendar.getInstance();
		Date date = new Date();
		Account acc= (Account)session.getAttribute("acccountHienTai");
		java.sql.Date ngaylap = new java.sql.Date(date.getTime());
		HoaDon hDon = new HoaDon(acc.getIdUser(),ngaylap);
		System.out.println(acc.getIdUser()+"id user");
		
		// insert hoa don
		HoaDonModel hoaDonModel = new HoaDonModel(hDon);
		hoaDonModel.intsertHoaDon();

		// lay ma hoa don vua tao
		int newesthoadon = hoaDonModel.getNewestIdHoaDon();
		// insert cthd
		ProductModel productModel= new ProductModel();
		ArrayList<Item> cart = (ArrayList<Item>) cartModel.getlistItems();
		for (Item i : cart) {
			ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon(newesthoadon, i.getProduct().getIdSP(), i.getSoluong());
			System.out.println("ma" + newesthoadon + "ten" + i.getProduct().getIdSP() + i.getSoluong());
			ChiTietHoaDonModel cthdModel = new ChiTietHoaDonModel(chiTietHoaDon);
			productModel.UpdateSoLuong(i.getProduct().getIdSP(),i.getSoluong());
			cthdModel.insertChiTietHoaDon();	
			message="Thanh toán Thành công";
			
		}
		// insert thanh cong, xoa gio hang
		cartModel.removeAll();
		pageString = "User/Cart.jsp";
		request.setAttribute("thong bao", message);
		request.getRequestDispatcher(pageString).forward(request, response);

	}

}
