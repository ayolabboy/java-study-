package coding_test_preperation;
import java.util.Scanner;

public class _200112_3times3_midprint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int a_len = (int)(Math.log10(a)+1);
		
		String b = sc.next();
		int b_len = b.length();
		int b_n = Integer.parseInt(b); 

		if (a_len == 3 && b_len == 3) {
			// 문자열 분할
			String b_3th = b.substring(0, 1); 
			String b_2nd = b.substring(1, 2);
			String b_1st = b.substring(2, 3);
			
			int b_3th_n = Integer.parseInt(b_3th); 
			int b_2nd_n = Integer.parseInt(b_2nd);
			int b_1st_n = Integer.parseInt(b_1st);

			int line_1 = b_1st_n * a;
			int line_2 = b_2nd_n * a;
			int line_3 = b_3th_n * a;
			
			System.out.println("   "+ a);
			System.out.println(" x " + b);
			System.out.println("------");

			System.out.println("  "+line_1);
			System.out.println(" "+line_2);
			System.out.println(line_3);	
			System.out.println("------");
			
			System.out.println(a * b_n);

		} else {
			System.out.println("자리수 애러");
		}

		sc.close();

	}

}
