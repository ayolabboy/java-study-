package coding_test_preperation;

import java.util.Scanner;

public class _200113_smaller_than_x {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력 수 지정
		System.out.println("입력하고자 하는 정수의 개수를 정하시오");
		int n = sc.nextInt();
		if (n < 0 || n > 10) {
			System.out.println("범위 초과");
			System.exit(0);
		}
		// 분기 수 지정
		System.out.println("분기점이 되는 숫자를 정하시오. 해당 수보다 작은 숫자들이 출력됩니다.");
		int x = sc.nextInt();
		if (x < 0 || x > 1000) {
			System.out.println("범위 초과");
			System.exit(0);
		}

		int count;
		int[] array1 = new int[n];

		for (count = 0; count < n; count++) {
			System.out.println("정수를 입력하세요");
			int tmp = sc.nextInt();

			if (tmp > 0 && tmp < 100) {
				array1[count] = tmp;
			} else {
				System.out.println("범위 초과, 다시 입력하세요");
				count--;
			}
		}

		for (count = 0; count < n; count++) {
			if (array1[count] < x) {
				System.out.println(array1[count]);
			}
		}
		sc.close();
	}

}
