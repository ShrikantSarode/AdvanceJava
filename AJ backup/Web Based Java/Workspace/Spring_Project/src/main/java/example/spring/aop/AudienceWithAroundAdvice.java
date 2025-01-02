package example.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect // Marks this class as an Aspect.
@Component
public class AudienceWithAroundAdvice {
	@Pointcut("execution(* example.spring.aop.*.perform(..))")
	private void myPointCut() {
	}

	private void takeSeat() {
		System.out.println("Please take your Seats... : Around");
	}

	private void turnOffMobile() {
		System.out.println("Please turn off your mobiles... : Around");
	}

	private void clap() {
		System.out.println("Clap Clap Clap... : Around");
	}

	private void demandForRefund() {
		System.out.println("Please give my money back... : Around");
	}

	private void leave() {
		System.out.println("Bye, leaving now..! : Around");
	}

	@Around("myPointCut()")
	public void monitorPerformance(ProceedingJoinPoint joinPoint) {
		try {
			takeSeat();
			turnOffMobile();
			joinPoint.proceed(); // Used to proceed towards target
			clap();
		} catch (Throwable e) {
			demandForRefund();
		}
		leave();
	}
}