package chapter02;

public class Cylinder {
	public static void main(String[] args) {
		double r = 7;
		double h = 5;
		// double�� ���� = r�� h�� double�̰�, �Ʒ� return���� double�̱⿡ ���� double�� �����ߴ�.
		double v = volume(r, h); // �޼ҵ�(�Ű�����)
		System.out.println("�������� "+r+"�̰� ���̰� "+h+"�� ������� ���Ǵ� "+v+"�Դϴ�.");
		// �������� 7.0�̰� ���̰� 5.0�� ������� ���Ǵ� 769.6902001294993�Դϴ�.
	}
	// double�� ��ȯŸ���̴�.
	// volume�� �޼ҵ� �̸��̴�. volume(�ȿ��� �Ű����� 2���� ����.)
	public static double volume(double radius, double height) {
		// ��ȯ���� ���� ���� �޼ҵ忡 ���� ���� ���.
		return Math.PI * radius * radius * height; // ������� ����
			}
}