package coding_test_preperation;

import java.util.Scanner;

public class _200116_array_cdefgabC {

	public static void main(String[] args) {

		// 입력
		Scanner sc = new Scanner(System.in); // 입력 값 저장
		String[] array = new String[9]; // 배열
		int i = 0; // loop 1
		int j = 0; // loop 2
		int err = 0; // 애러 체크
		int overlap_chk = 0; // 중복 체크
		int ascending_cnt = 0; // 조건 1 카운트
		int descending_cnt = 0; // 조건 2 카운트

		System.out.println("1-8까지 겹치지 않게 입력하세요. 수 구분은 띄어쓰기로 합니다.");
		String num_line = sc.nextLine();

		// 배열 저장
		for (i = 0; i < 8; i++) {
			array[i] = num_line.split(" ")[i];
		}

		// 배열 값 비교, 조건 카운트
		for (i = 0; i < 8; i++) {
			/* 예외처리 시작 */
			// 배열 길이 체크
			if (array.length > 9) {
				err = 1; // 입력 값 범위 초과
				break;
			}
			// 입력 값 예외처리 로직 (1 - 8)
			if (Integer.parseInt(array[i]) < 1 || Integer.parseInt(array[i]) > 9) {
				err = 2; // 입력 값 범위 초과
				break;
			}
			// 중복 값 찾는 로직
			for (j = 0; j < 8; j++) {
				if (Integer.parseInt(array[i]) == Integer.parseInt(array[j])) {
					overlap_chk++;
				}
			}
			if (overlap_chk > 1) {
				err = 3;
				break;
			} else {
				overlap_chk = 0;
			}
			/* 예외처리 종료 */
			
			// 조건 체크 수행
			if (Integer.parseInt(array[i]) == i + 1) { // ascending check
				ascending_cnt++;
			} else if (Integer.parseInt(array[7 - i]) == i + 1) { // descending check
				descending_cnt++;
			}
		}

		if (err > 0) { // 애러 출력
			if (err == 1) {
				System.out.println("배열 길이 초과");
			} else if (err == 2) {
				System.out.println("범위초과");
			} else if (err == 3) {
				System.out.println("중복 값 발견!");
			}
		} else { // 조건에 따른 결과 출력
			if (ascending_cnt == 8) {
				System.out.println("ascending");
			} else if (descending_cnt == 8) {
				System.out.println("descending");
			} else {
				System.out.println("mixed");
			}
		}
		sc.close();
	}

}
