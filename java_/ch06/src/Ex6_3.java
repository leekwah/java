class Ex6_3 {
	public static void main(String args[]) { // cv�� ��ü ���� ���� ��� ���� (�ڵ����� ����)
		System.out.println("Card.width = " + Card.width); // cv��
		System.out.println("Card.height = " + Card.height); // cv��

		Card c1 = new Card(); // ��ü�� ������ c1 = kind(heart)�� number(7) 
		c1.kind = "Heart"; // iv��
		c1.number = 7; // iv��

		Card c2 = new Card(); // iv c2 = kind(spade)�� number(4)
		c2.kind = "Spade"; // iv��
		c2.number = 4; // iv��

		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
		System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
		c1.width = 50;
		c1.height = 80; // iv���ƺ�������, c1���� �ٲ�����, c2���� �ٲ������.
		// card.height = 80;
		// card.width = 50; // �̷�������, �������� �ʰ� ������Ѵ�.

		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
	}
}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}