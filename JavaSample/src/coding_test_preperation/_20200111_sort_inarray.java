package coding_test_preperation;

public class _20200111_sort_inarray {

	public static void main(String[] args) {

		int[] array = new int[] {1,2,3,4,5,6,7};
		int[] cmd_array = new int[] {3,5,3};
		
		// loop
		int i = 0;
		int j = 1;		 

		int start_point = cmd_array[0];
		int end_point = cmd_array[1];
		int target_point = cmd_array[2];

		for (i=0;i<array.length;i++) {		
			if(i >= start_point && i <= end_point) {						
				if(j == target_point) {
					System.out.println (array[i]);	
				}
				j++;				
			}
        }      
        
        
	}

}
