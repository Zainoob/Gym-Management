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
    DBHandler ins = new DBHandler();
		ins.RegistationDBHandler(r);
		//r.setRegistrationDetails(1, r.payment, r.planDescription);
		gym.RegistrationSchedule.add(r);
	}
	public int updateregistration(String plan, int regid)
	{
		int check=0;
		for(int i=0;i<gym.RegistrationSchedule.size();i++)
		{
			if(gym.RegistrationSchedule.get(i).getRegID()==regid)
			{
				
				gym.RegistrationSchedule.get(i).getPlanDescription().updatePlanDescription(gym.searchPlansCatalogue(plan));
				check=1;
			}
		}
		return check;
	}
	public int cancelregistration(String phonenumber, int regid)
	{
		int check=0;
		for(int i=0;i<gym.RegistrationSchedule.size();i++)
		{
			if((gym.RegistrationSchedule.get(i).getRegID()==regid) && gym.RegistrationSchedule.get(i).member.getPhoneNo().compareTo(phonenumber)==0)
			{
				if(gym.RegistrationSchedule.get(i).getPayment().getPaidStatus()!=0)
				{
					gym.RegistrationSchedule.get(i).setActiveStatus(0);
					check=1;
				}
				else
				{
					check=-1;
				}
			}
		}
		return check;
	}
	
	
}