package coding_test_preperation;

import java.util.Scanner;

public class _200116_array_howmany_numbers_after_multiply {

	public static void main(String[] args) {

		System.out.println("���ڸ� �� 3���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in); // �Է� �� ����
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();		

		int MULTI = A * B * C; // �� ���� ��		
		String MULTI_str = String.valueOf(MULTI); // ���� �� ��� �� ��Ʈ������ ��ȯ
		int[] MULTI_array = new int[MULTI_str.length()]; // �迭�� �� �ڸ� �� ����
		int[] MULTI_array_cnt = new int[MULTI_str.length()]; // ���� �� �� �������� ���� �� �迭	
		
		int i = 0; // loop 1
		int j = 0; // loop 2
		
		// ���� ����ó�� (100 < A,B,C < 1000)
		if ((A < 100 || A > 1000) || (B < 100 || B > 1000) || (C < 100 || C > 1000)) {
			System.out.println("���� �ʰ�����");
		} else {
			for (i = 0; i < MULTI_str.length(); i++) { // �� ��� �� ���� ��ŭ ����
				MULTI_array[i] = Integer.parseInt(MULTI_str.substring(i, i + 1)); // �� �ڸ� �� ����
				MULTI_array_cnt[i] = 0; // �迭 �ʱ�ȭ 
			}			
			// ���� ���� üũ
			for (i = 0; i < MULTI_str.length(); i++) { // 1 ~ �� ��� ���� ���̸�ŭ ����
				for (j = 0; j < MULTI_str.length(); j++) { // 1 ~ �� ��� ���� ���̸�ŭ ����^2
					if (MULTI_array[i] == j) { // �� �ڸ� �� ���� �� üũ 
						MULTI_array_cnt[j]++;
					}
				}
			}
			// ��� �� ���
			System.out.println("������ ��� ���� : " + MULTI + "����");
			for (i = 0; i < MULTI_str.length(); i++) {
				System.out.println(i + "�� " + MULTI_array_cnt[i] + "�� �־��");
			}
		}
		sc.close();
	}

}
