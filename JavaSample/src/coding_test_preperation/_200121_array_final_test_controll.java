/*
�����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. 

�ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.

���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.

�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����. ��° �ٿ� �������� ���� ������ �־�����. 
�� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.

���
ù° �ٿ� ���ο� ����� ����Ѵ�. ������� ����/��� ������ 10-2���� ����Ѵ�.

*/
package coding_test_preperation;

import java.util.Scanner;

public class _200121_array_final_test_controll {

	public static void main(String[] args) {
		// ������ �� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �Է��Ͻÿ�");
		int total_en = sc.nextInt(); // ������ ��
		float[] array = new float[total_en]; // �迭 ����
		int i = 0; // loop 1
		int zero_chk = 0; // 0�� üũ ����
		String err = ""; // �ַ� �޼��� ����		
		float tmp_biggest = array[0]; // �ִ� �� �ӽ����� 	
		float sum = 0; // ��ü ��
		float avg = 0; // ���

		if (total_en <= 0 || total_en > 100) { // �Է� ���� �ʰ� �ַ�ó��
			err ="���� �� �����ʰ�";			
		} else {
			System.out.println("������ �Է��Ͻÿ�");
			// ���� ����
			for (i = 0; i < total_en; i++) {
				array[i] = sc.nextFloat();
			}
			// ���� ��ȿ�� üũ
			for (i = 0; i < total_en; i++) {
				if (array[i] > 100 || array[i] < 0) { // ���� ���� �ʰ� �ַ�ó��
					err ="���� �����ʰ�";
					break;
				}else if (array[i] == 0) { // 0������ üũ
					zero_chk++;
					if(zero_chk == total_en) { // ������ 0�� �ַ�ó��
						err ="������ 0��";
						break;
					}
				}
			}			
			// �ִ� �� ã�� loop
			for (i = 0; i < total_en; i++) {
				if (tmp_biggest <= array[i]) { // ���� �� ���� ���� �迭�� �ִ� ���� ũ��
					tmp_biggest = array[i]; // �ִ� �� ���� �迭������ ġȯ
				}
			}
			// ���� ���� loop, �ִ� �� �����ϰ�� ���� ����
			for (i = 0; i < total_en; i++) {
				if (tmp_biggest != array[i]) { 
					array[i] = (array[i]/tmp_biggest)*100; 
				}
			}
			// ��� å�� loop
			for (i = 0; i < total_en; i++) {
				sum = sum + array[i];				
			}
			avg = sum / total_en;		
		}
		
		// ��� å��
		if(err != "") {
			System.out.println(err);
		}else {
				System.out.println(sum);	
			
		}
		

		sc.close();
	}

}
