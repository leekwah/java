package chapter04;

public class ArrayParameterEx {
	static void printCharArray(char a[]) {
		for (int i = 0; i < a.length; i++) {
			// �Ű������� ���� �迭 �ٷ� ���
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	static void replaceCharArray(char a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ' ') {
				a[i]=',';
			}
		}
	}
	
	public static void main(String[] args) {
		// c��� ���ڿ� �迭 ����
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		// �����ִ� �޼��� ȣ�� (��� �޼���)
		printCharArray(c); // This is a pencil.
		
		// if������ �����̽��� ,�� �ٲٴ� replaceCharArray �޼��� ȣ��
		replaceCharArray(c);
		// �ٽ� ��� �޼��� ȣ��
		printCharArray(c); // This,is,a,pencil.
	}
}