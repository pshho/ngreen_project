package beans;

import java.io.Serializable;

// 인터페이스 Serializable(직렬화 - 객체 자체를 저장)
public class MemberBean implements Serializable {

	// 버전 Id
	private static final long serialVersionUID = 1L;
	
	// field
	private int id = 2023101;
	private String name = "장그레";
	
	// 생성자
	public MemberBean() {}

	// getter(), setter() 메서드
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
