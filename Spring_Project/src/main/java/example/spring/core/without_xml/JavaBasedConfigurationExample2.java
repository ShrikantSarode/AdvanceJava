package example.spring.core.without_xml;

import java.util.Collection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigurationExample2 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Object loadedObject = context.getBean("myMessage");
		MessageImpl mi = (MessageImpl) loadedObject;
		mi.printMessage("Welcome", "Rakhi Sawant");
		System.out.println("======================");

		loadedObject = context.getBean("allCourses");
		Collection<String> allAvailableCourses = (Collection<String>) loadedObject;
		allAvailableCourses.stream().forEach(course -> System.out.println(course.toUpperCase()));

		
		
	}

}
