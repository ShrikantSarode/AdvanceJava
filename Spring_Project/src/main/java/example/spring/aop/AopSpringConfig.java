package example.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
@EnableAspectJAutoProxy // Enables proxy generation support
public class AopSpringConfig {
	// Additonal bean configurations using

}
