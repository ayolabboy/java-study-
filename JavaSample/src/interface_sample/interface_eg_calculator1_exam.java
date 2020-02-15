package interface_sample;

public class interface_eg_calculator1_exam {

	public static void main(String[] args) {
		interface_eg_calculator1 cal = new interface_eg_calculator1();

		int test1 = cal.plus(1, 2);
		int test2 = cal.minus(1, 2);		
		int test3 = cal.multi(1, 2);
		
		int test4 = interface_eg_calculator.devide(1,2); // static method »£√‚
		
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
		System.out.println(test4);
		
	}

}
