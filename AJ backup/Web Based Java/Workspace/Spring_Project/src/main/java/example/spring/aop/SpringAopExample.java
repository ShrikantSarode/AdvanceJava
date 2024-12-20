package example.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopExample {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AopSpringConfig.class);
		Musician musicianObj = ctx.getBean(Musician.class);
		musicianObj.perform();
		System.out.println("------------------------------");
		Singer singerObj = ctx.getBean(Singer.class);
		singerObj.perform();
		System.out.println("------------------------------");
		/*Printing the names of the classes of the object to which
		 * references musicianObj and singerObj are referring.
		 */
		System.out.println(musicianObj.getClass().getName());
		System.out.println(singerObj.getClass().getName());
	}    
}
