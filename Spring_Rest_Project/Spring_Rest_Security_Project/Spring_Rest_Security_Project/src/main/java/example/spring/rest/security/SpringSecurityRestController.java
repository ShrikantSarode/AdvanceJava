package example.spring.rest.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityRestController {

	@RequestMapping("/doGreet") // This resource does not need security
	public String getGreeting() {
		return "Jay Shree Ram";

	}

	// This resource is accessible only to ADMIN users
	@GetMapping("/doAdminWork")
	public String doAdminWork() {
		return "Doing Admin Work";
	}

	// This resource is accessible to ADMIN as well as Regular user
	@GetMapping("/doRegularWork")
	public String doRegularWork() {
		return "Doing Regular Work";
	}
}