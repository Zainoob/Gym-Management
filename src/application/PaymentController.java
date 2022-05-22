package application;

import java.util.Date;

public class PaymentController {
	private static Gym gym;

	public PaymentController () 
	{
		gym = gym.getInstance();
	}

	public int GetFee(int regid)
	{
		int payment=0;
		for(int i= 0;i<gym.RegistrationSchedule.size();i++)
		{
			if(gym.RegistrationSchedule.get(i).getRegID()==regid)
			{
				if (gym.RegistrationSchedule.get(i).payment.paidStatus != 1)
				{	
					payment=gym.RegistrationSchedule.get(i).getPayment().getAmount();
				}
				else
				{payment=-1;}
			}
		}
		
		return payment;
	}
	
	public void Paid(int regid) 
	{
		int check = 0;
		for (int i=0; i<gym.RegistrationSchedule.size();i++)
		{
			if (gym.RegistrationSchedule.get(i).getRegID()==regid)
			{
				DBHandler ins = new DBHandler();
				ins.PaymentMadeDBHandler(gym.RegistrationSchedule.get(i).getPayment().getPaymentID());
				gym.RegistrationSchedule.get(i).payment.setPaidStatus(1);
			}
		}
	}

}

