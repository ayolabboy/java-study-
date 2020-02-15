package interface_sample;

public class interface_eg_ledtv_exam {

	public static void main(String[] args) {
		interface_eg_ledtv ledtv = new interface_eg_ledtv();
		
		ledtv.turn_on();
		ledtv.turn_off();
		ledtv.change_volume(10);
		ledtv.change_channel(7);
	}

}
