package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectionExample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config1.xml");
		Object loadedObject = context.getBean("myProfile");
		System.out.println(loadedObject );
		
	}

}
