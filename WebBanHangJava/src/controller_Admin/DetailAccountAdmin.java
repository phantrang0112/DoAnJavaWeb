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
 * Servlet implementation class DetailAccountAdmin
 */
@WebServlet("/DetailAccountAdmin")
public class DetailAccountAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DetailAccountAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String message = "";
		String page = "";
		AccountModel_Admin acc = new AccountModel_Admin();
		HttpSession session = request.getSession();
		String chuoiString = request.getParameter("task");
		if (chuoiString.equals("AccountAdmin")) {
			page = "Admin/AccountAdmin.jsp";
		}
		if (chuoiString.equals("ListNhanVien")) {
			if (acc == null) {
				message = "Không có nhân viên nào";
			} else {
				request.setAttribute("ListNV", acc.getlistNV());
				page = "Admin/DSNhanVien.jsp";
			}
		}
		if (chuoiString.equals("ListKhachHang")) {
			if (acc == null) {
				message = "Không có nhân viên nào";
			} else {
				request.setAttribute("ListKH", acc.getlistKH());
				page = "Admin/DSKhachHang.jsp";
			}
		}
		if (chuoiString.equals("ThemNhanVien")) {
			if (acc == null) {
				message = "Không có nhân viên nào";
			} else {
				page = "Admin/ThemNhanVien.jsp";
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
		// TODO Auto-generated method stub

		String userName = request.getParameter("txtname");
		String password = request.getParameter("txtpass");
		String mail = request.getParameter("txtemail");
		String sdt = request.getParameter("txtsdt");
		String message = "";
		String page = "";
		Account account= new Account(userName,password,mail,sdt);
		AccountModel_Admin accountModel_Admin= new AccountModel_Admin(account);
		String chuoiString = request.getParameter("task");
		System.out.println(userName+password+mail);
		if(chuoiString.equals("insertAdmin")) {
			 String quyen="admin";
			 int kq= accountModel_Admin.insertAccount(quyen);
			 if(kq==0) {
				 message ="That bai,Tai khoan da ton tai!";
				 page = "Admin/ThemNhanVien.jsp";
			 }
			 else {
				 message ="Them nhan vien thanh cong";
				 page = "Admin/ThemNhanVien.jsp";
			}
		}
		
		HttpSession session = request.getSession();
		System.out.println(userName + password);
		if ((userName == "") || (password == "")) {
			message = "Không được để trống tên đăng nhập hoặc mật khẩu.";
			page = "Admin/AccountAdmin.jsp";
		} else {
			Account accounth = (Account) session.getAttribute("acccountHienTai");
			Account accountUpdate = new Account(accounth.getIdUser(), userName, password, mail, sdt, accounth.getIdQuyen());
			System.out.println("detail acccount" + accounth.getIdUser() + accounth.getEmail());
			AccountModel_Admin accoutModel = new AccountModel_Admin(accountUpdate);
			
			if (chuoiString.equals("update")) {
				int kq = accoutModel.updateAccountAdmin();
				if (kq == 0) {
					message = "update that bai";
					page = "Admin/AccountAdmin.jsp";
				} else {
//					session.setAttribute("accountList", new AccoutModel().getList());
					session.setAttribute("acccountHienTai",	new AccountModel_Admin().getAccountHienTai(userName, password, session));
					page = "Admin/AccountAdmin.jsp";
					message = "Cập nhật thành công";
				}
			}

		}

		request.setAttribute("thong bao", message);
		request.getRequestDispatcher(page).forward(request, response);

	}

}
