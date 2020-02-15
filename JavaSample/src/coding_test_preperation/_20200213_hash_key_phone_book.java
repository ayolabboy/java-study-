package coding_test_preperation;

import java.util.HashMap;

public class _20200213_hash_key_phone_book {
	public static void main(String[] args) {
		String answer = "";

		String[] phoneBook = new String[] { "123", "12354", "1245" };

		String head = phoneBook[0];
		String phoneNum1 = phoneBook[1];
		String phoneNum2 = phoneBook[2];

		String tmp = new String();

		boolean result1 = true;
		boolean result2 = true;

		int headLength = head.length();
		int Num1Length = phoneNum1.length();
		int Num2Length = phoneNum2.length();
		
		int i = 0;

		for (i = 0; i < Num1Length - headLength + 1; i++) {
			tmp = phoneNum1.substring(i, headLength + i);
			if (tmp.equals(head)) {
				result1 = false;
				break;
			}

		}
		for (i = 0; i < Num2Length - headLength + 1; i++) {			
			tmp = phoneNum2.substring(i, headLength + i);
			if (tmp.equals(head)) {
				result2 = false;
				break;
			}
		}

		System.out.println("result 1 :" + result1);
		System.out.println("result 1 :" + result2);

	}

}
