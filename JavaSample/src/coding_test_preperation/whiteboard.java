package coding_test_preperation;

public class whiteboard {

	public static void main(String[] args) {

		int[][] goods = new int[][] { { 25400, 2 }, { 10000, 1 }, { 31600, 1 } };
		int[][] coupons = new int[][] { { 5, 3 }, { 23, 2 }, { 11, 2 }, { 9, 5 } };
		
		int[] price_arr = new int[goods.length];

		int i = 0;
		int j = 0;
		
		int err = 0;

		// 가격 입력처리
		for (i = 0; i < goods.length; i++) {
			for (j = 0; j < 2; j++) {			
				
				if(j == 0) { // 가격 만 따로 저장						
					if(goods[i][j] < 100 || goods[i][j] > 100000) { // 입력 예외처리
						err = 1;
						break;
					}					
					price_arr[i] = goods[i][j];	
				}else { // 수량
					if(goods[i][j] < 1 || goods[i][j] > 10) { // 입력 예외처리
						err = 1;
						break;
					}	
				}
			}
		}
		
		// 쿠폰 입력 처리
		for (i = 0; i < coupons.length; i++) {
			for (j = 0; j < 2; j++) {			
				
				if(j == 0) { 					
					if(coupons[i][j] < 1 || coupons[i][j] > 100) { // 입력 예외처리
						err = 1;
						break;
					}						
				}else { // 수량
					if(coupons[i][j] < 1 || coupons[i][j] > 10000) { // 입력 예외처리
						err = 1;
						break;
					}	
				}
			}
		}
		
		System.out.println(err);
		
		
		
		

	}

}
