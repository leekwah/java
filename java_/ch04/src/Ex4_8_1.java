class Ex4_8_1 {
	public static void main(String args[]) {
		for (int i = 1; i <= 10; i=i+2) {// 1���� 10���� 2�� ����
			// ���� 1���� �� �ʿ�� ������, ���ڸ� ���� ���ϰ� �ϱ� ���ؼ� 
			System.out.println("Hello");
		}
		for (int i = 1; i <= 10; i=i*2) {// 1���� 10���� 2�辿 ����
			// for�� �� : ~�ϴ� ���� (������ ���� ����)
			System.out.println("Yeah");
		}
		for (int i = 10; i >= 1; i--) {// ���ۺ��� False��, ������ ���� �ʴ´�.
			// for�� �� : ~�ϴ� ���� (������ ���� ����)
			System.out.println("no");
		}
		for (int i = 1, j = 10; i <= 10; i++, j--) {// ���� 2���� ��� �����ϴ�.
			// ������, ���� type�̿����Ѵ�.
			// for�� �ȿ� ����Ǿ� �ֱ⿡, for�� �ȿ����� ��� �����ϴ�.
			
			System.out.println("i="+i);
		}
		int i;
		for (i = 1; i <= 10; i++) {// ���� i�� �ۿ� ������ ���� �ִ�.
			//���� ����(scope)�� ���� ���� ����. -> �߸��Ǿ��� ��쿡 Ȯ���ؾ��� �� ���� �����̴�.
			System.out.println("sure");
		}
		// ���� �ݺ���
		// for (;;) {
			//System.out.println("hello");
		//}
		// �̰͵� ���� �ݺ����̴�.
		// for (;true;) {
		//System.out.println("hello");
		//}
	}
}