package collections.list;

import java.util.ArrayList;

import collections.member.Member;

//Member 클래스를 관리하는 클래스(CRUD)
public class MemberArrayList {
	//ArrayList 객체 선언
	ArrayList<Member> arrayList;
	
	//생성자
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	//회원 생성 매서드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//회원 목록 보기 매서드
	public void showAllMember() {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	
	//회원 1명 보기
	public void showOneMember(int memberId) {
		for(int i=0; i<arrayList.size(); i++) {
			int dbId = arrayList.get(i).getMemberId();  //저장된 아이디를 변수에 저장함
			if(memberId == dbId) { //외부에 입력한 아이디와 같으면
				Member member = arrayList.get(i);  //membr 객체 생성(할당)
				System.out.println(member);
			}
		}
	}
	
	//회원 삭제 매서드
	public void removeMember(int memberId) {
		for(int i=0; i<arrayList.size(); i++) {
			int dbId = arrayList.get(i).getMemberId();  //저장된 아이디를 변수에 저장함
			if(memberId == dbId) { //외부에 입력한 아이디와 같으면
				arrayList.remove(i);
				return;  //강제 종료
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
	}
}





