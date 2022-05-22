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
				payment=gym.RegistrationSchedule.get(i).getPayment().getAmount();
			}
		}
		return payment;
	}

}

