package class_sample;

public class Access_eg {
	public int p1 = 3; // 전체
	protected int p2 = 4; // 같은 패키지 & 다른패키지이지만 상속을 받은 경우
	int p4 = 6; // 디폴트 : 자신과 같은 패키지에서 접근 가능
	/* private int p3 = 5; */ // 자기 자신만 접근 가능
	

}
