package example.spring.mvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class SpringMvcApplicationInitializer implements WebApplicationInitializer {

	private WebApplicationContext getWebApplicationContext() {
		AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
		webCtx.setConfigLocation("example");
		return webCtx;
	}

	@Override
	public void onStartup(ServletContext ctx) throws ServletException {
		System.out.println("Application is being started...");
		WebApplicationContext webAppCtx = getWebApplicationContext();
		DispatcherServlet frontController = new DispatcherServlet(webAppCtx);
		
		ServletRegistration.Dynamic registration = 
				ctx.addServlet("myFrontController", frontController);
		registration.addMapping("/");
	}

}
