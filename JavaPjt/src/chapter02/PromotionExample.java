package chapter02;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : "+intValue); // 10�� int���̴�.
		// ĳ�������� �ڵ���ȯ�� ���̴�.
		
		char charValue = '��';
		intValue = charValue;
		System.out.println("intValue : "+intValue); // 44032�� int���̴�.
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : "+longValue); // 50�� long���̴�.

		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : "+floatValue); // 100.0�� float���̴�.

		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue : "+doubleValue); // 100.5�� double���̴�.
		
	}
}