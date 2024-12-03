package example.spring.core.without_xml.auto_wiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@Primary
public class AppStringConfig {
//Configuration of 3 beans: Engine, MusicSystem and Car
	@Bean("carEngine")
	public Engine getEngine() {
		Engine eng = new Engine("3600 CC", "Petrol");

		return eng;
	}

	@Bean("carMusicSytem")
	public MusicSystem getMusicSystem()// Setter Injection
	{
		MusicSystem ms = new MusicSystem();
		ms.setMake("Harman Kardan");
		ms.setSound("Dolby");
		return ms;
	}

	@Bean("myCar")
	public Car getCar() {
		Car myCar = new Car();
		myCar.setMake("BMW");
		myCar.setModel("Series7");
		myCar.setPrice(700000);
		return myCar;
	}
}
