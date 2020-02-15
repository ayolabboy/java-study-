/*
����
0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. 
���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�. 
�� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�. ���� ���� ����.

26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�. 6+8 = 14�̴�. ���ο� ���� 84�̴�. 8+4 = 12�̴�. ���ο� ���� 42�̴�. 4+2 = 6�̴�. 
���ο� ���� 26�̴�.

���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.

N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� N�� �־�����. N�� 0���� ũ�ų� ����, 99���� �۰ų� ���� �����̴�.

���
ù° �ٿ� N�� ����Ŭ ���̸� ����Ѵ�.


*/
package coding_test_preperation;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _200114_plus_cycle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##"); // �Ҽ��� ù°, ��°�ڸ��� 0�̸� �Ҽ����� ǥ������ ����

		System.out.println("������ �Է��Ͻÿ�");
		int n = sc.nextInt();
		int tmp_n = n; // �Է¹��� �� �ӽ� ����, �������� ���� �����Ǵ� ���� ġȯ�Ͽ� ����
		
		double tmp_old_left = 0; // ���� �� 10�� �ڸ�		
		double tmp_old_right = 0; // ���� �� 1�� �ڸ�
		double tmp_new_right = 0; // ���� �� 1�� �ڸ�
		
		String tmp_old_right_str = ""; // ���� �� 1�� �ڸ� ��Ʈ�� Ÿ��
		String tmp_new_right_str = "";	 // ���� �� 1�� �ڸ� ��Ʈ�� Ÿ��
		String tmp_new_number_str = "";	 // ��Ģ�� ���� ���ο� �� ��Ʈ�� Ÿ��
	    int tmp_new_number = 0; // ��Ģ�� ���� ���ο� �� ��Ʈ��
	    
	    int count_cycle = 0;

		// ���� ����, 0 < n < 100
		if (n < 0 || n >= 100) {
			System.out.println("�����ʰ�");
		} else {
			while(n != tmp_new_number) {
				if(count_cycle > 0) { // ù������ ġȯ���� ����
					tmp_n = tmp_new_number;
				}
						
				tmp_old_left = Math.floor(tmp_n / 10);  // ���� �� ���� 10���ڸ� ����
				tmp_old_right = tmp_n % 10; 			// ���� �� ���� 1���ڸ� ����
				
				tmp_new_right = (tmp_old_left + tmp_old_right) % 10; //���� �� 1���ڸ� ����
				
				// ��Ʈ������ ��ȯ
				tmp_old_right_str = String.valueOf(df.format(tmp_old_right));
				tmp_new_right_str = String.valueOf(df.format(tmp_new_right));	
				
				// ���� ���� �� ��Ʈ������ ��ȯ
				tmp_new_number_str = tmp_old_right_str + tmp_new_right_str;
				tmp_new_number = Integer.parseInt(tmp_new_number_str); 
				
				count_cycle++; // ī��Ʈ ����
			}			
		}

		System.out.println(count_cycle);

		
		sc.close();
	}

}
