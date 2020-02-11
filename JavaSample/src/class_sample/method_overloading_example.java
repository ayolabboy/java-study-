package class_sample;

public class method_overloading_example {

	public static void main(String[] args) {
		method_overloading_sample m1 = new method_overloading_sample();

		int test1 = m1.plus(1, 2);
		int test2 = m1.plus(1, 2,3);
		String test3 = m1.plus("a", "b");

		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
	}

}
