package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLoadingExample {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config3.xml");
//		Object loadedObject = context.getBean("bean1");

		context.getBean("bean2");

	}

}
