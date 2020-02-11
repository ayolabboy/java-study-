package class_sample;

public class car {

	// Field
	String car_name;
	int car_num;
	
	// 기본 생성자
	public car () {
	}
	
	// 생성자 오버로딩
	// 차이름만 받는 경우
	public car (String name) {
		this.car_name = name;
	}	
	// 차번호만 받는 경우
	public car (int num) {
		this.car_num = num;
	}	
	// 둘다 받는 경우
	public car (String name,int num) {
		this.car_name = name;
		this.car_num = num;
	}
}
