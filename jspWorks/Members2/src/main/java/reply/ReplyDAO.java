package reply;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}
