package enums;

public class UsingDefineTest {

	public static void main(String[] args) {
		
		// int maxValue = UsingDefine.MAX_NUM;
		double radius = UsingDefine.EARTH_RADIUS;
		double surface = 4 * Math.PI * radius * radius;
		
		// 지구의 반지름과 표면적
		System.out.println("지구 반지름: " + radius + "km");
		System.out.println("지구 표면적: " + String.format("%.2fkm²", surface));
		
		/*
		System.out.println("최대값: " + maxValue);
		System.out.println("최소값: " + UsingDefine.MIN_NUM);
		System.out.println("원주율: " + UsingDefine.PI);
		System.out.println("원주율: " + Math.PI);
		*/
		
	}

}
