package application;

import java.util.Date;

public class Booking {
	int bookingID;
	Member member;
	Date bookingDate;
	int bookingStatus;
	
	
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setBookingdetails(String name, int age, Long cnic, String phoneNo, String password,  int bookingStatus) {
		Member Member=new Member();
		Member.setmemberDetails(name, age, cnic, phoneNo, password);
		this.member = Member;
		this.bookingStatus = bookingStatus;
	}
	public void setBookingMemberdetails(String name, int age, Long cnic, String phoneNo, String password) {
		Member Member=new Member();
		Member.setmemberDetails(name, age, cnic, phoneNo, password);
	}
	public void setBooking(Date bookingdate,int bstatus)
	{
		bookingStatus=bstatus;
		bookingDate=bookingdate;
		
	}
	public int getBookingID() {
		return bookingID;
	}
	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public int getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(int bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	
	

}
