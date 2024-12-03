package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSimpleExample2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context;
		String fileName = "springConfig.xml";
		context = new ClassPathXmlApplicationContext(fileName);
		Object loadedObject = context.getBean("myBean");
		GreetingService gs = (GreetingService) loadedObject;
		String reply = gs.sayGreeting();
		System.out.println(reply);

	}

}
