package grammar_sample;

public class _200105_if {

	public static void main(String[] args) {
		int x = 500;
		int y = 600;
		
		// if
		if (x == y) {

		} else if (x > y) {

		} else if (x < y) {

		} else {

		}

		if (x != y) {

		} else if (x >= y) {

		} else if (x <= y) {

		} else {

		}

		if (x < 10 && y > 500) {

		} else if (x < 10 || y > 500) {

		}
		
		// »ïÇ× ¿¬»êÀÚ 
		int tri_result1 = (x == y) ? 1 : 0;
		int tri_result2 = (x != y) ? 1 : 0;
		int tri_result3 = (x >= y) ? 1 : 0;
		int tri_result4 = (x <= y) ? 1 : 0;
 
		System.out.println(tri_result1);
		System.out.println(tri_result2);
		System.out.println(tri_result3);
		System.out.println(tri_result4);


	}

}
