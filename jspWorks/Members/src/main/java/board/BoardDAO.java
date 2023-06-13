package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import common.JDBCUtil;

public class BoardDAO {

	// field
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	// 자료 검색(게시글 전체 목록)
	public ArrayList<Board> getBoardList() {
		ArrayList<Board> boardList = new ArrayList<>();

		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM boards ORDER BY regdate DESC";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Board board = new Board();

				board.setBid(rs.getInt("bid"));
				board.setTitle(rs.getString("title"));
				board.setContents(rs.getString("contents"));
				board.setRegDate(rs.getTimestamp("regdate"));
				board.setMemberId(rs.getString("memberid"));
				board.setModifyDate(rs.getTimestamp("modifydate"));
				board.setHit(rs.getInt("hit"));
				board.setFileUploads(rs.getString("fileUploads"));

				boardList.add(board);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}

		return boardList;

	}

	// 자료 검색(한 개의 게시글)
	public Board getBoard(int bid) {
		Board board = new Board();

		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM boards WHERE bid = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				board.setBid(rs.getInt("bid"));
				board.setTitle(rs.getString("title"));
				board.setContents(rs.getString("contents"));
				board.setRegDate(rs.getTimestamp("regDate"));
				board.setMemberId(rs.getString("memberId"));
				board.setModifyDate(rs.getTimestamp("modifyDate"));
				board.setHit(rs.getInt("hit"));
				board.setFileUploads(rs.getString("fileUploads"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}

		return board;
	}

	// 자료 삽입(게시글 추가)
	public void insertBoard(Board board) {
		conn = JDBCUtil.getConnection();
		String sql = "INSERT INTO boards(bid, title, contents, memberid, fileuploads) " + "VALUES(b_seq.NEXTVAL, ?, ?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContents());
			pstmt.setString(3, board.getMemberId());
			pstmt.setString(4, board.getFileUploads());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}

	}

	// 자료 삭제
	public void deleteBoard(int bid) {
		conn = JDBCUtil.getConnection();
		String sql = "DELETE FROM boards WHERE bid = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}

	}

	// 자료 수정
	public void updateBoard(Board board) {
		Timestamp now = new Timestamp(System.currentTimeMillis());
		
		conn = JDBCUtil.getConnection();
		String sql = "UPDATE boards SET title = ?, contents = ?, modifydate = ?, fileuploads = ? WHERE bid = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContents());
			pstmt.setTimestamp(3, now);
			pstmt.setString(4, board.getFileUploads());
			pstmt.setInt(5, board.getBid());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}

	}
	
	public void hitUpdateBoard(int bid) {
		conn = JDBCUtil.getConnection();
		String sql = "UPDATE boards SET hit = hit + 1 WHERE bid = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
		
	}

}
