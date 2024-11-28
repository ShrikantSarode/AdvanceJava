package example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.bean.Resturant;

/**
 * Servlet implementation class restaurantDisplayServlet
 */
@WebServlet("/display")
public class restaurantDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// obj.getName()
		Object obj = request.getAttribute("searchResturant");
		Resturant currentResturant = (Resturant)obj;
		String name = currentResturant.getName();
		String cuisine = currentResturant.getCuisine();
		int branchCount = currentResturant.getBranchCount();
		out.println("<h1>Restaurant Details:</h1>");
		out.println("<h2>Restaurant Name:" + name + "</h2>");
		out.println("<h2>Restaurant Cuisine:" + cuisine + "</h2>");
		out.println("<h2>Restaurant Branch Count:" + branchCount + "</h2>");

	}

}
