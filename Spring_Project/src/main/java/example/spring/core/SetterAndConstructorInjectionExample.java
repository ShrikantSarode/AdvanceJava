package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterAndConstructorInjectionExample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		Object loadedObject = context.getBean("myProfile");
		GreetingService gs = (GreetingService) loadedObject;
		String reply = gs.sayGreeting();
		System.out.println(reply);

	}
}
