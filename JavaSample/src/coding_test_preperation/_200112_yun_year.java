/*
����
������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ������ �־�����. ������ 1���� ũ�ų� ����, 4000���� �۰ų� ���� �ڿ����̴�.

���
ù° �ٿ� �����̸� 1, �ƴϸ� 0�� ����Ѵ�.

*/
package coding_test_preperation;

import java.util.Scanner;

/* 
������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.

4�� ��� : 4�� ���� �������� 0 
100�� ��� : 100���� ���� �������� 0
400�� ��� : 400���� ���� �������� 0
*/
public class _200112_yun_year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if (year >= 1 && year <= 4000) { // ���� üũ
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { // ���� ���� üũ
				System.out.println(year + "���� ����");
			} else {
				System.out.println(year + "���� ���");
			}
		} else {
			System.out.println("���� �ʰ�");
		}

		sc.close();

	}

}
