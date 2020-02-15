package class_sample;

public class carExam {

	public static void main(String[] args) {
		car c0 = new car();
		car c1 = new car("¸Þ¸£¼¼µ¥½º");
		car c3 = new car(0000);
		car c4 = new car("´Ö»ê",1234);
		
		// c0
		System.out.println(c0.car_name);
		System.out.println(c0.car_num);

		// c1 
		c1.car_name =c1.car_name.concat(" ¹êÃ÷");
		c1.car_num = 1234;		
		System.out.println(c1.car_name);
		System.out.println(c1.car_num);

		// c3
		System.out.println(c3.car_name);
		System.out.println(c3.car_num);
		
		// c4
		System.out.println(c4.car_name);
		System.out.println(c4.car_num);
	}

}
