/*
����
ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����

������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.

�Է�
ù° �ٿ� N(1 �� N �� 100)�� �־�����.

���
ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
*/
package coding_test_preperation;

import java.util.Scanner;

public class _200113_star2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����ϰ��� �ϴ� ���� �� ���� �Է��ϼ���");
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
