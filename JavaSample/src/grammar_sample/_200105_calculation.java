package grammar_sample;

public class _200105_calculation {

	public static void main(String[] args) {
		// 변수 선언 
		double a = 5;
		double b = 6;
		double c;
		double d;

		// 변수 계산 
		a++;
		a+=10;
		a--;
		a = a + 6;
		c = (a + b)/b;
		d = a%c ;
		
		// 출력
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		// 비교문
		int x = 10;
		int y = 10;
		
		if(x > y) {
			System.out.println("초과 조건에 포함됨");
		}
		if(x < y) {
			System.out.println("미만 조건에 포함됨");
		}
		if(x >= y) {
			System.out.println("이상 조건에 포함됨");
		}
		if(x <= y) {
			System.out.println("이하 조건에 포함됨");
		}
		if(x == y) {
			System.out.println("동일 조건에 포함됨");
		}
		if(x != y) {
			System.out.println("안동일 조건에 포함됨");
		}
		if(x > 1 || y <-1) {
			System.out.println("orr");
		}
		if(x > 1 && y > 1) {
			System.out.println("nrr");
		}
		
	}

}
