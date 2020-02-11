package try_catch_sample;

public class IllegalArgumentException_sample {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		try {
			int k = divide(i, j);
			System.out.println(k);
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.toString());
		}
	}

	public static int divide(int i, int j) throws IllegalArgumentException {
		if (j == 0) {
			throw new IllegalArgumentException("0으로 나눌 수 없어요.");
		}
		
		int k = i / j;
		return k;
	}

}
