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

		// capturing values of 2 request parameters : uid, pwd
		String userId = request.getParameter("uid");
		String password = request.getParameter("pwd");

		User currentUser = new User(userId,password);
		boolean valid = UserValidator.isValid(currentUser);
		String successResponse = "<h1 style='color:green'>Congratulations!!, You are IN</h1>";
		String faliureResponse = "<h1 style='color:red'>Sorry, access denied due to invalid credentials!</h1>";
		
		if(valid)
			out.println(successResponse);
		else
			out.println(faliureResponse);
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
