package controller_Admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_Admin.ChiTietHoaDonModelAdmin;
import model_Admin.HoaDonModelAdmin;

/**
 * Servlet implementation class ChiTietHoaDonServlet
 */
@WebServlet("/ChiTietHoaDonServlet")
public class ChiTietHoaDonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChiTietHoaDonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String messageString="";
		String page="";
		 String chuoiString= request.getParameter("task");
		 int idHD= Integer.parseInt(request.getParameter("idHD")) ;
		 String idSP= request.getParameter("idSP") ;
		 ChiTietHoaDonModelAdmin chiTietHoaDon= new ChiTietHoaDonModelAdmin();
		 if(chuoiString.equals("CTHD")){
			 request.setAttribute("ListCTHD",chiTietHoaDon.getListIdHD(idHD));
			 page="Admin/ChiTietHoaDon.jsp";
		 }
		 if (chuoiString.equals("deleteIdSP")) {
				int kkq = chiTietHoaDon.deleteAccount(idSP,idHD);
				HoaDonModelAdmin HD= new HoaDonModelAdmin();
				int tongGia;
				if (kkq == 0) {
					messageString = "delete that bai";
					page="Admin/ChiTietHoaDon.jsp";
				 
				} else {
					
					tongGia= chiTietHoaDon.tongtien(idHD);
					HD.updateTongGia(idHD, tongGia);
					request.setAttribute("ListCTHD",chiTietHoaDon.getListIdHD(idHD));
					messageString = "xoa thành công";
					page="Admin/ChiTietHoaDon.jsp";
				 
				}
			}
		 request.setAttribute("ThongBao", messageString);
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
