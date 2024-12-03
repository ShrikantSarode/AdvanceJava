package example.spring.core;

public class Customer {

	private String name;
	private String email;
	private Address permanateAddress;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String email, Address permanateAddress) {
		super();
		this.name = name;
		this.email = email;
		this.permanateAddress = permanateAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getPermanateAddress() {
		return permanateAddress;
	}

	public void setPermanateAddress(Address permanateAddress) {
		this.permanateAddress = permanateAddress;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", permanateAddress=" + permanateAddress + "]";
	}

}
