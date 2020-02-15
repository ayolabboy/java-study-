package class_sample;

public class string_class {

	public static void main(String[] args) {

		// 둘은 저장 영역이 다르다
		String str = new String("text"); // 참조변수
		String str2 = "text"; 
		
		if(str == str2) {
			System.out.println("두개는 같다");
		}else {
			System.out.println("아니네?");			
		}
		
		String str3 = "test";
		// 문자열의 길이
		int length_3 = str3.length();
		System.out.println(length_3);
		
		// 문자열 결합
		String str4 = str3.concat("ing");
		System.out.println(str4);
		
		// 문자열 자르기
		String str5 = str3.substring(1);
		System.out.println(str5);
		
		String str6 = str3.substring(0,2);
		System.out.println(str6);
	}

}
