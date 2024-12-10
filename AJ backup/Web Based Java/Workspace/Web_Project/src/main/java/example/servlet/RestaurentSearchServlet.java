package example.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.bean.Restaurent;
import example.dao.DaoInterface;
import example.dao.RestaurentDao;

/**
 * Servlet implementation class RestaurentSearchServlet
 */
@WebServlet("/search")
public class RestaurentSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("r_id");
		int restaurentId = Integer.parseInt(id);

		DaoInterface<Restaurent, Integer> daoRef = new RestaurentDao();
		Restaurent foundRestaurent = daoRef.retrieveOne(restaurentId);
		System.out.println(foundRestaurent);
		out.println(foundRestaurent);
		if (foundRestaurent == null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("search_result.html");
			out.println("<h2>Restaurent with given ID not found. Please try again..!</h2>");
			dispatcher.include(request, response);
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("display");
			request.setAttribute("searchedRestaurent", foundRestaurent);
			dispatcher.forward(request, response);
		}
	}
}
