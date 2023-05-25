package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// DAO - 데이터베이스 연결 및 연동(입력, 검색, 수정, 삭제)
public class PersonDAO {
	// field
	private Connection conn = null;			// 연결 처리 클래스
	private PreparedStatement pstmt = null;	// sql 처리 클래스
	
	// 연결 - 클래스 작성 호출
	
	
	// 자료 삽입
	public void insertPerson(Person person) {
		try {
			conn = JDBCUtil.getConnection();
			String sql = "";
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 자료 검색(목록)
	public ArrayList<Person> getPersonList() {
		ArrayList<Person> personList = new ArrayList<>();
		
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM person";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();	// 검색할 때 쓰는 executeQuery
			while(rs.next()) {
				Person person = new Person();
				// person 테이블에서 userid를 가져와서 person 객체에 저장
				person.setUserId(rs.getString("userid"));
				person.setUserPw(rs.getString("userpw"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				personList.add(person);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return personList;	// 호출하는 곳으로 반환
		
	}

}
