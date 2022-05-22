package application;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int RegID;
	
	private int activeStatus;
	
	@Temporal(TemporalType.DATE)
	private Date regDate;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="memberID")
	Member member;
	
	
	
	@OneToOne(fetch = FetchType.EAGER,cascade = {CascadeType.ALL})
	@JoinColumn(name="plandesc_id")
	PlanDescription planDescription;
	
	@OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="paymentID")
	Payment payment;

	
	public Registration(int regid,Date regdate, int activestatus,Payment payment, PlanDescription planDescription, Member member)
	{
		this.member = member;
		this.planDescription = planDescription;
		this.payment = payment;
		RegID = regid;
		regDate = regdate;
		activeStatus = activestatus;	
	}
	
	
	public Registration() 
	{
		this.planDescription = new PlanDescription();
		this.payment = new Payment();
		this.member = new Member();
			
		activeStatus=0;
	}
	
	public void setRegistrationDetails(int activestatus,Date regdate,Payment payment, PlanDescription planDescription)
	{
		this.planDescription = planDescription;
		this.payment = payment;
		activeStatus = activestatus;	
		regDate=regdate;
		//DBHandler ins = new DBHandler();
		//ins.RegistationDBHandler(this);
		
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
