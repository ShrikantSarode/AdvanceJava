package example.spring.rest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//Combines @Controller and @ResponseBody   
public class SpringRestController {
		@GetMapping("/doGreet")
		public String getGreetingData() {
//				return "Jay Shree Ram";
				return "Har Har Mahadev";
		}
		
		@GetMapping("/showGreeting")
		public Greeting getOneGreeting() {
			Greeting greetingObject = new Greeting("Shubh Navvarsh",LocalDate.of(2025, 1, 1));
			return greetingObject;
		}
		
		
		@GetMapping("/showAllGreetings")
		public Collection<Greeting> getAllGreetings(){
			Greeting greetingObject1 = new Greeting("Shubh Navvarsh",LocalDate.of(2025, 1, 1));
			Greeting greetingObject2 = new Greeting("Chala ja",LocalDate.of(2024, 12, 31));
			Greeting greetingObject3 = new Greeting("Santa budha",LocalDate.of(2024, 1, 1));
			
			Collection<Greeting> allGreetings = Arrays.asList(greetingObject1,greetingObject2,greetingObject3);
			return allGreetings;
		}
}
