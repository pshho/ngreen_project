package db;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		PersonDAO dao = new PersonDAO();

		// 자료 삽입
		Person p1 = new Person("test", "test1234", "tester", 22);
		// dao.insertPerson(p1); // PersonDAO의 insertPerson() 호출
		
		// 자료 삭제
		// dao.deletePerson("test");

		// 자료 1개 검색
		Person person1 = dao.getPerson("cloud");
		String userId1 = person1.getUserId();
		String userPw1 = person1.getUserPw();
		String name1 = person1.getName();
		int age1 = person1.getAge();

		System.out.printf("아이디: %s, 비밀번호: %s\n이름: %s, 나이: %d\n", userId1, userPw1, name1, age1);
		
		// 자료 수정 - 아이디 'cloud'인 사람 검색
		Person cloud = dao.getPerson("cloud");
		
		// 변경 자료 입력
		cloud.setName("클라우드");
		cloud.setAge(50);
		cloud.setUserPw("cloud1");
		
		// 수정
		dao.updatePerson(cloud);

		System.out.println("=======================================");

		// person 자료 검색(전체 목록 조회)
		
		ArrayList<Person> personList = dao.getPersonList();

		for (int i = 0; i < personList.size(); i++) {
			if (personList.get(i) != null) {
				Person person = personList.get(i); // ArrayList 요소 가져오기

				String userId = person.getUserId();
				String userPw = person.getUserPw();
				String name = person.getName();
				int age = person.getAge();

				System.out.printf("아이디: %s, 비밀번호: %s\n이름: %s, 나이: %d\n", userId, userPw, name, age);

			}
		}

	}

}
