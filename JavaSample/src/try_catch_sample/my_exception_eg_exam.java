package try_catch_sample;

public class my_exception_eg_exam {

	public static void main(String[] args) {
		my_exception_eg service = new my_exception_eg();

		try {
			service.my_method(-1);	
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
