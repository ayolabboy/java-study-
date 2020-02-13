package coding_test_preperation;

public class _20200213_search_sosu {

	public static void main(String[] args) {

		String numbers = new String();
		numbers = "127";
		String tmp = new String();

		String tmp2 = new String();

		int numLength = numbers.length();

		int i = 0;
		int j = 0;
		int k = 0;

		for (i = 0; i < numLength; i++) {
			for (j = 0; j < numLength - tmp.length() + 1; j++) {
				tmp = numbers.substring(j, j + i + 1);

				for (k = 0; k < tmp.length(); k++) {

				}
				System.out.println(tmp);

			}

		}
	}

	public static String flip(String num) {
		int num_int = Integer.parseInt(num);

		int result = 0;
		while (num_int != 0) {
			result = result * 10 + num_int % 10;
			num_int /= 10;
		}
		String num_str = Integer.toString(result);

		return num_str;
	}

}
