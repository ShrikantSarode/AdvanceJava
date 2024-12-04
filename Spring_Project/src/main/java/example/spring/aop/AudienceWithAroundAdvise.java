package example.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect // Marks this class as an aspect
@Component
public class AudienceWithAroundAdvise {
	@Pointcut("execution(* example.spring.aop.*.perform(..))")
	private void myPointCut() {
	}

	private void takeSeats() {

		System.out.println("Please take Seats.:around");
	}

	private void turnoffMobile() {

		System.out.println("Please turnoff Mobile.:around");
	}

	private void clap() {

		System.out.println("Clap Clap Clap!! :around");
	}

	private void demandRefund() {

		System.out.println("Please give my money back. :around");
	}

	private void leave() {

		System.out.println("Bye, leaving now. :around");
	}

	@Around("myPointCut()")
	public void monitorPerformance(ProceedingJoinPoint joinpoint) {

		try {
			takeSeats();
			turnoffMobile();
			joinpoint.proceed();// Used to proceed towards target
			clap();
		} catch (Throwable e) {
			demandRefund();

//            e.printStackTrace();
		} // used to produce towards the target

		leave();

	}
}