package example.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect // Marks this class as an asspect
@Component
public class Audience {
	@Pointcut("execution(* example.spring.aop.*.perform(..))")
	public void myPointCut() {

	}

	@Before("myPointCut()")
	public void takeSeats() {

		System.out.println("Please take Seats.");
	}

	@Before("myPointCut()")

	public void turnoffMobile() {

		System.out.println("Please turnoff Mobile.");
	}

	@AfterReturning("myPointCut()")
	public void clap() {

		System.out.println("Clap Clap Clap!!");
	}

	@AfterThrowing("myPointCut()")
	public void demandRefund() {

		System.out.println("Please give my money back.");
	}

	@After("myPointCut()")
	public void leave() {

		System.out.println("Bye, leaving now.");
	}
}
