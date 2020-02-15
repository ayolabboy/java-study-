/*
문제
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.

"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 
길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.

출력
각 테스트 케이스마다 점수를 출력한다.

*/
package coding_test_preperation;

import java.util.Scanner;

public class _200121_array_OXOX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 라인 수 입력
		System.out.println("테스트 라인의 수를 입력하시오");
		int total_ln = sc.nextInt(); 
		String[] array = new String[total_ln];		
		
		String cq = "";  // 각 라인에서 현재 문항 임시 저장
		int score_current = 0; // 현재 점수
		int score_sum = 0; // 점수 합산
		int i = 0; // loop 1
		int j = 0; // loop 2	
		
		// OX 저장 loop
		System.out.println("OX라인을 라인 수만큼 입력하시오");		
		for (i = 0; i < total_ln; i++) {
			array[i] = sc.next();
		}

		// 점수 계산 loop
		for (i = 0; i < total_ln; i++) {
			for (j = 0; j < array[i].length(); j++) {
				cq = array[i].substring(j, j + 1);
				if (cq.equals("O")) { // 'O'가 나오면 점수 적립, 연속으로 쌓일 시 등차수열 저장
					score_current++;
					score_sum += score_current; // 합산
				} else { // 'X'가 나오면 보너스 초기화
					score_current = 0;
				}
			}
			// 현 라인 점수 출력 후 변수 초기화
			System.out.println(score_sum);
			score_current = 0;
			score_sum = 0;
		}
		sc.close();
	}

}
