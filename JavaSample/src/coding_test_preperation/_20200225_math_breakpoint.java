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
		
		System.out.println("�� ������ (A)�� �Է��Ͻÿ�.");	
		A = sc.nextInt();
		
		System.out.println("������ (B)�� �Է��Ͻÿ�.");
		B = sc.nextInt();
		
		System.out.println("��Ʈ�� ������ �Է��Ͻÿ� (C)�� �Է��Ͻÿ�.");
		C = sc.nextInt();
		
		if( C-B < 0 ) {
			err = "�ǸŰ��� �����񺸴� ���� �� �����ϴ�."; 
		}else {
			break_point = Math.floor((A/(C-B) + 1));	
		}
		
		
		System.out.println(break_point);
		sc.close();

	}

}
