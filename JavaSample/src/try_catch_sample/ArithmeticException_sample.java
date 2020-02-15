package try_catch_sample;

public class ArithmeticException_sample {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;


		try {
			int k = i/j;	
			System.out.println(k);
			
		}catch(ArithmeticException e){
			System.out.println("error " + e.toString());
			
		}finally {
			System.out.println("anyway done");
			
		}
	}

}
