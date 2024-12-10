package example.spring.core.with_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterAndConstructorInjectionExample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Object loadedObject = context.getBean("userBean");
		GreetingService gs = (GreetingService) loadedObject;
		System.out.println(gs.sayGreeting());
		System.out.println("-------------------------------");
		loadedObject = context.getBean("userBean2");
		gs = (GreetingService) loadedObject;
		System.out.println(gs.sayGreeting());
	}

}
