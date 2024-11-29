package example.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HitConterServlet
 */
@WebServlet("/counter")
public class HitConterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Get session object and check if it's a new session
		HttpSession session = request.getSession();
		boolean newSession = session.isNew();

		// Initialize countValue
		int countValue = 0;

		// If session is new, start counter at 1
		if (newSession) {
			countValue = 1;
		} else {
			// If session exists, retrieve and increment the counter value
			Integer currentCount = (Integer) session.getAttribute("counterValue");
			// If no counter exists in the session, initialize it to 0
			if (currentCount == null) {
				currentCount = 0;
			}
			countValue = currentCount + 1;
		}

		// Store updated counter value in session
		session.setAttribute("counterValue", countValue);

		// Include Counter.html content
		RequestDispatcher dispatcher = request.getRequestDispatcher("Counter.html");

		// Print the hit count to the response
		out.println("<h1>Hit Count: " + countValue + "</h1>");
		dispatcher.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Call doGet to handle POST requests the same way as GET requests
		doGet(request, response);
	}
}
