package example.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopExample {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopSpringConfig.class);

		Musician musicianObject = context.getBean(Musician.class);
		musicianObject.perform();
		System.out.println("======================");
		Singer singerObject = context.getBean(Singer.class);
		singerObject.perform();
		
		System.out.println("======================");
		//Printing the names of the classes of the object to which refrences musicianObject and SingerObject are refering
		System.out.println(musicianObject.getClass().getCanonicalName());
		System.out.println(singerObject.getClass().getCanonicalName());
	}
}
