package chapter02;

public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127; 
		int i = 100;
		System.out.println(b+i); //227 // type = int 
		System.out.println(10/4); //int�� ����߱� ������ int�� 2�� ���´�. 
		System.out.println(10.0/4); //�Ǽ��� 10.0���� ����ϸ�, 2.5�� ��µȴ�. 
		System.out.println(2.9 + 1.8); //4.7 
		System.out.println((int)2.9 + 1.8); //�տ� 2.9�� int�� 2�� �ٲ�� ������ 2 + 1.8 �� �� ���̴�.
		System.out.println((int)(2.9 + 1.8)); //4.7�� int�� �ٲ�� ������ 4�� �ȴ�.
		System.out.println((int)2.9 + (int)1.8); //2 + 1�� �Ǳ⿡ 3�� �ȴ�.
	}
}