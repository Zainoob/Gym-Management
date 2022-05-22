package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Gym {
	int GymID;
	String Address;
	String name;
	int PhoneNo;
	Ledger ledger;
	List<Trainer> trainers=new ArrayList<Trainer>();
    List<Registration> RegistrationSchedule=new ArrayList<Registration>();
    List<PlanDescription> PlansCatalogue=new ArrayList<PlanDescription>();
    List<Feedback> Feedbacks=new ArrayList<Feedback>();
    //List<Member> Members = new ArrayList<Member>();
    
    private static Gym gym = null; 
    private Gym() {
	}
	public synchronized static Gym getInstance()
    {
        if (gym == null) {
        	gym = new Gym();
        	gym.loadPlansCatalogues();
        }
        return gym;
    }
	
	
	
	public int getGymID() {
		return GymID;
	}
	public void setGymID(int gymID) {
		GymID = gymID;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		PhoneNo = phoneNo;
	}
	public Ledger getLedger() {
		return ledger;
	}
	public void setLedger(Ledger ledger) {
		this.ledger = ledger;
	}
	public List<Trainer> getTrainers() {
		return trainers;
	}
	public void setTrainers(List<Trainer> trainers) {
		this.trainers = trainers;
	}
	public List<Registration> getRegistrationSchedule() {
		return RegistrationSchedule;
	}
	public void setRegistrationSchedule(List<Registration> registrationSchedule) {
		RegistrationSchedule = registrationSchedule;
	}
	public List<PlanDescription> getPlansCatalogue() {
		return PlansCatalogue;
	}
	public void setPlansCatalogue(List<PlanDescription> plansCatalogue) {
		PlansCatalogue = plansCatalogue;
	}
	public List<Feedback> getFeedbacks() {
		return Feedbacks;
	}
	public void setFeedbacks(List<Feedback> feedbacks) {
		Feedbacks = feedbacks;
	}
	public static Gym getGym() {
		return gym;
	}
	public static void setGym(Gym gym) {
		Gym.gym = gym;
	}
	public void loadPlansCatalogues()
	{
		PlanDescription a=new PlanDescription();
		a.setPlan(1, "Basic", 2000);
		PlanDescription b=new PlanDescription();
		b.setPlan(2, "Standard", 3000);
		PlanDescription c=new PlanDescription();
		c.setPlan(3, "Premium", 3500);
		PlansCatalogue.add(a);
		PlansCatalogue.add(b);
		PlansCatalogue.add(c);
	}
	public PlanDescription searchPlansCatalogue(String des)
	{
		PlanDescription a=new PlanDescription();
		for(int i=0;i<PlansCatalogue.size();i++)
		{
			if(PlansCatalogue.get(i).getDescription().compareTo(des)==0)
			{
				a=PlansCatalogue.get(i);
			}
		}
		return a;
	}
	
}
