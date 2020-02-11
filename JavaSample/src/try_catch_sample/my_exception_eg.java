package try_catch_sample;

public class my_exception_eg {
	public void my_method(int i) throws my_exception{
		System.out.println("start");
		
		if(i < 0) {
			throw new my_exception("parameter can not be lower than 1");
		}
		
		System.out.println("end");
	}
}
