/*
문제
0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 
먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 
그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.

26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 
새로운 수는 26이다.

위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.

N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.

출력
첫째 줄에 N의 사이클 길이를 출력한다.


*/
package coding_test_preperation;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _200114_plus_cycle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##"); // 소수점 첫째, 둘째자리가 0이면 소수점을 표시하지 않음

		System.out.println("정수를 입력하시오");
		int n = sc.nextInt();
		int tmp_n = n; // 입력받은 값 임시 저장, 루프에서 새로 생성되는 수로 치환하여 저장
		
		double tmp_old_left = 0; // 변경 전 10의 자리		
		double tmp_old_right = 0; // 변경 전 1의 자리
		double tmp_new_right = 0; // 변경 후 1의 자리
		
		String tmp_old_right_str = ""; // 변경 전 1의 자리 스트링 타입
		String tmp_new_right_str = "";	 // 변경 후 1의 자리 스트링 타입
		String tmp_new_number_str = "";	 // 규칙에 따른 새로운 수 스트링 타입
	    int tmp_new_number = 0; // 규칙에 따른 새로운 수 인트형
	    
	    int count_cycle = 0;

		// 범위 제한, 0 < n < 100
		if (n < 0 || n >= 100) {
			System.out.println("범위초과");
		} else {
			while(n != tmp_new_number) {
				if(count_cycle > 0) { // 첫바퀴는 치환하지 않음
					tmp_n = tmp_new_number;
				}
						
				tmp_old_left = Math.floor(tmp_n / 10);  // 변경 전 수의 10의자리 추출
				tmp_old_right = tmp_n % 10; 			// 변경 전 수의 1의자리 추출
				
				tmp_new_right = (tmp_old_left + tmp_old_right) % 10; //변경 후 1의자리 추출
				
				// 스트링으로 변환
				tmp_old_right_str = String.valueOf(df.format(tmp_old_right));
				tmp_new_right_str = String.valueOf(df.format(tmp_new_right));	
				
				// 숫자 결합 후 인트형으로 변환
				tmp_new_number_str = tmp_old_right_str + tmp_new_right_str;
				tmp_new_number = Integer.parseInt(tmp_new_number_str); 
				
				count_cycle++; // 카운트 증가
			}			
		}

		System.out.println(count_cycle);

		
		sc.close();
	}

}
