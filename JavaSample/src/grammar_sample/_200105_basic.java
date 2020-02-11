package grammar_sample;

public class _200105_basic {
	// try print, comment, etc
	public static void main(String[] args) {

		// 상수 선언 
		final double PI = 3.14; // 원주율
		int r =  3; // 반지름 
		/*PI = 3;*/ //ERR, 상수를 재정의 할 수 없음

		// 상수 선언 활용
		double CircleArea = r * r * PI;
		
		System.out.println(CircleArea);	

	}

}
