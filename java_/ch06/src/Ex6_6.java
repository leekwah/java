class Data { int x; } // ��ü Data�� Ÿ���� int x�̴�.

class Ex6_6 {
	public static void main(String[] args) { // (1�� ����)
		Data d = new Data(); // �������� d�� ���������. �׸���, new Data��ü�� �����Ѵ�.
		d.x = 10; // d.x�� ���� 10���� �ٲ۴�.
		System.out.println("main() : x = " + d.x); // main() : x = 10���� ��µȴ�. -> 1��°�� ���� 

		change(d.x); // change�޼ҵ� ȣ�� -> d.x���� �ؿ� change(int x)�� ����ȴ�.
		System.out.println("After change(d.x)"); // 3��°�� ����
		System.out.println("main() : x = " + d.x); // 4��°�� ����
	} // ���θ޼ҵ� ���ÿ��� ���� �� ���α׷� ����

	static void change(int x) {  // �⺻�� �Ű����� int (�б⸸ �����ϴ�)
								// ���� �ٲٰ� �;��ٸ�, �⺻�� �Ű����� int�� ���������� �ٲٸ� �ȴ�.
		x = 1000; // 1000�� x�� ���� �ȴ�. ������, ������ x�� �̸��� ���� ���������̴�.
		System.out.println("change() : x = " + x); // change() : x = 1000���� ��� -> 2��°�� ����
	}
}