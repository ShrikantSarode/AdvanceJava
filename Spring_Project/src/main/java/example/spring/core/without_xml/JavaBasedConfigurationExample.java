package example.spring.core.without_xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigurationExample {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		// Registering the configuration unit:SpringConfig with 'context'
		context.register(SpringConfig.class);
		// Refreshing the context to apply the changes
		context.refresh();
		Object loadedobject = context.getBean("getGreetingImpl");
		GreetingImpL gi = (GreetingImpL) loadedobject;
		gi.doGreet();
	}
}
