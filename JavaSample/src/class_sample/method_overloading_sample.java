package class_sample;

public class method_overloading_sample {

	// method overloading : [���� �̸�, �ٸ� ��ǲ�� �ƿ�ǲ]���� �żҵ带 ������
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
