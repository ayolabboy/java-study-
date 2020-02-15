package interface_sample;

public interface interface_eg_tv {

	// 상수 정의
	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 100;

	public void turn_on();

	public void turn_off();

	public void change_volume(int volumn);

	public void change_channel(int channel);
}
