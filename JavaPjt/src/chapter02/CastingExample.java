package chapter02;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue; //char로 수동 형변환 필요
		System.out.println(charValue); //가 출력
		
		//long longValue=500;
		long longValue=5009998884L;
		intValue = (int)longValue; // 큰 값에서 작은 값으로 가기 때문에, int로 수동 형변환 필요
		System.out.println(intValue); // 715031588 -> long에 대입한 값을 int에 대입할 수 없기에 엉뚱한 값이 출력된다.
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue); //3 출력
	}
}
