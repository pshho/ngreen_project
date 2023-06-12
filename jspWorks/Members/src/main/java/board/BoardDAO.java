package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

				boardList.add(board);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}

		return boardList;

	}

	// 자료 검색(회원 1명의 게시글)
	public Board getMember(String memberId) {
		Board board = new Board();

		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM boards WHERE memberid = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				board.setBid(rs.getInt("bid"));
				board.setTitle(rs.getString("title"));
				board.setContents(rs.getString("contents"));
				board.setRegDate(rs.getTimestamp("regDate"));
				board.setMemberId(rs.getString("memberId"));
				board.setModifyDate(rs.getTimestamp("modifyDate"));
				board.setHit(rs.getInt("hit"));
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
		String sql = "INSERT INTO boards(bid, title, contents, memberid) " + "VALUES(b_seq.NEXTVAL, ?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContents());
			pstmt.setString(3, board.getMemberId());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}

	}

	// 자료 삭제
	public void deleteBoard(String memberId) {
		conn = JDBCUtil.getConnection();
		String sql = "DELETE FROM boards WHERE memberid = ?";

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
	public void updateMember(Board board) {
		conn = JDBCUtil.getConnection();
		String sql = "UPDATE boards SET title = ?, contents = ?, modifydate = ? WHERE memberid = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContents());
			pstmt.setTimestamp(3, board.getModifyDate());
			pstmt.setString(4, board.getMemberId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}

	}

}
