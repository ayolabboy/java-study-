/*
����
�� ���� A, B, C�� �־�����. �̶�, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 

�Է�
ù° �ٿ� �� ���� A, B, C�� �������� ���еǾ� �־�����. (1 �� A, B, C �� 100)

���
�� ��°�� ū ������ ����Ѵ�.
*/

package coding_test_preperation;

import java.util.Scanner;

public class _200112_print_2nd_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ���� �ޱ�
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		// �ִ�, �ּ�, �߰� �� �ʱ�ȭ 
		int big=0;
		int middle=0;
		int small=0;

		if ((num1 < 100 || num2 < 100 || num3 < 100) || (num1 > 0 || num2 > 0 || num3 > 0)) { // ��������	
			
			// num1�� �ٸ� �� ���� ��, ���� ũ�� num1, �ƴϸ� ������ �� �� ��
			big = (num1 > num2) && (num1 > num3) ? num1 : (num3 > num2 ? num3 : num2);			
			// num1�� �ٸ� �� ���� ��, ���� ������ num1, �ƴϸ� ������ �� �� ��
			small = (num2 > num1) && (num3 > num1) ? num1 : (num2 > num3 ? num3 : num2);			
			
			// ������ �Է� ���� �߰� �� 
			if(big == num1) {
				if(small == num2) {
					middle = num3;
				}else if(small == num3) {
					middle = num2;
				}				
			}else if(big == num2) {
				if(small == num1) {
					middle = num3;
				}else if(small == num3) {
					middle = num1;
				}					
			}else if(big == num3) {
				if(small == num1) {
					middle = num2;
				}else if(small == num1) {
					middle = num2;
				}	
			}
			System.out.println("big is " + big);
			System.out.println("middle is " + middle);
			System.out.println("small is " + small);			

		} else {
			System.out.println("�����ʰ�");
		}
		sc.close();
	}

}
