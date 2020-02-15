/*
문제
세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 

입력
첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)

출력
두 번째로 큰 정수를 출력한다.
*/

package coding_test_preperation;

import java.util.Scanner;

public class _200112_print_2nd_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 숫자 받기
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		// 최대, 최소, 중간 값 초기화 
		int big=0;
		int middle=0;
		int small=0;

		if ((num1 < 100 || num2 < 100 || num3 < 100) || (num1 > 0 || num2 > 0 || num3 > 0)) { // 범위제한	
			
			// num1을 다른 두 수와 비교, 가장 크면 num1, 아니면 나머지 두 수 비교
			big = (num1 > num2) && (num1 > num3) ? num1 : (num3 > num2 ? num3 : num2);			
			// num1을 다른 두 수와 비교, 가장 작으면 num1, 아니면 나머지 두 수 비교
			small = (num2 > num1) && (num3 > num1) ? num1 : (num2 > num3 ? num3 : num2);			
			
			// 나머지 입력 값이 중간 값 
			if(big == num1) {
				if(small == num2) {
					middle = num3;
				}else if(small == num3) {
					middle = num2;
				}				
			}else if(big == num2) {
				if(small == num1) {
					middle = num3;
				}else if(small == num3) {
					middle = num1;
				}					
			}else if(big == num3) {
				if(small == num1) {
					middle = num2;
				}else if(small == num1) {
					middle = num2;
				}	
			}
			System.out.println("big is " + big);
			System.out.println("middle is " + middle);
			System.out.println("small is " + small);			

		} else {
			System.out.println("범위초과");
		}
		sc.close();
	}

}
