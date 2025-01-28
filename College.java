
public class College {
	String CName;
	String CAdd;
	int fees;
	String Placements;
	String Highestpaid;
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public String getCAdd() {
		return CAdd;
	}
	public void setCAdd(String cAdd) {
		CAdd = cAdd;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getPlacements() {
		return Placements;
	}
	public void setPlacements(String placements) {
		Placements = placements;
	}
	public String getHighestpaid() {
		return Highestpaid;
	}
	public void setHighestpaid(String highestpaid) {
		Highestpaid = highestpaid;
	}
	@Override
	public String toString() {
		return "College [CName=" + CName + ", CAdd=" + CAdd + ", fees=" + fees + ", Placements=" + Placements
				+ ", Highestpaid=" + Highestpaid + "]";
	}
	public College(String cName, String cAdd, int fees, String placements, String highestpaid) {
		super();
		CName = cName;
		CAdd = cAdd;
		this.fees = fees;
		Placements = placements;
		Highestpaid = highestpaid;
	}

}
