package application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBHandler
{
	private static Gym gym = null;
	
	public DBHandler()
	{
		gym = gym.getInstance();
	}
	
	/*public void Initialize() {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	}*/
	
	public void FeedbackDBHandler(Feedback obj)
	{
		//Saving Feedback Object to DB
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
		
		session.close();
	}
	
	public void MemberDBHandler(Member obj)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
	
		
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
		
		session.close();
		factory.close();
	}
	
}