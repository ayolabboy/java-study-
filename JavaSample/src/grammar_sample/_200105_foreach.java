package grammar_sample;

public class _200105_foreach {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
//		for(int i = 0 ; i< arr.length; i++) {
//			int value = arr[i];
//			System.out.println(value);
//		}
		
		for(int value1 : arr) {
			System.out.println(value1);
		}
		
		
	}

}
