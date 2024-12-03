package example.spring.core.without_xml.auto_wiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoWiringExample {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppStringConfig.class);
		Object carObject = context.getBean("myCar");
		System.out.println(carObject);
	}
}
