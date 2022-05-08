package application;

public class Member {
	int memberID;
	String name;
	int age;
	Long cnic;
	String PhoneNo;
	String password;
	
	
	public Member() {
	}
	public void setmemberDetails(String name, int age, Long cnic, String phoneNo, String password) {
		this.name = name;
		this.age = age;
		this.cnic = cnic;
		PhoneNo = phoneNo;
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
