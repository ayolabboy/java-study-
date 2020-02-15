package grammar_sample;

public class _200105_array {
	public static void main(String[] args) {
		
		// e.g1
		int[] array1 = new int[100];
		array1[0] = 50;
		array1[1] = 50;
		
		System.out.println("eg1 : " + array1[0]);

		// e.g2
		int[] array2 = new int[] { 1, 2, 3, 4 };

		System.out.println("eg2 : ");
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		// e.g3
		int [][] array3 = new int[2][2];

		array3[0][0] = 1;
		array3[0][1] = 1;
		array3[1][0] = 1;
		array3[1][1] = 1;

		System.out.println("eg3 : "  + array3[0][0]);		

	}
}
