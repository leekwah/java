package chapter03;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (Exception e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		
	}

	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
//		Class.forName("aaa");
	}
}