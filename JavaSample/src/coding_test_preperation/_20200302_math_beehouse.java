package coding_test_preperation;

import java.util.Scanner;

public class _20200302_math_beehouse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		int i = 0;

		int a = 1;
		int b = 1;
		int cnt = 1;

		System.out.println("���� ���ȣ�� �Է��ϼ���");
		N = sc.nextInt();

		while (i == 0) {
			if (a <= N && b > N) {
				break;
			} else {
				a = a + b;
				b = b + (6 * cnt);
				a = b - (6 * cnt) + 1;
				cnt++;
			}
		}
		System.out.println("�߾����κ��� �Ÿ��� :" + cnt);
		sc.close();

	}

}
