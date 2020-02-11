/*
문제
N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

입력
첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.

출력
출력형식과 같게 N*1부터 N*9까지 출력한다.

*/

package coding_test_preperation;

import java.util.Scanner;

public class _200113_gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("구구단을 출력합니다.");
		System.out.println("숫자를 입력하세요.");
		
		int a = sc.nextInt();
		int cnt = 1;
		int result;

		for (cnt = 1; cnt < 10; cnt++) {
			result = a * cnt;
			System.out.println(result);
		}
		System.out.println("출력 종료");
		sc.close();

	}

}
