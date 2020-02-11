/*
세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 

일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.

예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.

세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 
이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.

출력
첫째 줄에 새로운 평균을 출력한다. 정답과의 절대/상대 오차는 10-2까지 허용한다.

*/
package coding_test_preperation;

import java.util.Scanner;

public class _200121_array_final_test_controll {

	public static void main(String[] args) {
		// 과목의 수 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("과목의 개수를 입력하시오");
		int total_en = sc.nextInt(); // 과목의 수
		float[] array = new float[total_en]; // 배열 선언
		int i = 0; // loop 1
		int zero_chk = 0; // 0점 체크 변수
		String err = ""; // 애러 메세지 저장		
		float tmp_biggest = array[0]; // 최대 값 임시저장 	
		float sum = 0; // 전체 합
		float avg = 0; // 평균

		if (total_en <= 0 || total_en > 100) { // 입력 범위 초과 애러처리
			err ="과목 수 범위초과";			
		} else {
			System.out.println("점수를 입력하시오");
			// 점수 저장
			for (i = 0; i < total_en; i++) {
				array[i] = sc.nextFloat();
			}
			// 점수 유효성 체크
			for (i = 0; i < total_en; i++) {
				if (array[i] > 100 || array[i] < 0) { // 점수 범위 초과 애러처리
					err ="점수 범위초과";
					break;
				}else if (array[i] == 0) { // 0점과목 체크
					zero_chk++;
					if(zero_chk == total_en) { // 전과목 0점 애러처리
						err ="전과목 0점";
						break;
					}
				}
			}			
			// 최대 값 찾는 loop
			for (i = 0; i < total_en; i++) {
				if (tmp_biggest <= array[i]) { // 현재 값 보다 현재 배열에 있는 값이 크면
					tmp_biggest = array[i]; // 최대 값 현재 배열값으로 치환
				}
			}
			// 점수 조작 loop, 최대 값 제외하고는 공식 적용
			for (i = 0; i < total_en; i++) {
				if (tmp_biggest != array[i]) { 
					array[i] = (array[i]/tmp_biggest)*100; 
				}
			}
			// 평균 책정 loop
			for (i = 0; i < total_en; i++) {
				sum = sum + array[i];				
			}
			avg = sum / total_en;		
		}
		
		// 결과 책정
		if(err != "") {
			System.out.println(err);
		}else {
				System.out.println(sum);	
			
		}
		

		sc.close();
	}

}
