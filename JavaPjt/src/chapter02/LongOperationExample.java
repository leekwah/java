package chapter02;

public class LongOperationExample {
	public static void main(String[] args) {
		byte value1 = 10;
		byte value2 = 100;
		//byte value3 = 1000; //byte 범위를 벗어남
		long value3 = 1000; //
		
		int result1 = value1 + value2 + (byte)(value3);
		int result2 = (int)(value1 + value2 + value3);
		System.out.println(result1);
		System.out.println(result2);
	}
}