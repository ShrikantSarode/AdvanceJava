package example.spring.core.with_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionAssignment {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring-config4.xml");
		Object profileObject = context.getBean("myProfile");
		System.out.println(profileObject);

	}

}
