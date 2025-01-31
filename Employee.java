
public class Employee {
	String EName;
    int Eid;
    String Add;
    int Mobile;
	public Employee(String eName, int eid, String add, int mobile) {
		super();
		EName = eName;
		Eid = eid;
		Add = add;
		Mobile = mobile;
	}
	@Override
	public String toString() {
		return "Employee [EName=" + EName + ", Eid=" + Eid + ", Add=" + Add + ", Mobile=" + Mobile + "]";
	}
	public String getEName() {
		return EName;
	}
	public void setEName(String eName) {
		EName = eName;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	}
	public int getMobile() {
		return Mobile;
	}
	public void setMobile(int mobile) {
		Mobile = mobile;
	}
}