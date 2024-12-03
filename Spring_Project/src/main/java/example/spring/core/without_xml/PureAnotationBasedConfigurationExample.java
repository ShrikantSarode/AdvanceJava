package example.spring.core.without_xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import another.AnotherTestComponent;
import third.ThirdComponent;
import third.last.FinalTestComponent;
import third.last.LastTestComponent;

public class PureAnotationBasedConfigurationExample {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		TestComponent testComp = context.getBean(TestComponent.class);
		testComp.doTest();
		System.out.println("---------------------------");
		AnotherTestComponent anotherTestComp = context.getBean(AnotherTestComponent.class);
		anotherTestComp.doTest();
		System.out.println("---------------------------");
		ThirdComponent thirdComp = context.getBean(ThirdComponent.class);
		thirdComp.doTest();
		System.out.println("---------------------------");
		LastTestComponent lastComp = context.getBean(LastTestComponent.class);
		lastComp.doTest();

		System.out.println("======================");
		Object loadedObject = context.getBean("myFinalComp");
		FinalTestComponent finalComp = (FinalTestComponent) loadedObject;
		finalComp.doTest();

		// Proper retrieval of FinalTestComponent
		FinalTestComponent finalComp2 = context.getBean(FinalTestComponent.class);
		finalComp2.doTest();

//		FinalTestComponent finalComp2 = context.getBean(FinalTestComponent.class);
//		finalComp2.doTest();
//		
	}

}
