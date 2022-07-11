package chapter02;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : "+intValue); //10은 int값이다.
		//캐스팅으로 자동변환된 것이다.
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("intValue : "+intValue); //44032는 int값이다.
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : "+longValue); //50은 long값이다.

		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : "+floatValue); //100.0은 float값이다.

		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue : "+doubleValue); //100.5은 double값이다.
	}
}
