package controller_Admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model_Admin.HoaDonModelAdmin;
import model_Admin.ProductModelAdmin;

/**
 * Servlet implementation class HoaDonServlet
 */
@WebServlet("/HoaDonServlet")
public class HoaDonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HoaDonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = "";
		String page = "";
		HoaDonModelAdmin hoaDonModelAdmin= new HoaDonModelAdmin();
		HttpSession session = request.getSession();
		String chuoiString = request.getParameter("task");
		if (chuoiString.equals("HoaDonAdmin")) {
			request.setAttribute("ListHD", hoaDonModelAdmin.getList());
			page = "Admin/DSHoaDon.jsp";
		}

		request.setAttribute("thong bao", message);
		request.getRequestDispatcher(page).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
