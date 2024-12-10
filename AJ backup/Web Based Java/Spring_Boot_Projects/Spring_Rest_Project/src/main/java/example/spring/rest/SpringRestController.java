package example.spring.rest;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	//Combines @Controller and @ResponseBody
public class SpringRestController {
	@GetMapping("/doGreet")
	public String getGreetingData() {
		return "Hi all, Welcome to REST..."; // Returning a view name
	}
	@GetMapping("/showGreeting")
	public Greeting getOneGreeting() {
		Greeting greetingObject = 
				new Greeting("Happy New Year", LocalDate.of(2025, 01, 01));
		return greetingObject;
	}
	@GetMapping("/showAllGreetings")
	public Collection<Greeting> getAllGreetings() {
		Greeting greetingsObject1 = 
				new Greeting("Happy New Year", LocalDate.of(2025, 01, 01));
		Greeting greetingsObject2 = 
				new Greeting("Bye Bye 2024", LocalDate.of(2024, 12, 31));
		Greeting greetingsObject3 = 
				new Greeting("Merry Christmas", LocalDate.of(2024, 12, 25));
		Collection<Greeting> allGreetings = 
				Arrays.asList(greetingsObject1,greetingsObject2,greetingsObject3);
		return allGreetings;
	}
}
