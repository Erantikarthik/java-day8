
public class School {
	String SName;
	String SAdd;
	int fees;
	String Ranks;
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public String getSAdd() {
		return SAdd;
	}
	public void setSAdd(String sAdd) {
		SAdd = sAdd;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getRanks() {
		return Ranks;
	}
	public void setRanks(String ranks) {
		Ranks = ranks;
	}
	public String getHighestRank() {
		return HighestRank;
	}
	public void setHighestRank(String highestRank) {
		HighestRank = highestRank;
	}
	@Override
	public String toString() {
		return "School [SName=" + SName + ", SAdd=" + SAdd + ", fees=" + fees + ", Ranks=" + Ranks + ", HighestRank="
				+ HighestRank + "]";
	}
	public School(String sName, String sAdd, int fees, String ranks, String highestRank) {
		super();
		SName = sName;
		SAdd = sAdd;
		this.fees = fees;
		Ranks = ranks;
		HighestRank = highestRank;
	}
	String HighestRank;

}
