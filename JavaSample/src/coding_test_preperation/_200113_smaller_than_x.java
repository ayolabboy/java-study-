package coding_test_preperation;

import java.util.Scanner;

public class _200113_smaller_than_x {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// �Է� �� ����
		System.out.println("�Է��ϰ��� �ϴ� ������ ������ ���Ͻÿ�");
		int n = sc.nextInt();
		if (n < 0 || n > 10) {
			System.out.println("���� �ʰ�");
			System.exit(0);
		}
		// �б� �� ����
		System.out.println("�б����� �Ǵ� ���ڸ� ���Ͻÿ�. �ش� ������ ���� ���ڵ��� ��µ˴ϴ�.");
		int x = sc.nextInt();
		if (x < 0 || x > 1000) {
			System.out.println("���� �ʰ�");
			System.exit(0);
		}

		int count;
		int[] array1 = new int[n];

		for (count = 0; count < n; count++) {
			System.out.println("������ �Է��ϼ���");
			int tmp = sc.nextInt();

			if (tmp > 0 && tmp < 100) {
				array1[count] = tmp;
			} else {
				System.out.println("���� �ʰ�, �ٽ� �Է��ϼ���");
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
