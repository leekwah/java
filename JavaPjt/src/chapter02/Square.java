package chapter02;

public class Square {
	public static void main(String[] args) {
		int n = 4;
		//2. ���� �޼ҵ忡�� ���� �޼ҵ带 ȣ���Ѵ�.
		int s = square(n);
		System.out.println(s); // 16�� ��µȴ�.
	}
	//1.���⼭ static int�� ��ȯŸ���� int��� ���̴�.
	//(int length�� �Ű������̴�.)
	public static int square(int length) {
		return length * length;  
	}
}