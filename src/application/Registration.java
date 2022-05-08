package application;

import java.util.Date;

public class Registration {
	int RegID;
	int activeStatus;
	Date regDate;
	PlanDescription planDescription;
	Payment payment;
	Booking booking;

	private static Gym gym = null;

	public Registration() {
		gym = gym.getInstance();
		gym.loadPlansCatalogues();

	}
	public void RegisterMember(String name, int age, Long cnic, String phoneNo, String password,String desc)
	{
		this.getBooking().setBookingMemberdetails(name, age, cnic, phoneNo, password);
		this.booking.setBooking(new Date(), 1);
		PlanDescription a =new PlanDescription();
		a=gym.searchPlansCatalogue(desc);
		this.planDescription.setPlan(a);
		this.payment.setpaymentDetails(a.getFee(), 0);
		gym.RegistrationSchedule.add(this);
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

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public static Gym getGym() {
		return gym;
	}

	public static void setGym(Gym gym) {
		Registration.gym = gym;
	}
	


}
