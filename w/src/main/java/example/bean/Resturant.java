package example.bean;

public class Resturant {
	private Integer resturantId;
	private String name;
	private String cuisine;
	private int branchCount;

	public Resturant() {

	}

	public Resturant(Integer resturantId, String name, String cuisine, int branchCount) {
		super();
		this.resturantId = resturantId;
		this.name = name;
		this.cuisine = cuisine;
		this.branchCount = branchCount;
	}

	public Integer getResturantId() {
		return resturantId;
	}

	public void setResturantId(Integer resturantId) {
		this.resturantId = resturantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public int getBranchCount() {
		return branchCount;
	}

	public void setBranchCount(int branchCount) {
		this.branchCount = branchCount;
	}

	@Override
	public String toString() {
		return "Resturant [resturantId=" + resturantId + ", name=" + name + ", cuisine=" + cuisine + ", branchCount="
				+ branchCount + "]";
	}

}
