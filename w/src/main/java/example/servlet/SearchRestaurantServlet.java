package example.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.bean.Resturant;
import example.dao.DaoInterface;
import example.dao.ResturantDao;

/**
 * Servlet implementation class SearchRestaurant
 */
@WebServlet("/search")
public class SearchRestaurantServlet extends HttpServlet {
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
		int restaurantId = Integer.parseInt(id);

		DaoInterface<Resturant, Integer> daoRef = new ResturantDao();
		Resturant foundResturant = daoRef.retrieveOne(restaurantId);
		System.out.println(foundResturant);
		out.println(foundResturant);

		if (foundResturant == null) {
			// Obtain requireDispatcher for search_restaurant.html
			// Display appropriate message and divert the control to that HTML
			RequestDispatcher dispatcher = request.getRequestDispatcher("search_restaurant.html");
			out.println("<h2>Restaurant with given ID not found</h2>");
			dispatcher.include(request, response);
		} else {
			// Obtain requireDispatcher for next servlet:/display
			RequestDispatcher dispatcher = request.getRequestDispatcher("display");
			// Attach the Restaurant data to the current request
			request.setAttribute("searchResturant", foundResturant);
			// Forward the request to the next servlet
			dispatcher.forward(request, response);

		}

	}

}
