package example.spring.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {
	/*
	 * This class is used to configure the application in order to acquire Spring
	 * MVC capabilities and also a View Resolver.
	 */

	@Bean
	public ViewResolver getViewResolver() {
		System.out.println("Configuring View Resolver...");
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		String prefix = "/WEB-INF/views/";
		String suffix = ".jsp";
		viewResolver.setPrefix(prefix);
		viewResolver.setSuffix(suffix);
		return viewResolver;
	}

}
