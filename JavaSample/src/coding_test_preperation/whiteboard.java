package coding_test_preperation;

public class whiteboard {

	public static void main(String[] args) {

		int[][] goods = new int[][] { { 25400, 2 }, { 10000, 1 }, { 31600, 1 } };
		int[][] coupons = new int[][] { { 5, 3 }, { 23, 2 }, { 11, 2 }, { 9, 5 } };
		
		int[] price_arr = new int[goods.length];

		int i = 0;
		int j = 0;
		
		int err = 0;

		// ���� �Է�ó��
		for (i = 0; i < goods.length; i++) {
			for (j = 0; j < 2; j++) {			
				
				if(j == 0) { // ���� �� ���� ����						
					if(goods[i][j] < 100 || goods[i][j] > 100000) { // �Է� ����ó��
						err = 1;
						break;
					}					
					price_arr[i] = goods[i][j];	
				}else { // ����
					if(goods[i][j] < 1 || goods[i][j] > 10) { // �Է� ����ó��
						err = 1;
						break;
					}	
				}
			}
		}
		
		// ���� �Է� ó��
		for (i = 0; i < coupons.length; i++) {
			for (j = 0; j < 2; j++) {			
				
				if(j == 0) { 					
					if(coupons[i][j] < 1 || coupons[i][j] > 100) { // �Է� ����ó��
						err = 1;
						break;
					}						
				}else { // ����
					if(coupons[i][j] < 1 || coupons[i][j] > 10000) { // �Է� ����ó��
						err = 1;
						break;
					}	
				}
			}
		}
		
		System.out.println(err);
		
		
		
		

	}

}
