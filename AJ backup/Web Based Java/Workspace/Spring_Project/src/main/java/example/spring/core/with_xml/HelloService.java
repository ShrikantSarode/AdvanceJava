package example.spring.core.with_xml;

public class HelloService implements GreetingService {

	@Override
	public String sayGreeting() {

		return "Hello from Spring";
	}
	
}
