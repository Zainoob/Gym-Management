package application;

import static org.junit.Assert.*;

import org.junit.Test;

public class MembershipPlansTest {
	
	private static Gym gym = null;

	public MembershipPlansTest() {
		gym = gym.getInstance();
		gym.loadPlansCatalogues();

	}

	@Test
	public void findChosenMembershipindb1() {
		PlanDescription p=new PlanDescription();
		p.setPlan(4,"Gold", 4000);
		gym.PlansCatalogue.add(p);
		assertEquals(gym.searchPlansCatalogue("Gold"),p);
		gym.PlansCatalogue.remove(p);
		
	}
	@Test
	public void findChosenMembershipindb2() {
		PlanDescription p=new PlanDescription();
		p.setPlan(5,"silver", 4500);
		gym.PlansCatalogue.add(p);
		assertEquals(gym.searchPlansCatalogue("silver"),p);
		gym.PlansCatalogue.remove(p);
		
	}

}
