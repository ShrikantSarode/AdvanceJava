package example.spring.mvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class SpringWebApplicationInitializer implements WebApplicationInitializer {
//This class is used to configure DispatcherServlet in such a way that if accepts all the incoming requests.
	private WebApplicationContext getWebApplicationContext() {
		AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
		webCtx.setConfigLocation("example");
		return webCtx;

	}

	@Override
	public void onStartup(ServletContext ctx) throws ServletException {
		WebApplicationContext webAppctx = getWebApplicationContext();
		// Building the object of Dispatcher servlet based upon webAppCtx

		DispatcherServlet frontController = new DispatcherServlet(webAppctx);
		ServletRegistration.Dynamic registration = ctx.addServlet("myFrontController", frontController);

		// COnfuiguring FrontController servlet that accepts

		registration.addMapping("/");
	}

}
