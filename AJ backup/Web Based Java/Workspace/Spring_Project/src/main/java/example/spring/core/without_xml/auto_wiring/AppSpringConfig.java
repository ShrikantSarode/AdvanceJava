package example.spring.core.without_xml.auto_wiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppSpringConfig {
	//Configuration of 3beans : Engine, MusicSystem, Car
	@Bean("carEngine")
	public Engine getEngine() {
		Engine eng = new Engine("1400 CC", "Diesel");
		return eng;
	}
	@Bean("carSuperEngine")
//	@Primary
	public Engine getSuperEngine() {
		Engine eng = new Engine("1800 CC", "Petrol");
		return eng;
	}
	@Bean("carMusicSystem")
	public MusicSystem getMusicSystem() {
		MusicSystem ms = new MusicSystem();
		ms.setMake("Sony");
		ms.setSoundEffect("Dolby");
		return ms;
	}
	@Bean("myCar")
	public Car getMyCar() {
		Car myCar = new Car();
		myCar.setMake("Mahindra");
		myCar.setModel("Bolero Neo");
		myCar.setPrice(1400000);
		return myCar;
		/*Did not set values for engineDetails and musicSystemDetails
		 * properties because they will get auto wired 
		 */
	}
}
