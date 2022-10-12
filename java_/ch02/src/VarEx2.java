
public class VarEx2 {

	public static void main(String[] args) {
		final int score = 100; // final�� �پ��� ������ ���ο� ���� ������ �� ����
		// score = 200;
		boolean power = true; // boolean power = 0; �� ������, type mismatch�� ���. 
		byte b = 127; // byte b = 128; �� Error 
		
		int oct = 010; // 8����, 10������ 8
		int hex = 0x10; // 16����, 10������ 16
		
		long l = 10_000_000_000L; // Long���� �������Ѵ�. long l = 10_000_000_000;
		
		float  f = 3.14f; // f�� ���ָ�, Error
		double d = 3.14; // d�� ���ֵ�, OK
		
		System.out.println(score);
		System.out.println(power);
		System.out.println(b);
		System.out.println(oct); // 10�����θ� ��µȴ�.
		System.out.println(hex); // �ٸ� ������ ����ҷ���
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		
		// byte b = 100; // OK. byte�� ����( -128 ~ 127�� ����)
		System.out.println(b);
		//������ ���ͷ� Ÿ�� ����ġ
		// int i = 'A'; -> ���� int > char
		// long l = 123; -> ���� long > int
		// double d = 3.14f -> ���� doulbe > float
		// int i = 30_000_000_000_000; -> ���� int�� ���� (�� 20�� ���)
		// long l = 3.14f; -> ���� long < float
		// float f = 3.14d; -> ���� float < double
		// byte b = 128; // Error. byte�� ������ ���
		
		char ch = 'A'; 
		// char ch = 'AB'�� Error char�� 1���ڸ� �����ϴ�.

		String s = "ABC";
		//String�� ���־��̴� Ŭ������ ���ȴ�.
		String s1 = "AB"; 
		String s2 = new String("AB"); // s1 �� s2

		//String s = "A";
		//String s= ""; // �� ���ڿ�
		// char ch = ''; �� Error
		// String s1 = "A" + "B" =  "AB"
		// ������ ���� �ݴ��� ����� ���� ���� ����
		// "" + 7 + 7 -> "" + "7" + "7"-> "7"+"7" -> "77"
		// 7 + 7 + "" -> 7 + 7 + "" -> 14 + "" -> "14"

		// char ch = 'AB'; �� char ch = ''; �� Error

		int i = 'A'; // A�� ���ڰ� 65�� ����

		String str1 = "";
		String str2 = "ABCD"; 
		String str3 = "123";
		String str4 = str2 + str3; 
		System.out.println(i); // A�� ASCII Table No.65�� ���
		System.out.println(str1); // ������ ����
		System.out.println(str2); // ABCD
		System.out.println(str3); // 123
		System.out.println(str4); // str2 + str3�� ABCD123 �� ����
		// ������ ���� �ݴ��� ����� ������ ��
		System.out.println(""+7+7); // 77�� ����
		System.out.println(7+7+""); // 14�� ����
	}

}
