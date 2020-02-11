/*
문제
9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

예를 들어, 서로 다른 9개의 자연수

3, 29, 38, 12, 57, 74, 40, 85, 61

이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

입력
첫 째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.

출력
첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
 */
package coding_test_preperation;

import java.util.Scanner;

public class _200115_array_find_biggest_andwhere {

	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		int i = 0; // loop count
		int[] array = new int[9]; // array

		System.out.println("배열에 담길 수를 넣으세요. 9개 입력하시면 됩니다.");
		for (i = 0; i < 9; i++) {
			int a = sc.nextInt();
			array[i] = a;
		}

		// 배열 첫 번째 값으로 세팅
		int tmp_biggest = array[0];
		int tmp_where = 0;

		// 최대 값 찾는 loop
		for (i = 1; i < 9; i++) {
			if (tmp_biggest <= array[i]) { // 현재 값 보다 현재 배열에 있는 값이 크면
				tmp_biggest = array[i]; // 최대 값 현재 배열값으로 치환
				tmp_where = i + 1; // 위치값 저장 (배열이 0부터 카운팅 되므로 실제 출력은 +1)
			}
		}
		System.out.println("최대값은 :" + tmp_biggest + "이며 위치는 " + tmp_where + "번 째이다");
		sc.close();
	}

}
