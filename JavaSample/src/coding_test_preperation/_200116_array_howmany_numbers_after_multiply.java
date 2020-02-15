package coding_test_preperation;

import java.util.Scanner;

public class _200116_array_howmany_numbers_after_multiply {

	public static void main(String[] args) {

		System.out.println("세자리 수 3개를 입력하세요");
		Scanner sc = new Scanner(System.in); // 입력 값 저장
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();		

		int MULTI = A * B * C; // 세 수의 곱		
		String MULTI_str = String.valueOf(MULTI); // 곱한 것 결과 값 스트링으로 변환
		int[] MULTI_array = new int[MULTI_str.length()]; // 배열에 각 자리 수 저장
		int[] MULTI_array_cnt = new int[MULTI_str.length()]; // 숫자 몇 개 쓰였는지 저장 용 배열	
		
		int i = 0; // loop 1
		int j = 0; // loop 2
		
		// 범위 예외처리 (100 < A,B,C < 1000)
		if ((A < 100 || A > 1000) || (B < 100 || B > 1000) || (C < 100 || C > 1000)) {
			System.out.println("범위 초과에요");
		} else {
			for (i = 0; i < MULTI_str.length(); i++) { // 곱 결과 값 길이 만큼 실행
				MULTI_array[i] = Integer.parseInt(MULTI_str.substring(i, i + 1)); // 각 자리 수 저장
				MULTI_array_cnt[i] = 0; // 배열 초기화 
			}			
			// 쓰인 숫자 체크
			for (i = 0; i < MULTI_str.length(); i++) { // 1 ~ 곱 결과 값의 길이만큼 실행
				for (j = 0; j < MULTI_str.length(); j++) { // 1 ~ 곱 결과 값의 길이만큼 실행^2
					if (MULTI_array[i] == j) { // 각 자리 수 쓰인 수 체크 
						MULTI_array_cnt[j]++;
					}
				}
			}
			// 결과 값 출력
			System.out.println("곱셈의 결과 값은 : " + MULTI + "에요");
			for (i = 0; i < MULTI_str.length(); i++) {
				System.out.println(i + "는 " + MULTI_array_cnt[i] + "개 있어요");
			}
		}
		sc.close();
	}

}
