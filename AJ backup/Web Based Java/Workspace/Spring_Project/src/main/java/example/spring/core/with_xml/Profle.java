package example.spring.core.with_xml;

public class Profle {
	private int candidateId;
	private String name;
	private ContactInfo contactDetails;
	private EducationInfo educationDetails;

	public Profle() {

	}

	public Profle(int candidateId, String name, ContactInfo contactDetails, EducationInfo educationDetails) {
		super();
		this.candidateId = candidateId;
		this.name = name;
		this.contactDetails = contactDetails;
		this.educationDetails = educationDetails;
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ContactInfo getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactInfo contactDetails) {
		this.contactDetails = contactDetails;
	}

	public EducationInfo getEducationDetails() {
		return educationDetails;
	}

	public void setEducationDetails(EducationInfo educationDetails) {
		this.educationDetails = educationDetails;
	}

	@Override
	public String toString() {
		return "Profle [candidateId=" + candidateId + ", name=" + name + ", contactDetails=" + contactDetails
				+ ", educationDetails=" + educationDetails + "]";
	}

}
