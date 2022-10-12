
public class PrintfEx1 {

	public static void main(String[] args) {
		// System.out.println(10.0/3);
		
		System.out.printf("%d%n", 15); //10
		System.out.printf("%#o%n", 15); //16 // 017
		System.out.printf("%#x%n", 15); //8 // 0xf
		System.out.printf("%s%n", Integer.toBinaryString(15)); // 1111
		
		float f = 123.456789f;
		double g = 123.456789f;
		System.out.printf("%f%n", f); //double �� �ϰ� �Ǹ� ��Ȯ�ϰ� ���´�. 
		System.out.printf("%f%n", g); //double �� �ϰ� �Ǹ� ��Ȯ�ϰ� ���´�. 
		System.out.printf("%e%n", f); 
		System.out.printf("%g%n", f); // �Ҽ��� �����ؼ� 7�ڸ��� �ȴ�.
		
		System.out.printf("[%5d]%n",10); // ���������� ������ �ȴ�.
		System.out.printf("[%-5d]%n",10); // ���������� �ȴ�.
		System.out.printf("[%05d]%n",10); // ������ 0�� �Էµȴ�.
		
		System.out.printf("[%5d]%n",1234567); // ���� ������ �ڸ������� �� ���� ���ڸ� �׳� 1234567�� �� ��µȴ�. 
		
		double d = 1.23456789;
		System.out.printf("%f%n",d); // ���� �������� 7�ε� �ݿø��ؼ� 8�� �Ǿ���.
		System.out.printf("%14.10f%n",d); // 14�ڸ����� �Ҽ��� 10�ڸ��� �Ǿ���. �����ڸ� �� 2�� 00�� �Ҽ� ���ڸ� ���ڸ��� 00�� �Ǿ���.
		System.out.printf("%14.6f%n",d); // 14�ڸ����� �Ҽ��� 6�ڸ��� �Ǿ���.
		System.out.printf("%.6f%n",d); // �Ҽ����� 6�ڸ��� �Ǿ���.

		System.out.printf("[%s]%n", "kwah.dothome.co.kr"); // �⺻������ ������ ����, %d�� ����.
		System.out.printf("[%20s]%n", "kwah.dothome.co.kr"); // 20�ڸ�
		System.out.printf("[%-20s]%n", "kwah.dothome.co.kr"); // �������� ����
		System.out.printf("[%.4s]%n", "kwah.dothome.co.kr"); // 4�ڸ��� ���
	}

}
