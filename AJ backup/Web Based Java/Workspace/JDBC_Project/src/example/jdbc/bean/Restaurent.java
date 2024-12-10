package example.jdbc.bean;

public class Restaurent {
	private int restaurentId;
	private String name;
	private String cuisine;
	private int branchCount;
	public Restaurent() {
		
	}
	public Restaurent(int restaurentId, String name, String cuisine, int branchCount) {
		super();
		this.restaurentId = restaurentId;
		this.name = name;
		this.cuisine = cuisine;
		this.branchCount = branchCount;
	}
	public int getRestaurentId() {
		return restaurentId;
	}
	public void setRestaurentId(int restaurentId) {
		this.restaurentId = restaurentId;
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
		return "Restaurent [restaurentId=" + restaurentId + ", name=" + name + ", cuisine=" + cuisine + ", branchCount="
				+ branchCount + "]";
	}
}
