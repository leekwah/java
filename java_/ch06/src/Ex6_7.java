class Data2 { int x; }

class Ex6_7 {
	public static void main(String[] args) { // ���θ޼ҵ� ȣ��
		Data2 d = new Data2(); // d�� �����, ��ü Data2�� �����Ѵ�.
		d.x = 10; // d�� ����Ű�� ������ x���� 10�� �����Ѵ�.
		System.out.println("main() : x = " + d.x); // main() : x = 10 -> 1��° ���

		change(d); // change �޼ҵ� ȣ�� -> main �޼ҵ� ������ ����
				// d�� ������ �����⿡ �� ����
		System.out.println("After change(d)"); // After change(d) ��� -> println ����
		System.out.println("main() : x = " + d.x); // main() : x = 1000 -> println ����
	} // main �޼ҵ� ���� �� ���� ������� ���α׷� ����

	// ���������� ���ؼ� ��ü d�� ���� ������ �� �־���.
	// ��ü�� �ٷ� �� �ִ� �ּҸ� �ذ��̴�. -> change�޼ҵ忡�� ��ü�� �ٷ� �� �ְ� �ȴ�.
	static void change(Data2 d) { // ������ �Ű������� ���θ޼ҵ��� ���������� d�� ���� ������ �� �־���.
		d.x = 1000;	// d = ��������
		System.out.println("change() : x = " + d.x); // change���� println �ö󰣴�.
		// -> change() : x = 1000 ��� -> println ���� -> change �޼ҵ� ���ư�
	}
}