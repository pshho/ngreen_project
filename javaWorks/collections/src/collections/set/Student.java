package collections.set;

public class Student {
	String name;
	int age;
	
	// 생성자
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// hashCode() 재정의
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	// equals() 재정의
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student)obj;
			
			if (std.name.equals(name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
