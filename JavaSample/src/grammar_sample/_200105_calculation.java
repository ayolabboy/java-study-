package grammar_sample;

public class _200105_calculation {

	public static void main(String[] args) {
		// ���� ���� 
		double a = 5;
		double b = 6;
		double c;
		double d;

		// ���� ��� 
		a++;
		a+=10;
		a--;
		a = a + 6;
		c = (a + b)/b;
		d = a%c ;
		
		// ���
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		// �񱳹�
		int x = 10;
		int y = 10;
		
		if(x > y) {
			System.out.println("�ʰ� ���ǿ� ���Ե�");
		}
		if(x < y) {
			System.out.println("�̸� ���ǿ� ���Ե�");
		}
		if(x >= y) {
			System.out.println("�̻� ���ǿ� ���Ե�");
		}
		if(x <= y) {
			System.out.println("���� ���ǿ� ���Ե�");
		}
		if(x == y) {
			System.out.println("���� ���ǿ� ���Ե�");
		}
		if(x != y) {
			System.out.println("�ȵ��� ���ǿ� ���Ե�");
		}
		if(x > 1 || y <-1) {
			System.out.println("orr");
		}
		if(x > 1 && y > 1) {
			System.out.println("nrr");
		}
		
	}

}
