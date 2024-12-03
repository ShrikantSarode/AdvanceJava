package example.spring.core.without_xml.auto_wiring;

public class MusicSystem {

	private String make;
	private String sound;

	public MusicSystem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MusicSystem(String make, String sound) {
		super();
		this.make = make;
		this.sound = sound;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	@Override
	public String toString() {
		return "MusicSystem [make=" + make + ", sound=" + sound + "]";
	}

}
