/*
문제
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
*/
package coding_test_preperation;

import java.util.Scanner;

public class _200113_star2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력하고자 하는 별의 줄 수를 입력하세요");
		int a = sc.nextInt();
		int cnt = 0;
		int cnt2 = a;
		int cnt3 = 1;

		for (cnt = 0; cnt < a; cnt++) {
			for (cnt3 = 1; cnt3 < a - cnt; cnt3++) {
				System.out.print(" ");
			}
			for (cnt2 = a; cnt2 >= a - cnt; cnt2--) {
				System.out.print("*");
			}
			System.out.print("\r");
		}

		sc.close();

	}

}
