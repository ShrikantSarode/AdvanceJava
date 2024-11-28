package example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.bean.User;
import example.bean.UserValidator;

/**
 * Servlet implementation class UserValidationServlet
 */

@WebServlet("/doValidate")
public class UserValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// capturing values of 2 request parameters:uid & pwd
		String userId = request.getParameter("uid");
		String password = request.getParameter("pwd");

		// creating a User obj based upon userId and password
		User currentUser = new User(userId, password);
		boolean valid = UserValidator.isValid(currentUser);

		String successResponse = "<h1 style='color:green'>Congratulations!!, You are In</h1>";

		String failureResponse = "<h1 style='color:red'>Sorry, access denied due to invalid creadential😱</h1>";

		if (userId.equals("admin") && password.equals("admin"))
			out.println(successResponse);
		else
			out.println(failureResponse);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
