package example.spring.core.without_xml;

import java.util.Collection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigurationExample2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Object loadedObject = context.getBean("myMessage");
		MessageImpl mi = (MessageImpl) loadedObject;
		mi.printMessage("Welcome", "dipali..!");
		System.out.println("-------------------");
		loadedObject = context.getBean("allCourses");
		Collection<String> allAvailableCourses = (Collection<String>)loadedObject;
		allAvailableCourses.stream();
		for (String courses : allAvailableCourses) {
			System.out.println(courses.toUpperCase());
		}
		System.out.println("--------------------------");
		Object obj = context.getBean("myTest");
		Object obj2 = context.getBean("myTest");
		System.out.println("Same Object ? " + (obj == obj2));
	}

}
