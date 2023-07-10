package board;

import java.io.Serializable;
import java.sql.Timestamp;

public class Board implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;
	
	private int bid, hit;
	private String title, contents, memberId, fileUploads;
	private Timestamp regDate, modifyDate;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	public Timestamp getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getFileUploads() {
		return fileUploads;
	}
	public void setFileUploads(String fileUploads) {
		this.fileUploads = fileUploads;
	}

}
