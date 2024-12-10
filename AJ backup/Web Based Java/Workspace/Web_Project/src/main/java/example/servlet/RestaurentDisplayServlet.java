package example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.bean.Restaurent;

/**
 * Servlet implementation class RestaurentDisplayServlet
 */
@WebServlet("/display")
public class RestaurentDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Object obj = request.getAttribute("searchedRestaurent");
		Restaurent currentRestaurent = (Restaurent)obj;
		String name = currentRestaurent.getName();
		String cuisine = currentRestaurent.getCuisine();
		int branchCount = currentRestaurent.getBranchCount();
		out.println("<h1>Restaurent Details: </h1>");
		out.println("<h2>Name:"+ name +" </h2>");
		out.println("<h2>Cuisine:"+ cuisine +" </h2>");
		out.println("<h2>Branch Count:"+ branchCount +" </h2>");
	}

}
