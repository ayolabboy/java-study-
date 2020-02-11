package interface_sample;

public interface interface_eg_calculator {
	public int plus(int i, int j);

	public int minus(int i, int j);
	
	default int multi(int i, int j) {
		return i * j;
	}
	
	public static int devide(int i, int j) {
		return i / j;
	}

}
