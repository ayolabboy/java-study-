package grammar_sample;
import java.util.Scanner;

public class _200105_while {
	public static void main(String[] args) {

		int i = 2;

		while (i < 10) {
			/* System.out.println(i); */
			i++;
		}
		
		int j = 3;
		
		// 키보드 입력 받는 클래스
		@SuppressWarnings("resource") // 애러 출력 막기
		
		Scanner scan = new Scanner (System.in);
		System.out.println("숫자를 입력하시오1");
		
		do {
			j = scan.nextInt();
			System.out.println(j);
		}while(j != 10);
		
		System.out.println("종료");	
		

	}
}
