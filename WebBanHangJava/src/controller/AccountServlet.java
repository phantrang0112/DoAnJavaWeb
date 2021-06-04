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
 * Servlet implementation class AccountServlet
 */
@WebServlet("/AccountServlet")
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String message = "";
		String page = "";
		String chuoiString = request.getParameter("task");
		if(chuoiString.equals("home")) {
			page="User/HomeUser.jsp";
		}
		if(chuoiString.equals("contact")) {
			page="User/Contact.jsp";
		}
		
		request.setAttribute("thong bao", message);
		request.getRequestDispatcher(page).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
		String password = request.getParameter("txtpass");
		Account account = new Account(userName, password);
		AccountModel accoutModel = new AccountModel(account);
		String chuoiString = request.getParameter("task");
		if (chuoiString.equals("login")) {
			int kq = accoutModel.login(userName, password, session);
			
			
			System.out.println(kq);
			if (kq == 0) {
				message = "Sai mat khau hoac ten dang nhap";
				page = "Home.jsp";
			} else {
				session.setAttribute("acccountHienTai",new AccountModel().getAccountHienTai(userName, password, session));
				System.out.println(session.getAttribute("acccountHienTai"));
				page = "User/HomeUser.jsp";
			}
		}
//		if(chuoiString.equals("update")) {
//			
//			int kq= accoutModel.updateAccount();
//			if (kq == 0) {
//				message = "update that bai";
//				page = "error.jsp";
//			} else {
////				session.setAttribute("accountList", new AccoutModel().getList());
//				page = "User/Account.jsp";
//			}
//		}
		request.setAttribute("thong bao", message);
		request.getRequestDispatcher(page).forward(request, response);
	}

}
