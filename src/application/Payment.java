package application;

import java.util.Date;

public class Payment {
	int paymentID;
	Date datePaid;
	Date dateDue;
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
