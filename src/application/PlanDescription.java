package application;

public class PlanDescription {
	int planID;
	String Description;//Description of the offer e.g weekly monthly yearly
	int fee;
	public int getPlanID() {
		return planID;
	}
	public void setPlanID(int planID) {
		this.planID = planID;
	}
	public void setPlan(PlanDescription a)
	{
		this.Description=a.Description;
		this.fee=a.fee;
		this.planID=a.planID;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public void setPlan(int planid,String description,int fee)
	{
		Description = description;
		this.fee = fee;
		this.planID = planid;
		
	}
	
}
