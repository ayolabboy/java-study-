package coding_test_preperation;

import java.util.Scanner;

public class _200117_array_devide_42_left {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("���� 10���� �Է��ϼ���, ������ 0 ~ 1,000 �Դϴ�");
		int[] array = new int[10];
		
		int i = 0;
		for (i = 0; i < 10; i++) {
			array[i] = sc.nextInt();
			
			if(array[i] < 0 || array[i] > 1000) { // ���� �ʰ�
				
				
			}
		}

		sc.close();
	}

}
