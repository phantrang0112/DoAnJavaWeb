package controller_User;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entities.Item;
import entities.Product;
import model_User.ProductModel;
import model_User.ProductTypeModel;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductServlet() {
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
		String chuoiString = request.getParameter("task");
		if (chuoiString.equals("Product")) {
			page = "User/Product.jsp";
			ProductModel productModel = new ProductModel();
			ProductTypeModel productTypeModel = new ProductTypeModel();

			request.setAttribute("product", productModel.getlistFilter());
			request.setAttribute("productType", productTypeModel.getlist());
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
		String chuoiString = request.getParameter("task");
		String searchString = request.getParameter("txtSearch");
		ProductModel pro = new ProductModel();
		ProductTypeModel productTypeModel = new ProductTypeModel();


		if (chuoiString.equals("Search")) {
			System.out.println("tb"+message);
			ArrayList<Item> list = pro.getlistSearch(searchString);
			System.out.println(list);
			if (list==null) {
				System.out.println("tb 5"+message);
				message = "Không tìm thấy sản phẩm";
				page = "User/Product.jsp";
			} else {
				
				page = "User/Product.jsp";
				request.setAttribute("product", list);
				request.setAttribute("productType", productTypeModel.getlist());
			}
		}
		System.out.println("tb"+message);
		request.setAttribute("thong bao", message);
		request.getRequestDispatcher(page).forward(request, response);
	}

}
