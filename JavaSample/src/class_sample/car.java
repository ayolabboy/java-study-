package class_sample;

public class car {

	// Field
	String car_name;
	int car_num;
	
	// �⺻ ������
	public car () {
	}
	
	// ������ �����ε�
	// ���̸��� �޴� ���
	public car (String name) {
		this.car_name = name;
	}	
	// ����ȣ�� �޴� ���
	public car (int num) {
		this.car_num = num;
	}	
	// �Ѵ� �޴� ���
	public car (String name,int num) {
		this.car_name = name;
		this.car_num = num;
	}
}
