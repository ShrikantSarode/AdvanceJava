package example.bean;

public class UserValidator {

	public static boolean isValid(User userObject) {

		boolean result = false;
		String currentUserId = userObject.getUserName();
		String currentPassword = userObject.getPassword();

		if (currentUserId.equals("admin") && currentPassword.equals("admin"))

			result = true;
		return result;

	}
}
