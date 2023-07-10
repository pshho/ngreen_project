package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCUtil;

public class MemberDAO {
	
	// field
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	// 자료 검색(회원 전체 목록)
	public ArrayList<Member> getMemberList() {
		ArrayList<Member> memberList = new ArrayList<>();
		
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM members ORDER BY joindate DESC";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Member memb = new Member();
				
				memb.setMemberId(rs.getString("memberid"));
				memb.setPasswd(rs.getString("passwd"));
				memb.setName(rs.getString("name"));
				memb.setGender(rs.getString("gender"));
				memb.setJoinDate(rs.getDate("joindate"));
				
				memberList.add(memb);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		
		return memberList;
		
	}
	
	// 자료 검색(회원 1명 목록)
	public Member getMember(String memberId) {
		Member member = new Member();
		
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM members WHERE memberid = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				member.setMemberId(rs.getString("memberid"));
				member.setPasswd(rs.getString("passwd"));
				member.setName(rs.getString("name"));
				member.setGender(rs.getString("gender"));
				member.setJoinDate(rs.getDate("joindate"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		
		return member;
	}
	
	// 자료 삽입(회원 가입)
	public void insertMember(Member member) {
		conn = JDBCUtil.getConnection();
		String sql = "INSERT INTO members(memberid, passwd, name, gender)"
				+ "VALUES(?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getPasswd());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getGender());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
		
	}
	
	// 자료 삭제
	public void deleteMember(String memberId) {
		conn = JDBCUtil.getConnection();
		String sql = "DELETE FROM members WHERE memberid = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
		
	}
	
	// 자료 수정
	public void updateMember(Member member) {
		conn = JDBCUtil.getConnection();
		String sql = "UPDATE members SET passwd = ?, name = ?, gender = ? WHERE memberid = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getPasswd());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getGender());
			pstmt.setString(4, member.getMemberId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
		
	}
	
	// 로그인 체크
	public boolean checkLogin(Member member) {
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM members WHERE memberid = ? and "
				+ "passwd = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getPasswd());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		
		return false;
		
	}
	
	// ID 중복 체크
	public int duplicatedId(String memberId) {
		int result = 0;
		
		conn = JDBCUtil.getConnection();
		String sql = "SELECT COUNT(*) as result "
				+ "FROM members WHERE memberid = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt("result");	// 칼럼 result의 값 꺼내오기
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		
		
		return result;
	}

}
