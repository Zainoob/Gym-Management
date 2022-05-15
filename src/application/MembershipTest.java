package application;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MembershipTest {

	List<Member> Members=new ArrayList<Member>();
	@Test
	public void addMemberTest() {

		Member m=new Member();
		m.setmemberDetails("Zainab", 21, 1234567890123L, "03339786054","1234");
		Members.add(m);
		assertEquals(Members.get(0),m);
	}
	@Test
	public void addMemberTest2() {
		Member m=new Member();
		m.setmemberDetails("Musa", 21, 5432167890123L, "79333086054","4321");
		Members.add(m);
		assertEquals(Members.get(0),m);
	}
	
	
	@Test
	public void CancelMemberTest1() {
		Member m=new Member();
		m.setmemberDetails("Musa", 21, 5432167890123L, "79333086054","4321");
		Members.remove(m);
		assertFalse(Members.contains(m));
	}
	@Test
	public void CancelMemberTest2() {
		Member m=new Member();
		m.setmemberDetails("Zainab", 21, 1234567890123L, "03339786054","1234");
		Members.remove(m);
		assertFalse(Members.contains(m));
	}
	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


