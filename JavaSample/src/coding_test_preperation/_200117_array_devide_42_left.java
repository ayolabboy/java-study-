package coding_test_preperation;

import java.util.Scanner;

public class _200117_array_devide_42_left {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 10개를 입력하세요, 범위는 0 ~ 1,000 입니다");
		int[] array = new int[10];
		
		int i = 0;
		for (i = 0; i < 10; i++) {
			array[i] = sc.nextInt();
			
			if(array[i] < 0 || array[i] > 1000) { // 범위 초과
				
				
			}
		}

		sc.close();
	}

}
