package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class PlanDescription {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Sr;
	
	@OneToOne(mappedBy = "planDescription")
	private Registration registration;
	
	int planID;
	String Description;//Description of the offer e.g weekly monthly yearly
	int fee;
	
	
	public Registration getRegistration() {
		return registration;
	}
	public void setRegistration(Registration registration) {
		this.registration = registration;
	}
	
	public int getSr() {
		return Sr;
	}
	public void setSr(int sr) {
		Sr = sr;
	}
	
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
	
	public void setPlanDescription(PlanDescription description)
	{
		this.fee=description.fee;
		this.planID = description.planID;	
		this.Description=description.Description;
		/*DBHandler ins = new DBHandler();
		ins.PlanDescriptionDBHandler(description);*/
	}
	public void updatePlanDescription(PlanDescription description)
	{
		this.fee=description.fee;
		this.planID = description.planID;	
		this.Description=description.Description;
		DBHandler ins = new DBHandler();
		ins.UpdatePlanDescriptionDBHandler(description);
	}
	
}
