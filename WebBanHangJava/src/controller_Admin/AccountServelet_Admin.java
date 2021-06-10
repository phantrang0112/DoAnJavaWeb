package controller_Admin;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller_User.MyConnect;
import entities.Account;

import model_Admin.AccountModel_Admin;
import model_User.AccountModel;

/**
 * Servlet implementation class AccountServelet_Admin
 */
@WebServlet("/AccountServeletAdmin")
public class AccountServelet_Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AccountServelet_Admin() {
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
		AccountModel_Admin acc = new AccountModel_Admin();
		HttpSession session = request.getSession();
		Connection cn = new MyConnect().getcn();
		AccountModel_Admin accoutModel = new AccountModel_Admin();
		String chuoiString = request.getParameter("task");
		int idUser = Integer.parseInt(request.getParameter("idUser"));
//		int idUserKH = Integer.parseInt(request.getParameter("idUserKH"));
//		System.out.println("nay nha"+idUserKH);
		if (cn == null) {
			message = "ket noi that bai2";
			request.setAttribute("thong bao", message);

			return;

		}
		
		if (chuoiString.equals("deleteNV")) {
			int kkq = accoutModel.deleteAccount(idUser);
			System.out.println(kkq);
			if (kkq == 0) {
				message = "delete that bai";
				page = "Admin/DSNhanVien.jsp";
			} else {
				request.setAttribute("ListNV", acc.getlistNV());
				message = "xoa thành công";
				page = "Admin/DSNhanVien.jsp";
			}
		}
		if (chuoiString.equals("deleteKH")) {
			int kkq = accoutModel.deleteAccount(idUser);
			System.out.println(kkq +"Kh"+idUser);
			if (kkq == 0) {
				message = "delete that bai";
				page = "Admin/DSKhachHang.jsp";
			} else {
				request.setAttribute("ListKH", acc.getlistKH());
				message = "xoa thành công";
				page = "Admin/DSKhachHang.jsp";
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
		AccountModel_Admin acc = new AccountModel_Admin();
		HttpSession session = request.getSession();
		Connection cn = new MyConnect().getcn();
		if (cn == null) {
			message = "ket noi that bai2";
			request.setAttribute("thong bao", message);

			return;

		}
		String chuoiString = request.getParameter("task");
		String userName = request.getParameter("txtnameNv");
		String password = request.getParameter("txtpassNv");
		String mail = request.getParameter("txtemailNv");
		String sdt = request.getParameter("txtsdtNv");
		if (chuoiString.equals("updateNhanVien")) {
			System.out.println(userName + password);
			if ((userName == "") || (password == "")) {
				message = "Không được để trống tên đăng nhập hoặc mật khẩu.";
				page = "Admin/DSNhanVien.jsp";
			} else {
				Account account = new Account(userName, password, mail, sdt);
				AccountModel_Admin accoutModel = new AccountModel_Admin(account);
				System.out.println(account.getEmail() + "huhu");
				int idUserUpdate = Integer.parseInt(request.getParameter("idUserUpdateNV"));
				System.out.println(idUserUpdate + "id");
				int kq = accoutModel.updateAccountAdminGetIduser(idUserUpdate);
				System.out.println(kq + "kq");
				if (kq == 0) {
					message = "update that bai";
					page = "Admin/DSNhanVien.jsp";
				} else {
					message = "Cập nhật thành công";
					request.setAttribute("ListNV", acc.getlistNV());
					page = "Admin/DSNhanVien.jsp";

				}
			}

		}
		if (chuoiString.equals("updateKhachHang")) {
			System.out.println(userName + password);
			if ((userName == "") || (password == "")) {
				message = "Không được để trống tên đăng nhập hoặc mật khẩu.";
				page = "Admin/DSKhachHang.jsp";
			} else {
				Account account = new Account(userName, password, mail, sdt);
				AccountModel_Admin accoutModel = new AccountModel_Admin(account);
				System.out.println(account.getEmail() + "huhu");
				int idUserUpdate = Integer.parseInt(request.getParameter("idUserUpdateKH"));
				System.out.println(idUserUpdate + "id");
				int kq = accoutModel.updateAccountAdminGetIduser(idUserUpdate);
				System.out.println(kq + "kq");
				if (kq == 0) {
					message = "update that bai";
					page = "Admin/DSKhachHang.jsp";
				} else {
					message = "Cập nhật thành công";
					request.setAttribute("ListKH", acc.getlistKH());
					page = "Admin/DSKhachHang.jsp";

				}
			}

		}
		request.setAttribute("thong bao", message);
		request.getRequestDispatcher(page).forward(request, response);
	}

}