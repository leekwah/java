class Ex3_6 {
	public static void main(String args[]) { 
		int a = 10;
		int b = 4;

		System.out.printf("%d + %d = %d%n",  a, b, a + b);
		System.out.printf("%d - %d = %d%n",  a, b, a - b);
		System.out.printf("%d * %d = %d%n",  a, b, a * b);
		System.out.printf("%d / %d = %d%n",  a, b, a / b);
		System.out.printf("%d / %d = %d%n",  a, b, a / b);
		// 10 / 4 = 2.5�� �ƴ� 2�� ������ �ȴ�. (�Ҽ��� ���ϰ� �������� �ȴ�.)
		System.out.printf("%f / %d = %f%n",  (float)a, b, (float)a / b);
		// ���� �߰��� �� ��, �Ʒ��� ��� ���� �Ȱ��� ���´�. a�� ���� float�� �ٲپ���.
		// �μ���ŭ �տ� %f / %d = %f%n�� �߿��ϴ�.
		System.out.printf("%d / %f = %f%n",  a, (float)b, a / (float)b);
		// ������ ���� float�� �ٲ��� -> �׷��� �ؾ��� ������� float�� ���� �� �ִ�.
		// ���ʸ� �ٲ㵵 float���� ���� �� �ִ�.
	}
}