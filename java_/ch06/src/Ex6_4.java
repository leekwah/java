class Ex6_4 {
	public static void main(String args[]) {
		// 2. MyMath ��ü����
		MyMath mm = new MyMath();
		// 3. MyMath ��ü��� (��ü�� �޼��� ȣ��)
		long result1 = mm.add(5L, 3L); // add �޼��� ȣ��
								// 5�� 3�� a�� b�� ����ȴ�.
								// �޼������ ���� �ڿ�, ���� ������ ȣ���� ������ ���ƿ��� �ȴ�.
		long result2 = mm.subtract(5L, 3L); // subtract �޼��� ȣ��
		long result3 = mm.multiply(5L, 3L); // multiply �޼��� ȣ��
		double result4 = mm.divide(5L, 3L); // divide �޼��� ȣ�� 
		// �⺻������ ���� ������ ����ϳ�, �ڵ�����ȯ�� �����ϴ�.
		mm.printGugudan(3); // ������ 3���� ���
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
 }

// 1. MyMathŬ���� ����
class MyMath { // 1. (�޼��� �ۼ�)
	 void printGugudan(int dan) {
			for(int i=1;i<=9;i++) {
					System.out.printf("%d * %d = %d%n", dan, i, dan*i);
			}
 	}

	long add(long a, long b) { // �޼���� Ŭ���� �������� ���� �����ϴ�.
		long result = a + b;
		return result; // �۾��� ��ġ�� ȣ���� ������ ���ƿ´�.
	//	return a + b;	// ���� �� ���� �̿� ���� �� �ٷ� ������ �� �� �ִ�.
						// ���� ���� �ٷ� ��ȯ�ϴ� ���̴�. (�׷���, ���Ŀ��� �ּ��� ���� ó�������ִ�.)
	}
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;
	}
 }
