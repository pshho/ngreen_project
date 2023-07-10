package member;

import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	
	// field
	private String memberId, passwd, name, gender;
	private Date joinDate;
	
	// constructor
	public Member() {}
	
	// getter(), setter()
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

}
