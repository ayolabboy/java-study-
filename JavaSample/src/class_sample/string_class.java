package class_sample;

public class string_class {

	public static void main(String[] args) {

		// ���� ���� ������ �ٸ���
		String str = new String("text"); // ��������
		String str2 = "text"; 
		
		if(str == str2) {
			System.out.println("�ΰ��� ����");
		}else {
			System.out.println("�ƴϳ�?");			
		}
		
		String str3 = "test";
		// ���ڿ��� ����
		int length_3 = str3.length();
		System.out.println(length_3);
		
		// ���ڿ� ����
		String str4 = str3.concat("ing");
		System.out.println(str4);
		
		// ���ڿ� �ڸ���
		String str5 = str3.substring(1);
		System.out.println(str5);
		
		String str6 = str3.substring(0,2);
		System.out.println(str6);
	}

}
