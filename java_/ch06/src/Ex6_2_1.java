class Ex6_2_1 {
	public static void main(String args[]) {
		// ��ü���� �ٸ� ��������� ���´�.
		Tv t1 = new Tv();  // Tv t1; t1 = new Tv();�� �� �������� ����
		Tv t2 = new Tv();
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		t1.channel = 7;    // channel ���� 7���� �Ѵ�.
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");

		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	}
}