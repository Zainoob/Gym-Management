package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int memberID;
	private String name;
	private int age;
	private Long cnic;
	private String PhoneNo;
	private String password;
	
	
	public Member() {
	}
	public void setmemberDetails(String name, int age, Long cnic, String phoneNo, String password) {
		this.name = name;
		this.age = age;
		this.cnic = cnic;
		this.PhoneNo = phoneNo;
		this.password = password;
	}
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Long getCnic() {
		return cnic;
	}
	public void setCnic(Long cnic) {
		this.cnic = cnic;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
