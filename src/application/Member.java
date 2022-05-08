package application;

public class Member {
	int memberID;
	String name;
	int age;
	int cnic;
	int PhoneNo;
	String password;
	
	
	public Member() {
	}
	public void setmemberDetails(String name, int age, int cnic, int phoneNo, String password) {
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
	public int getCnic() {
		return cnic;
	}
	public void setCnic(int cnic) {
		this.cnic = cnic;
	}
	public int getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		PhoneNo = phoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
