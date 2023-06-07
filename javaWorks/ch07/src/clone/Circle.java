package clone;

public class Circle implements Cloneable {

	Point center;	// 중심점
	int radius;		// 반지름
	
	Circle(int x, int y, int radius) {
		center = new Point(x, y);
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "중심점은 " + center + "이고, 반지름은 " + radius + "입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
