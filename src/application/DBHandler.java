package application;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Query;
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
	
	public void Initialize() 
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
	  	Session session = factory.openSession();
		String query = "from Registration";
		Query q=session.createQuery(query);
		List<Registration> list=q.list(); 
		gym.RegistrationSchedule = q.list();
	}
	
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
	public List FetchMemberProfile(int id)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String query = "from Member m where m.memberID = "+String.valueOf(id);
		Query q=session.createQuery(query);
		List<Member> list=q.list(); 
		return q.list();
	}
	public List FetchAllMembers()
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String query = "from Member";
		Query q=session.createQuery(query);
		List<Member> list=q.list(); 
		return q.list();
	}
	public List FetchAllFeedback()
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String query = "from Feedback";
		Query q=session.createQuery(query);
		List<Member> list=q.list(); 
		return q.list();
	}
	public List FetchAllPayments()
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String query = "from Payment";
		Query q=session.createQuery(query);
		List<Member> list=q.list(); 
		return q.list();
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
	public void RegistationDBHandler(Registration obj)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
	
		
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
		
		session.close();
		factory.close();
	}
	
	public void PlanDescriptionDBHandler(PlanDescription obj)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
		
		session.close();
		factory.close();
	}
	
	public void UpdatePlanDescriptionDBHandler(PlanDescription obj)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
	
		session.beginTransaction();
		Query q = session.createQuery("update PlanDescription set fee=:newFee,planID=:newID,Description=:newDesc");
		q.setParameter("newFee", obj.fee);
		q.setParameter("newID", obj.planID);
		q.setParameter("newDesc", obj.Description);
		int r = q.executeUpdate();
		session.getTransaction().commit();
		
		session.close();
		factory.close();
	}
	
	public void PaymentDBHandler(Payment obj)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
	
		
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
		
		session.close();
		factory.close();
	}
	
	public void PaymentMadeDBHandler(int id)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		
		session.beginTransaction();
		Query q = session.createQuery("update Payment set datePaid=:newDate,paidStatus=:newStatus where paymentID=:p");
		q.setParameter("newDate", LocalDate.now());
		q.setParameter("newStatus", 1);
		q.setParameter("p", id);
		int r = q.executeUpdate();
		session.getTransaction().commit();
		
		session.close();
		factory.close();
	}
	
	public void CancelMembershipDBHandler(int id)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		Query q = session.createQuery("update Registration set activeStatus=:newStatus where RegID=:p");
		q.setParameter("newStatus", 0);
		q.setParameter("p", id);
		int r = q.executeUpdate();
		session.getTransaction().commit();
		
		session.close();
		factory.close();
	
	}
	
} 