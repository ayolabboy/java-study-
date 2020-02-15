package try_catch_sample;

public class throws_sample {

	public static void main(String[] args) {
		int a = 10;
		int b= 0;
		
		try {
			int k = divide(a,b);	
			System.out.println(k);
			
		}catch(ArithmeticException e){
			System.out.println(e.toString());
			
		}
		
	}
	
	public static int divide(int a, int b) throws ArithmeticException{		
		return a/b;
	}

}
