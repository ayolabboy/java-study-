package class_sample;

public class method_example {

	public static void main(String[] args) {
		method_sample methody = new method_sample();
		methody.method1();
		methody.method2(1);

		int returnValue3 = methody.method3();
		System.out.println("and return value is "+returnValue3);
		
		methody.method4(1, 2);
		
		int returnValue5 = methody.method5(3);
		System.out.println("and return value is "+returnValue5);
		
	}

}
