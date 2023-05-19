package classpart;

public class Circle {
	Point center;	// Point 클래스를 멤버변수로 사용
	int radius;
	
	// 생성자(public, private 없는 경우 default임)
	// default는 다른 패키지에서 사용 X
	// public은 외부 클래스 어디에서나 사용 가능
	public Circle(int x, int y, int radius) {
		center = new Point(x, y);	// 원의 중심점
		this.radius = radius;		// 반지름

	}
	
	// 원의 출력 정보 메소드
	public void showInfo() {
		System.out.printf("원의 중심: (%d, %d) 반지름: %dcm",
				center.x, center.y, radius);
		System.out.println();
	}

}
