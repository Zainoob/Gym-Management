package application;

import java.util.Date;

public class Registration {
	int RegID;
	int activeStatus;
	Member member;
	Date regDate;
	PlanDescription planDescription;
	Payment payment;

	
	public Registration(int regid, int activestatus,Payment payment, PlanDescription planDescription, Member member)
	{
		this.member = member;
		this.planDescription = planDescription;
		this.payment = payment;
		RegID = regid;
		activeStatus = activestatus;	
	}
	
	
	public Registration() 
	{
		this.payment = new Payment();
		this.member = new Member();
		this.planDescription = new PlanDescription();	
		activeStatus=0;
	}
	
	public void setRegistrationDetails(int activestatus,Payment payment, PlanDescription planDescription)
	{
		this.planDescription = planDescription;
		this.payment = payment;
		activeStatus = activestatus;	
		DBHandler ins = new DBHandler();
		
	}

	public void setMemberDetails(String name, int age, long cnic, String phoneno, String password)
	{
		this.member.setName(name);
		this.member.setAge(age);
		this.member.setCnic(cnic);
		this.member.setPhoneNo(phoneno);
		this.member.setPassword(password);
		DBHandler ins = new DBHandler();
		ins.MemberDBHandler(member);
	}


	public int getRegID() {
		return RegID;
	}

	public void setRegID(int regID) {
		RegID = regID;
	}

	public int getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(int activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public PlanDescription getPlanDescription() {
		return planDescription;
	}

	public void setPlanDescription(PlanDescription planDescription) {
		this.planDescription = planDescription;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}


	


}
