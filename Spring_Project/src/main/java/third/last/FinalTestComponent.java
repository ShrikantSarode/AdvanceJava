package third.last;

import org.springframework.stereotype.Component;

//Assigning an ID : myFinalComp to these component so that it can be 
//access using same
@Component("myFinalComp")
public class FinalTestComponent {
	public void doTest() {
		System.out.println("FinalTestComponent test suceeded...");
	}
}
