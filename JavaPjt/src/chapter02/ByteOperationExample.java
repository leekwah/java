package chapter02;

public class ByteOperationExample {
	public static void main(String[] args) {
		byte result1 = 10+20;
		System.out.println(result1);
		
		byte x = 10, y = 20;
		//byte result2 = (byte)(x + y); //캐스팅을 하거나, 
		int result2 = x + y; //result2를 int로 바꾼다. 
		System.out.println(result2);
	}
}