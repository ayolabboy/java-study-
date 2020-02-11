/*
문제
연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.

출력
첫째 줄에 윤년이면 1, 아니면 0을 출력한다.

*/
package coding_test_preperation;

import java.util.Scanner;

/* 
윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

4의 배수 : 4로 나눈 나머지가 0 
100의 배수 : 100으로 나눈 나머지가 0
400의 배수 : 400으로 나눈 나머지가 0
*/
public class _200112_yun_year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if (year >= 1 && year <= 4000) { // 범위 체크
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { // 윤년 조건 체크
				System.out.println(year + "년은 윤년");
			} else {
				System.out.println(year + "년은 평년");
			}
		} else {
			System.out.println("범위 초과");
		}

		sc.close();

	}

}
