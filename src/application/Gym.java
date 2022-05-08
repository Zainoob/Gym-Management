package application;

import java.util.ArrayList;
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
