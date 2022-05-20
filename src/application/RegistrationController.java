package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegistrationController
{
	private static Gym gym;

	public RegistrationController() 
	{
		gym = gym.getInstance();
	}

	public void registration(String plan, String name, int age, long cnic, String phoneno,String password)
	{
		Registration r = new Registration();
		r.setMemberDetails(name, age, cnic, phoneno, password);
		
		//r.setRegistrationDetails(age, null, null, null);
		//r.setMemberDetail(feed,dateadded)
		//gym.Feedbacks.add(f);
	}
	
}