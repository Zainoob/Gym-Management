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
	
	public int validateUser(String username,String password)
	{
		DBHandler db=new DBHandler();
		int id=0;
		List<Member> list=db.FetchAllMembers(); 
		for(int i=0;i<list.size();i++)
		{
			if(username.compareTo(list.get(i).getName())==0 && password.compareTo(list.get(i).getPassword())==0)
			{
				id= list.get(i).getMemberID();
			}
		}
		return id;
	}
}