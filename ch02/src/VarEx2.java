
public class VarEx2 {

	public static void main(String[] args) {
		final int score = 100; // final이 붙었기 때문에 새로운 값을 저장할 수 없음
		// score = 200;
		boolean power = true; // boolean power = 0; 를 넣으면, type mismatch가 뜬다. 
		byte b = 127; // byte b = 128; 는 Error 
		
		int oct = 010; // 8진수, 10진수로 8
		int hex = 0x10; // 16진수, 10진수로 16
		
		long l = 10_000_000_000L; // Long으로 만들어야한다. long l = 10_000_000_000;
		
		float  f = 3.14f; // f는 없애면, Error
		double d = 3.14; // d는 없애도, OK
		
		System.out.println(score);
		System.out.println(power);
		System.out.println(b);
		System.out.println(oct); // 10진수로만 출력된다.
		System.out.println(hex); // 다른 진수로 출력할려면
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		
		// byte b = 100; // OK. byte의 범위( -128 ~ 127에 속함)
		System.out.println(b);
		//변수와 리터럴 타입 불일치
		// int i = 'A'; -> 이유 int > char
		// long l = 123; -> 이유 long > int
		// double d = 3.14f -> 이유 doulbe > float
		// int i = 30_000_000_000_000; -> 이유 int의 범위 (± 20억 벗어남)
		// long l = 3.14f; -> 이유 long < float
		// float f = 3.14d; -> 이유 float < double
		// byte b = 128; // Error. byte의 범위를 벗어남
		
		char ch = 'A'; 
		// char ch = 'AB'은 Error char은 1글자만 가능하다.

		String s = "ABC";
		//String은 자주쓰이는 클래스라서 허용된다.
		String s1 = "AB"; 
		String s2 = new String("AB"); // s1 ≒ s2

		//String s = "A";
		//String s= ""; // 빈 문자열
		// char ch = ''; 는 Error
		// String s1 = "A" + "B" =  "AB"
		// 순서에 따라서 반대의 결과가 나올 수도 있음
		// "" + 7 + 7 -> "" + "7" + "7"-> "7"+"7" -> "77"
		// 7 + 7 + "" -> 7 + 7 + "" -> 14 + "" -> "14"

		// char ch = 'AB'; 와 char ch = ''; 는 Error

		int i = 'A'; // A의 숫자값 65가 나옴

		String str1 = "";
		String str2 = "ABCD"; 
		String str3 = "123";
		String str4 = str2 + str3; 
		System.out.println(i); // A의 ASCII Table No.65가 출력
		System.out.println(str1); // 공백이 나옴
		System.out.println(str2); // ABCD
		System.out.println(str3); // 123
		System.out.println(str4); // str2 + str3인 ABCD123 이 나옴
		// 순서에 따라 반대의 결과가 나오는 것
		System.out.println(""+7+7); // 77이 나옴
		System.out.println(7+7+""); // 14가 나옴
	}

}
