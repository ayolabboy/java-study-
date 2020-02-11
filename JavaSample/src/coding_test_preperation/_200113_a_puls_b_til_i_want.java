package coding_test_preperation;
import java.util.Scanner;

public class _200113_a_puls_b_til_i_want {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇개를 찍을거에요?");	
		int a = sc.nextInt();
		int cnt = 0;
		
		for(cnt=0; cnt<a;cnt++) {
			System.out.println("두 수를 입력해주세요");
			int b = sc.nextInt();
			int c = sc.nextInt();			

			System.out.println(b+c);			
		}	
		System.out.println("출력 종료");		
		sc.close();

	}

}
