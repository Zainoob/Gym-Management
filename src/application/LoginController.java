package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoginController
{
	private static Gym gym;

	public LoginController() 
	{
		gym = gym.getInstance();
	}

	public void feedback(String feed, Date dateadded)
	{
		Feedback f = new Feedback();
		f.setFeedback(feed,dateadded);
		gym.Feedbacks.add(f);
	}
}