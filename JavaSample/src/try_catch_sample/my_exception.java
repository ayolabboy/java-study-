package try_catch_sample;

@SuppressWarnings("serial")
public class my_exception extends RuntimeException {
	public my_exception(String msg) {
		super(msg);
	}
	public my_exception(Exception e) {
		super(e);
	}	
	
}
