package example.spring.rest;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Combines @Controller and @RespomseBody
public class SpringRestController {

	@GetMapping("/doGreet")
	public String getGreetingData() {
		return "Jay Shree Ram";
	}

	@GetMapping("/showGreetings")
	public Greeting getOneGreeting() {
		Greeting greetingObject = new Greeting("Happy New Year", LocalDate.of(2021, 1, 1));
		return greetingObject;
	}

	@GetMapping("/showAllGreetings")
	public Collection<Greeting> getAllGreeting() {
		Greeting greetingObject1 = new Greeting("Happy New Year", LocalDate.of(2021, 1, 1));

		Greeting greetingObject2 = new Greeting("Merry Chrismas", LocalDate.of(2021, 1, 1));

		Greeting greetingObject3 = new Greeting("Happy Diwali", LocalDate.of(2021, 1, 1));

		Collection<Greeting> allGreetings = Arrays.asList(greetingObject1, greetingObject2, greetingObject3);

		return allGreetings;

	}

}
