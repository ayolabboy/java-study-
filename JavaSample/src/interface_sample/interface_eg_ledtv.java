package interface_sample;

public class interface_eg_ledtv implements interface_eg_tv {

	@Override
	public void turn_on() {		
		System.out.println("tv on");
	}

	@Override
	public void turn_off() {	
		System.out.println("tv off");	
	}

	@Override
	public void change_volume(int volumn) {		
		System.out.println("volumn set : " + volumn);	
	}

	@Override
	public void change_channel(int channel) {		
		System.out.println("channel set : " + channel);	
	}

}
