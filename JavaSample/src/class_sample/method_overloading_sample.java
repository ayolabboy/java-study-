package class_sample;

public class method_overloading_sample {

	// method overloading : [같은 이름, 다른 인풋과 아웃풋]으로 매소드를 재정의
	public int plus(int x, int y) {
		return x + y;
	}
	public int plus(int x, int y, int z) {
		return x + y + z;
	}
	public String plus(String x, String y) {		
		return x+y;
	}

}
