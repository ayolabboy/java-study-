/*
����
N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.

���
ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
*/
package coding_test_preperation;
import java.util.Scanner;

public class _200115_array_biggest_smallist {

	public static void main(String[] args) {

		// �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("� �Է����� ���Ͻÿ�.");
		int n = sc.nextInt();
		
		if(n<1 || n> 1000000) { // ���� ����ó��
			System.out.println("���� �ʰ�.");
		}else {
			int i=0;					// loop count
			int[] array = new int[n];	// array 				

			System.out.println("�迭�� ��� ���� ��������." + n + "�� �Է��Ͻø� �˴ϴ�.");			
			for(i=0;i<n;i++) {
				int a = sc.nextInt();
				array[i] = a;			
			}
			// �迭 ù ��° ������ ����
			int tmp_biggest = array[0];
			int tmp_smallest = array[0];
			
			// �ִ�, �ּҰ� ã�� ����
			for(i=1;i<n;i++) { 				
				if(tmp_biggest <= array[i]) {
					tmp_biggest = array[i];
				}				
				if(tmp_smallest >= array[i]) {
					tmp_smallest = array[i];
				}				
			}
			// ���
			System.out.println("�ִ� �� : " + tmp_biggest);
			System.out.println("�ּ� �� : " + tmp_smallest);
		}
		sc.close();
	}

}
