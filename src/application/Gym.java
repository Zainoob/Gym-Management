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
	
}
