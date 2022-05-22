package application;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paymentID;
	
	@Temporal(TemporalType.DATE)
	private Date datePaid;
	@Temporal(TemporalType.DATE)
	private Date dateDue;
	
	int amount;
	int paidStatus;
	

	public Payment() {
		amount=0;
		paidStatus=0;
	}
	
	public Payment(Date datePaid, Date dateDue, int amount, int paidStatus) {
		super();
		this.datePaid = datePaid;
		this.dateDue = dateDue;
		this.amount = amount;
		this.paidStatus = paidStatus;
	}

	void setpaymentDetails(int amount, int paidStatus)
	{
		this.amount = amount;
		this.paidStatus = paidStatus;
		//DB HERE
	}
	public int getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}
	public Date getDatePaid() {
		return datePaid;
	}
	public void setDatePaid(Date datePaid) {
		this.datePaid = datePaid;
	}
	public Date getDateDue() {
		return dateDue;
	}
	public void setDateDue(Date dateDue) {
		this.dateDue = dateDue;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPaidStatus() {
		return paidStatus;
	}
	public void setPaidStatus(int paidStatus) {
		this.paidStatus = paidStatus;
	}
	
	

}
