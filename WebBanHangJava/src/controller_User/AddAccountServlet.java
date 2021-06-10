package controller_User;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Account;
import model_Admin.AccountModel_Admin;
import model_User.AccountModel;

/**
 * Servlet implementation class AddAccountServlet
 */
@WebServlet("/AddAccountServlet")
public class AddAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddAccountServlet() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("txtname");
		String password = request.getParameter("txtpassword");
		String mail = request.getParameter("txtemail");
		String sdt = request.getParameter("txtsdt");
		String message = "";
		String page = "";
		Account account = new Account(userName, password, mail, sdt);
		AccountModel accountModel = new AccountModel(account);
		String chuoiString = request.getParameter("task");
		System.out.println(userName + password + mail);
		if (chuoiString.equals("insertUser")) {
			if (userName == null || password == null) {
				message = "Không được để trống tên tài khoản hoặc mật khẩu";
				page = "User/DangKi.jsp";
			} else {
				String quyen = "user";
				int kq = accountModel.insertAccount(quyen);
				if (kq == 0) {
					message = "Thất bại, Tài khoản đã tồn tại";
					page = "User/DangKi.jsp";
				} else {
					message = "Đăng kí thành công";
					page = "User/DangKi.jsp";
				}
			}
		}
		request.setAttribute("thong bao", message);
		request.getRequestDispatcher(page).forward(request, response);

	}

}
