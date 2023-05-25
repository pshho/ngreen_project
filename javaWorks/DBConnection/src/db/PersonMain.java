package db;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		// person 자료 검색(목록 조회)
		PersonDAO dao = new PersonDAO();
		
		ArrayList<Person> personList = dao.getPersonList();
		
		for(int i=0; i<personList.size(); i++) {
			if(personList.get(i) != null) {
				Person person = personList.get(i);
				
				String userId = person.getUserId();
				String userPw = person.getUserPw();
				String name = person.getName();
				int age = person.getAge();
				
				System.out.printf("아이디: %s, 비밀번호: %s\n이름: %s, 나이: %d\n", 
						userId, userPw, name, age);
			}
		}
		
	}

}
