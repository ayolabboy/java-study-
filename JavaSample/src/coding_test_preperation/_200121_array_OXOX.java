/*
����
"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.

"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.

OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, 
���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����. ���ڿ��� O�� X������ �̷���� �ִ�.

���
�� �׽�Ʈ ���̽����� ������ ����Ѵ�.

*/
package coding_test_preperation;

import java.util.Scanner;

public class _200121_array_OXOX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���� �� �Է�
		System.out.println("�׽�Ʈ ������ ���� �Է��Ͻÿ�");
		int total_ln = sc.nextInt(); 
		String[] array = new String[total_ln];		
		
		String cq = "";  // �� ���ο��� ���� ���� �ӽ� ����
		int score_current = 0; // ���� ����
		int score_sum = 0; // ���� �ջ�
		int i = 0; // loop 1
		int j = 0; // loop 2	
		
		// OX ���� loop
		System.out.println("OX������ ���� ����ŭ �Է��Ͻÿ�");		
		for (i = 0; i < total_ln; i++) {
			array[i] = sc.next();
		}

		// ���� ��� loop
		for (i = 0; i < total_ln; i++) {
			for (j = 0; j < array[i].length(); j++) {
				cq = array[i].substring(j, j + 1);
				if (cq.equals("O")) { // 'O'�� ������ ���� ����, �������� ���� �� �������� ����
					score_current++;
					score_sum += score_current; // �ջ�
				} else { // 'X'�� ������ ���ʽ� �ʱ�ȭ
					score_current = 0;
				}
			}
			// �� ���� ���� ��� �� ���� �ʱ�ȭ
			System.out.println(score_sum);
			score_current = 0;
			score_sum = 0;
		}
		sc.close();
	}

}
