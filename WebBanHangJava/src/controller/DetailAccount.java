package controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.Account;
import model.AccountModel;

/**
 * Servlet implementation class DetailController
 */
@WebServlet("/DetailAccount")
public class DetailAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DetailAccount() {
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
		String page = "User/Account.jsp";
		
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
		
		HttpSession session = request.getSession();
		Connection cn = new MyConnect().getcn();
		if (cn == null) {
			message = "ket noi that bai2";
			request.setAttribute("thong bao", message);
			request.getRequestDispatcher("error.jsp").forward(request, response);
			return;

		}
		String userName = request.getParameter("txtname");
		String password = request.getParameter("txtpassword");
		String mail= request.getParameter("txtemail");
		String sdt= request.getParameter("txtsdt");
		System.out.println(userName+password);
		if((userName=="")||(password=="")) {
			message="Không được để trống tên đăng nhập hoặc mật khẩu.";
			page = "User/Account.jsp";
		}else {
			Account accounth=(Account) session.getAttribute("acccountHienTai");
			Account account = new Account(accounth.getIdUser(), userName, password,mail,sdt,accounth.getIdQuyen());
			System.out.println( " detail acccount"+accounth.getIdUser()+accounth.getEmail());
			AccountModel accoutModel = new AccountModel(account);
			String chuoiString = request.getParameter("task");
			if (chuoiString.equals("update")) {
				int kq = accoutModel.updateAccount();
				if (kq == 0) {
					message = "update that bai";
					page = "error.jsp";
				} else {
//					session.setAttribute("accountList", new AccoutModel().getList());
					page = "User/Account.jsp";
					message="Cập nhật thành công";
				}
			}
			
		}
		
		request.setAttribute("thong bao", message);
		request.getRequestDispatcher(page).forward(request, response);
	}

}
