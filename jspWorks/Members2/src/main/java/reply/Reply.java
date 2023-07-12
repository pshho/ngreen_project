package reply;

import java.io.Serializable;
import java.sql.Timestamp;

public class Reply implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 221L;
	
	private int rno;
	private int bid;
	private String rcontent, replyer;
	private Timestamp rdate, rupdate;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getRcontent() {
		return rcontent;
	}
	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}
	public String getReplyer() {
		return replyer;
	}
	public void setReplyer(String replyer) {
		this.replyer = replyer;
	}
	public Timestamp getRdate() {
		return rdate;
	}
	public void setRdate(Timestamp rdate) {
		this.rdate = rdate;
	}
	public Timestamp getRupdate() {
		return rupdate;
	}
	public void setRupdate(Timestamp rupdate) {
		this.rupdate = rupdate;
	}
	
}
