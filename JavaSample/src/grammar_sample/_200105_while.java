package grammar_sample;
import java.util.Scanner;

public class _200105_while {
	public static void main(String[] args) {

		int i = 2;

		while (i < 10) {
			/* System.out.println(i); */
			i++;
		}
		
		int j = 3;
		
		// Ű���� �Է� �޴� Ŭ����
		@SuppressWarnings("resource") // �ַ� ��� ����
		
		Scanner scan = new Scanner (System.in);
		System.out.println("���ڸ� �Է��Ͻÿ�1");
		
		do {
			j = scan.nextInt();
			System.out.println(j);
		}while(j != 10);
		
		System.out.println("����");	
		

	}
}
