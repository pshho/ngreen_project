package reply;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import common.JDBCUtil;

public class ReplyDAO {
	// field
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	// 댓글 목록 조회
	public ArrayList<Reply> getReplyList(int bid){
		ArrayList<Reply> replyList = new ArrayList<>();
		
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM replys where bid = ? ORDER BY rdate DESC";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Reply reply = new Reply();
				
				reply.setRno(rs.getInt("rno"));
				reply.setRcontent(rs.getString("rcontent"));
				reply.setReplyer(rs.getString("replyer"));
				reply.setRdate(rs.getTimestamp("rdate"));
				reply.setRupdate(rs.getTimestamp("rupdate"));
				
				replyList.add(reply);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		
		return replyList;
	}
	
	// 댓글 1개 보기
	public Reply getReply(int rno) {
		Reply reply = new Reply();
		
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM replys WHERE rno = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rno);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				reply.setRno(rs.getInt("rno"));
				reply.setBid(rs.getInt("bid"));
				reply.setRcontent(rs.getString("rcontent"));
				reply.setReplyer(rs.getString("replyer"));
				reply.setRdate(rs.getTimestamp("rdate"));
				reply.setRupdate(rs.getTimestamp("rupdate"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}

		return reply;
	}
	
	// 댓글 추가
	public void addReply(Reply reply){
		conn = JDBCUtil.getConnection();
		String sql = "INSERT INTO replys(bid, rcontent, replyer) " + "VALUES(?, ?, ?)";
		
		try {
			// reply의 필드 값 검증
	        if (reply.getBid() != 0 && !reply.getRcontent().isEmpty() && !reply.getReplyer().isEmpty()) {
	        	pstmt = conn.prepareStatement(sql);
	        	
	            pstmt.setInt(1, reply.getBid());
	            pstmt.setString(2, reply.getRcontent());
	            pstmt.setString(3, reply.getReplyer());
	
	            pstmt.executeUpdate();
            }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	// 댓글 삭제
	public void deleteReply(int rno) {
		conn = JDBCUtil.getConnection();
		String sql = "delete from replys where rno=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rno);

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	// 댓글 수정
	public void updateReply(Reply reply) {
		Timestamp now = new Timestamp(System.currentTimeMillis());
		
		conn = JDBCUtil.getConnection();
		String sql = "UPDATE replys SET rcontent = ?, rupdate = ? WHERE rno = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, reply.getRcontent());
			pstmt.setTimestamp(2, now);
			pstmt.setInt(3, reply.getRno());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
}
