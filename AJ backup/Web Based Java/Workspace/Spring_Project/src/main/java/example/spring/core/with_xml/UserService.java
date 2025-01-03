package example.spring.core.with_xml;

public class UserService implements GreetingService {
	private String userName;
	private int userAge;

	public UserService() {
		System.out.println("Inside User Service");
	}
	
	public UserService(String userName, int userAge) {
		System.out.println("Inside user service(String, int)");
		this.userName = userName;
		this.userAge = userAge;
	}

	public UserService(int userAge, String userName) {
		System.out.println("Inside user service(int, String)");
		this.userAge = userAge;
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("Setting user name...");
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		System.out.println("Setting user age...");
		this.userAge = userAge;
	}

	@Override
	public String sayGreeting() {
		String message = "Hey " + userName + ", your age is " + userAge + " years.";
		return message; 
	}
}
