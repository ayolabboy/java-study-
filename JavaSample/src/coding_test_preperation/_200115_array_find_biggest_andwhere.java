/*
����
9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

���� ���, ���� �ٸ� 9���� �ڿ���

3, 29, 38, 12, 57, 74, 40, 85, 61

�� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.

�Է�
ù ° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� �۴�.

���
ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�.
 */
package coding_test_preperation;

import java.util.Scanner;

public class _200115_array_find_biggest_andwhere {

	public static void main(String[] args) {
		// �Է�
		Scanner sc = new Scanner(System.in);
		int i = 0; // loop count
		int[] array = new int[9]; // array

		System.out.println("�迭�� ��� ���� ��������. 9�� �Է��Ͻø� �˴ϴ�.");
		for (i = 0; i < 9; i++) {
			int a = sc.nextInt();
			array[i] = a;
		}

		// �迭 ù ��° ������ ����
		int tmp_biggest = array[0];
		int tmp_where = 0;

		// �ִ� �� ã�� loop
		for (i = 1; i < 9; i++) {
			if (tmp_biggest <= array[i]) { // ���� �� ���� ���� �迭�� �ִ� ���� ũ��
				tmp_biggest = array[i]; // �ִ� �� ���� �迭������ ġȯ
				tmp_where = i + 1; // ��ġ�� ���� (�迭�� 0���� ī���� �ǹǷ� ���� ����� +1)
			}
		}
		System.out.println("�ִ밪�� :" + tmp_biggest + "�̸� ��ġ�� " + tmp_where + "�� °�̴�");
		sc.close();
	}

}
