package coding_test_preperation;

import java.util.Scanner;

public class _20200225_math_breakpoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = 0;
		double B = 0;
		double C = 0;
		double break_point = 0;
		
		String err = new String();
		
		System.out.println("연 고정비 (A)를 입력하시오.");	
		A = sc.nextInt();
		
		System.out.println("가변비 (B)를 입력하시오.");
		B = sc.nextInt();
		
		System.out.println("노트북 가격을 입력하시오 (C)를 입력하시오.");
		C = sc.nextInt();
		
		if( C-B < 0 ) {
			err = "판매가는 가변비보다 작을 수 없습니다."; 
		}else {
			break_point = Math.floor((A/(C-B) + 1));	
		}
		
		
		System.out.println(break_point);
		sc.close();

	}

}
