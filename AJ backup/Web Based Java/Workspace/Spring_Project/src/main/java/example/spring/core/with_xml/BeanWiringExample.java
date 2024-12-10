package example.spring.core.with_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanWiringExample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config2.xml");
		Object customerObject = context.getBean("myCustomer");
		System.out.println(customerObject);

	}

}
