package member;

// Member 빈, VO
public class Member {

	private String userid, passwd, uname, phone1, phone2, phone3, gender;
	
	// setter(), getter()
	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone) {
		this.phone1 = phone;
	}
	
	public String getPhone2() {
		return phone2;
	}
	
	public void setPhone2(String phone) {
		this.phone2 = phone;
	}
	
	public String getPhone3() {
		return phone3;
	}
	
	public void setPhone3(String phone) {
		this.phone3 = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
