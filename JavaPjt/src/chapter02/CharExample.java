package chapter02;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '��';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c1); // A ���
		System.out.println(c2); // 65 = UNICODE�� A
		System.out.println(c3); // '��������u'�� 16���� 0041 = 65
		System.out.println(c4); // �� ���
		System.out.println(c5); // UNICODE 44032 = �� 
		System.out.println(c6); // '��������u' 16���� ac00�� 10������ �ٲٸ� 44032�� �ȴ�.
	}
}