/*
문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
*/
package coding_test_preperation;
import java.util.Scanner;

public class _200115_array_biggest_smallist {

	public static void main(String[] args) {

		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("몇개 입력할지 정하시오.");
		int n = sc.nextInt();
		
		if(n<1 || n> 1000000) { // 범위 예외처리
			System.out.println("범위 초과.");
		}else {
			int i=0;					// loop count
			int[] array = new int[n];	// array 				

			System.out.println("배열에 담길 수를 넣으세요." + n + "개 입력하시면 됩니다.");			
			for(i=0;i<n;i++) {
				int a = sc.nextInt();
				array[i] = a;			
			}
			// 배열 첫 번째 값으로 세팅
			int tmp_biggest = array[0];
			int tmp_smallest = array[0];
			
			// 최대, 최소값 찾는 루프
			for(i=1;i<n;i++) { 				
				if(tmp_biggest <= array[i]) {
					tmp_biggest = array[i];
				}				
				if(tmp_smallest >= array[i]) {
					tmp_smallest = array[i];
				}				
			}
			// 출력
			System.out.println("최대 값 : " + tmp_biggest);
			System.out.println("최소 값 : " + tmp_smallest);
		}
		sc.close();
	}

}
