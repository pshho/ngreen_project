package member;

public class Test {

	public static void main(String[] args) {
		
		MemberDAO memD = new MemberDAO();
		
		
		for(Member mem : memD.getMemberList()) {
			System.out.println(mem.getMemberId());
			System.out.println(mem.getPasswd());
			System.out.println(mem.getName());
			System.out.println(mem.getGender());
			System.out.println(mem.getJoinDate());
		}
		
		System.out.println();
		
		Member mem = memD.getMember("today");
		
		System.out.println(mem.getMemberId());		
		System.out.println(mem.getPasswd());
		System.out.println(mem.getName());
		System.out.println(mem.getGender());
		System.out.println(mem.getJoinDate());
		
		/*
		Member mem1 = new Member();
		mem1.setMemberId("cloud");
		mem1.setPasswd("m1234");
		mem1.setName("안녕");
		mem1.setGender("남");
		memD.insertMember(mem1);
		*/
		
		// memD.deleteMember("cloud");
		
//		Member mem2 = new Member();
//		mem2.setMemberId("today");
//		mem2.setPasswd("t1234");
//		mem2.setName("길동");
//		mem2.setGender("남");
//		memD.updateMember(mem2);
		
	}

}
