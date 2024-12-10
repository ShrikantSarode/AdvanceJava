package example.hibernate.bean;

public class ActorData {
	private String myFirstName;
	private int myAge;

	public ActorData() {

	}

	public ActorData(String myFirstName, int myAge) {
		super();
		this.myFirstName = myFirstName;
		this.myAge = myAge;
	}

	public String getMyFirstName() {
		return myFirstName;
	}

	public void setMyFirstName(String myFirstName) {
		this.myFirstName = myFirstName;
	}

	public int getMyAge() {
		return myAge;
	}

	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}

	@Override
	public String toString() {
		return "ActorData [myFirstName=" + myFirstName + ", myAge=" + myAge + "]";
	}

}
