package example.spring.mvc.model;

public class Team {

	private String teamId;
	private String teamName;
	private int testRanking;
	private int odiRanking;
	private int t20Ranking;

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(String teamId, String teamName, int testRanking, int odiRanking, int t20Ranking) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.testRanking = testRanking;
		this.odiRanking = odiRanking;
		this.t20Ranking = t20Ranking;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTestRanking() {
		return testRanking;
	}

	public void setTestRanking(int testRanking) {
		this.testRanking = testRanking;
	}

	public int getOdiRanking() {
		return odiRanking;
	}

	public void setOdiRanking(int odiRanking) {
		this.odiRanking = odiRanking;
	}

	public int getT20Ranking() {
		return t20Ranking;
	}

	public void setT20Ranking(int t20Ranking) {
		this.t20Ranking = t20Ranking;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", testRanking=" + testRanking + ", odiRanking="
				+ odiRanking + ", t20Ranking=" + t20Ranking + "]";
	}

}
