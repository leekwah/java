package chapter02;

public class LongExample {
	public static void main(String[] args) {
		// long var0 = 20f; // f는 정수가 아닌 실수라서 안된다.
		long var1 = 10;
		long var2 = 20L;
		long var3 = 1_000_000_000; 
		long var4 = 10_000_000_000L;
		// L(l)을 넣으면, long type으로 인식한다.
		// 그래서 오류가 나지 않는다.
		// long var5 = 10_000_000_000; 
		// ERROR 이유 = 정수의 범위를 벗어낫기 때문에
		
		System.out.println(var1); // 10
		System.out.println(var2); // 20
		System.out.println(var3); // 1000000000
		System.out.println(var4); // 10000000000
	}
}
