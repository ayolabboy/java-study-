/*
����
N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.

�Է�
ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.

���
������İ� ���� N*1���� N*9���� ����Ѵ�.

*/

package coding_test_preperation;

import java.util.Scanner;

public class _200113_gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("�������� ����մϴ�.");
		System.out.println("���ڸ� �Է��ϼ���.");
		
		int a = sc.nextInt();
		int cnt = 1;
		int result;

		for (cnt = 1; cnt < 10; cnt++) {
			result = a * cnt;
			System.out.println(result);
		}
		System.out.println("��� ����");
		sc.close();

	}

}
