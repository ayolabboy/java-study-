package coding_test_preperation;

import java.util.Scanner;

public class _200116_array_cdefgabC {

	public static void main(String[] args) {

		// �Է�
		Scanner sc = new Scanner(System.in); // �Է� �� ����
		String[] array = new String[9]; // �迭
		int i = 0; // loop 1
		int j = 0; // loop 2
		int err = 0; // �ַ� üũ
		int overlap_chk = 0; // �ߺ� üũ
		int ascending_cnt = 0; // ���� 1 ī��Ʈ
		int descending_cnt = 0; // ���� 2 ī��Ʈ

		System.out.println("1-8���� ��ġ�� �ʰ� �Է��ϼ���. �� ������ ����� �մϴ�.");
		String num_line = sc.nextLine();

		// �迭 ����
		for (i = 0; i < 8; i++) {
			array[i] = num_line.split(" ")[i];
		}

		// �迭 �� ��, ���� ī��Ʈ
		for (i = 0; i < 8; i++) {
			/* ����ó�� ���� */
			// �迭 ���� üũ
			if (array.length > 9) {
				err = 1; // �Է� �� ���� �ʰ�
				break;
			}
			// �Է� �� ����ó�� ���� (1 - 8)
			if (Integer.parseInt(array[i]) < 1 || Integer.parseInt(array[i]) > 9) {
				err = 2; // �Է� �� ���� �ʰ�
				break;
			}
			// �ߺ� �� ã�� ����
			for (j = 0; j < 8; j++) {
				if (Integer.parseInt(array[i]) == Integer.parseInt(array[j])) {
					overlap_chk++;
				}
			}
			if (overlap_chk > 1) {
				err = 3;
				break;
			} else {
				overlap_chk = 0;
			}
			/* ����ó�� ���� */
			
			// ���� üũ ����
			if (Integer.parseInt(array[i]) == i + 1) { // ascending check
				ascending_cnt++;
			} else if (Integer.parseInt(array[7 - i]) == i + 1) { // descending check
				descending_cnt++;
			}
		}

		if (err > 0) { // �ַ� ���
			if (err == 1) {
				System.out.println("�迭 ���� �ʰ�");
			} else if (err == 2) {
				System.out.println("�����ʰ�");
			} else if (err == 3) {
				System.out.println("�ߺ� �� �߰�!");
			}
		} else { // ���ǿ� ���� ��� ���
			if (ascending_cnt == 8) {
				System.out.println("ascending");
			} else if (descending_cnt == 8) {
				System.out.println("descending");
			} else {
				System.out.println("mixed");
			}
		}
		sc.close();
	}

}
