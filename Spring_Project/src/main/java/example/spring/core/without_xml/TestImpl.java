package example.spring.core.without_xml;

import org.springframework.stereotype.Component;

@Component
public class TestImpl {

	public void getTestImpl() {
		System.out.println("Inside TestImpl");
	}
}
