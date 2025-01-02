package example.spring.core.with_xml;

public class ContactInfo{
	private String mobileNo;
	private String emailAddress;

	public ContactInfo() {

	}

	public ContactInfo(String mobileNo, String emailAddress) {
		super();
		this.mobileNo = mobileNo;
		this.emailAddress = emailAddress;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "ContactInfo [mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + "]";
	}

}