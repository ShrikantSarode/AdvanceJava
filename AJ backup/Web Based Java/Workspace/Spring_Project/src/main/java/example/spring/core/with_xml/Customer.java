package example.spring.core.with_xml;

public class Customer {
	private String name;
	private String email;
	private Address permanentAddress;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String email, Address permanentAddress) {
		super();
		this.name = name;
		this.email = email;
		this.permanentAddress = permanentAddress;
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

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", permanentAddress=" + permanentAddress + "]";
	}

}
