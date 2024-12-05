package example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Marks this class as a Controller of Spring MVC Application
public class SpringMvcController {
	@RequestMapping("/doGreet") // Providing mapping between the URL and view
	public String getIndexPage() {
		System.out.println("Inside getIndexPage()");
		return "index"; // Returning a view name
	}
}