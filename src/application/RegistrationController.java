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

	public void registration(String plan, String name, int age, Long cnic, String phoneno,String password)
	{
		Registration r = new Registration();
		r.member.setmemberDetails(name, age, cnic, phoneno, password);
		r.planDescription.setPlanDescription(gym.searchPlansCatalogue(plan));
		r.payment.setpaymentDetails(r.getPlanDescription().getFee(), 0);
		r.setActiveStatus(1);
		r.setRegDate(new Date());
		//r.setRegistrationDetails(age, null, null, null);
		//r.setMemberDetail(feed,dateadded)
		//gym.Feedbacks.add(f);
	}
	public int GetFee(int regid)
	{
		int payment=0;
		for(int i= 0;i<gym.RegistrationSchedule.size();i++)
		{
			if(gym.RegistrationSchedule.get(i).getRegID()==regid)
			{
				payment=gym.RegistrationSchedule.get(i).getPayment().getAmount();
			}
		}
		return payment;
	}
	
}