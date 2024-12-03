package example.spring.core.without_xml.auto_wiring;

public class Engine {

	private String power;
	private String fuelType;

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engine(String power, String fuelType) {
		super();
		this.power = power;
		this.fuelType = fuelType;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Engine [power=" + power + ", fuelType=" + fuelType + "]";
	}

}
